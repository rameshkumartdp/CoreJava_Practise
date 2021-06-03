package util;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timer_Demo extends TimerTask {
    public void run() {
        System.out.println("Threads running @ " + new Date());
    }
}

class Run_Task {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new Timer_Demo(), 100, 3000);
    }
}
