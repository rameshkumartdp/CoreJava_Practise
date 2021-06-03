package basic;

import java.text.SimpleDateFormat;

public class Date_Demo {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SSS");
		System.out.println(sdf.format(new java.util.Date()));
		System.out.println(new java.util.Date());
		System.out.println(new java.sql.Date(1000).getTime());
	}
}
