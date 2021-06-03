package basic;

public class Pract6 {
    public static void main(String args[]) {
        int min = 0;
        min(10, 20, min);
        System.out.println(min);
    }

    public static void min(int number1, int number2, int min) {
        if(number1 > number2)
            min = number1;
        else
            min = number2;
    }
}
