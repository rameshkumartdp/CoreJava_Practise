package collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Demo {

	public static void main(String[] args) {
		SimpleDateFormat sdf  = new SimpleDateFormat("dd-MMM-yyyy HH:mm:SSSZ");
		System.out.println(sdf.format(new Date()));
		try {
			System.out.println(sdf.parse("04041989"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(new java.util.Date());
		System.out.println(new java.sql.Date(12));

	}

}
