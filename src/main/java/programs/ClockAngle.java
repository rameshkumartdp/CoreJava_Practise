package programs;

/**
 * Created by Ramesh on 006 06.Jun.21.
 */
public class ClockAngle {
     public static int findAngle(int hour, int min) {
        int h = (hour*360)/12 + (min*360)/(12 * 60);
        int m = (min*360)/60;
        int angle = Math.abs(h - m);
        if (angle > 180) {
            angle = 360 - angle;
        }
        return angle;
    }

    public static void main(String[] args) {
        int hour = 6;
        int min = 30;
        System.out.print(findAngle(hour, min));
    }
}

