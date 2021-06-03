package threads;

/**
 * Created by Ramesh on 030 30.May.21.
 */
class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");
        if(this.amount<amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed... ");
        notify();
    }
}

public class Synchronized_Demo {
    public static void main(String args[]) {
        final Customer customer = new Customer();
        new Thread(){
            public void run() {
                customer.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run() {
                customer.deposit(10000);
            }
        }.start();
    }
}
