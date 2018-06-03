package streams;

import java.io.PrintWriter;

public class PrintWriter_Demo {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("HEllo");
		pw.write("Hi");
		System.out.println("JAVA");
		int val = 120;
		System.out.printf("VALUE is---->  "+val);
	}

}
