import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8GroupingBy {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2, 3, 1, 4, 6, 5, 7, 8, 9, 1, 8);

        Map<Integer, List<Integer>> numbersMap = numberList.stream().collect(Collectors.groupingBy(Integer::intValue));
        System.out.println(numbersMap);
        System.out.println("---------------------------- ");

        List<Integer> list = numbersMap.values().stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("---------------------------- ");

        List<Integer> sortedList = numberList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println("---------------------------- ");


        Map<Integer, Long> numbersMap1 = numberList.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        System.out.println(numbersMap1);
        System.out.println("---------------------------- ");

        numbersMap1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("---------------------------- ");


        List<String> stringList = Arrays.asList("Tom", "Jerry", "Spike", "Tyke", "Butch", "Toodles", "Tom");
        Map<Integer, List<String>> stringMap = stringList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(stringMap);
        System.out.println("---------------------------- ");

        Map<String, List<String>> stringMap2 = stringList.stream().collect(Collectors.groupingBy(String::new));
        System.out.println(stringMap2);
        System.out.println("---------------------------- ");


        Map<String, Long> stringMap1 = stringList.stream().collect(Collectors.groupingBy(String::new, Collectors.counting()));
        System.out.println(stringMap1);
        System.out.println("---------------------------- ");


        List<Employee> employeeList = Arrays.asList(new Employee("Tom", 100, "Coding"),
                                                    new Employee("Jerry", 200, "IT"),
                                                    new Employee("Spike", 800, "Services"),
                                                    new Employee("Tyke", 500, "Coding"),
                                                    new Employee("Toodles", 600, "HR"),
                                                    new Employee("Quacker", 400, "IT"));

        Map<String, List<Employee>> empMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
        empMap.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println("---------------------------- ");

        Map<String, Long> empMap1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(empMap1);
        System.out.println("---------------------------- ");

        Map<String, Optional<Employee>> empMap2 = employeeList.stream().collect(
                                                    Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        empMap2.forEach((k, v ) -> System.out.println(k + " - " + v.get()));
        System.out.println("---------------------------- ");

        OptionalDouble maxSalary = employeeList.stream().mapToDouble(Employee::getSalary).max();
        System.out.println(maxSalary.getAsDouble());

//        Map<String, List<String>> map1 = employeeList.stream().collect(
//                Collectors.groupingBy(Employee::getDepartment, Collectors.filtering(x -> (Employee::new)), Collectors.toList()));

    }
}

class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
