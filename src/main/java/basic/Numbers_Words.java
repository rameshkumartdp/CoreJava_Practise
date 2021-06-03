package basic;

/**
 * Created by rk0000 on 6/6/18.
 */
public class Numbers_Words {

    static void pw(int number, String value) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" ,"ten" , "eleven" ,"twelve", "thirteen", "fourteen", "fifteen",
        "sixteen" ,"Seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "fourty", "fifty" ,"sixty", "seventy", "eighty", "ninety"};
        if(number > 19) {
            System.out.print(tens[number/10] + " " + ones[number%10]);
        }
        if(number < 19) {
            System.out.print(ones[number]);
        }
        if(number > 0) {
            System.out.print(" " + value + " ");
        }
    }

    public static void main(String[] args) {
        int number = 1_23_456;
        pw((number/1_00_00_000)%100, "Crore");
        pw((number/1_00_000)%100, "Lakh");
        pw((number/1_000)%100, "Thousand");
        pw((number/1_00)%10, "Hundred");
        pw((number%1_00), "");
    }
}
