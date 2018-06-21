package basic;

/**
 * Created by rk0000 on 6/6/18.
 */
public class Numbers_Words {

    public static void pw(int number, String value) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                         "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if(number > 19) {
            System.out.print(tens[number/10]+" "+ones[number%10]+" ");
        } else {
            System.out.print(ones[number]+" ");
        }
        if(number > 0) {
            System.out.print(value+" ");
        }
    }

    public static void main(String[] args) {
        int input = Integer.parseInt(new java.util.Scanner(System.in).next());
        pw((input/1_00_00_000)%100, "crore");
        pw((input/1_00_000)%100, "lakhs");
        pw((input/1_000)%100, "thousand");
        pw((input/100)%10, "hundred");
        pw(input%100, "");
    }
}
