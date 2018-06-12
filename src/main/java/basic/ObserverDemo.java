package basic;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by rk0000 on 6/13/18.
 */

class Principal implements Observer{
    public void update(Observable obs, Object obj){
        System.out.println("Principal observing   "+obj);
    }
}

class HOD implements Observer{
    public void update(Observable obs, Object obj){
        System.out.println("HOD observing   "+obj);
    }
}

class Student extends Observable {

    public void marks(int m) {
        setChanged();
        if(m<40) {
            notifyObservers(m);
        }
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        Principal pl = new Principal();
        HOD hod = new HOD();
        Student st = new Student();
        st.addObserver(pl);
        st.addObserver(hod);
        st.marks(50);
    }
}
