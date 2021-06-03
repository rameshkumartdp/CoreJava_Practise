package designPatterns;

import java.util.Observable;
import java.util.Observer;

class Principal implements Observer {
    @Override
    public void update(Observable observable, Object obj) {
        System.out.println("Principal Observing ---->  "+obj);
    }
}

class HOD implements Observer {
    @Override
    public void update(Observable observable, Object obj) {
        System.out.println("HOD Observing ---->  "+obj);
    }
}

class Student extends Observable {
    public void setMarks(int marks) {
        setChanged();
        if(marks < 50) {
            notifyObservers(marks);
        }
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        Principal principal = new Principal();
        HOD hod = new HOD();
        Student student = new Student();
        student.addObserver(principal);
        student.addObserver(hod);
        student.setMarks(45);
    }
}