package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by rk0000 on 6/21/18.
 */
public class Comparator_Demo {
    public static void main(String[] args) {
        Student sd1 = new Student(132228, "Ramesh", 38000);
        Student sd2 = new Student(132222, "Sony", 23000);
        Student sd3 = new Student(130967, "Sow", 22000);
        List<Student> studentList = Arrays.asList(sd1,sd2,sd3);
        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.name.compareTo(o1.name);
            }
        };
        Collections.sort(studentList, comp);
        studentList.forEach((Student obj) -> System.out.println(obj.getName()+" "+obj.getRollNo()+" "+obj.getMarks()));
    }
}

class Student {
    int rollNo;
    String name;
    double marks;
    Student(int rollNo, String name, double marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}
