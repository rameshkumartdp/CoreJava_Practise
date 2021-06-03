package streams;

import java.io.*;

/**
 * Created by rk0000 on 6/13/18.
 */
public class SerializeDemo {
    public static void main(String[] args) throws Exception{
        Student st1 = new Student("Ramesh", 132228);
        Student st2 = new Student("Sony", 132222);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\My Docs\\Projects\\Projects\\Practise\\src\\main\\resources\\output.txt"));
        oos.writeObject(st1);
        oos.writeObject(st2);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\My Docs\\Projects\\Projects\\Practise\\src\\main\\resources\\output.txt"));
        while(true) {
            try {
                Student stu = (Student) ois.readObject();
                long serialVersionUID = ObjectStreamClass.lookup(Student.class).getSerialVersionUID();
                System.out.println("serialVersionUID--->  "+serialVersionUID);
                System.out.println(stu.getName());
            } catch(EOFException e) {
                break;
            }
        }
        ois.close();
    }
}

class Student implements Serializable{
    private static final long serialVersionUID = 68265620232169641L;
    private String name;
    private int rollNo;
    public Student(String name, int roll) {
        this.name=name;
        this.rollNo=roll;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}
