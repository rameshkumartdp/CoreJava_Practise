package basic;

import java.util.Scanner;

public class Scanner_Demo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter value");
		//String str = scr.nextLine();
		System.out.println("Value is  "+ scr.nextLine());
		scr.close();
	}

}
