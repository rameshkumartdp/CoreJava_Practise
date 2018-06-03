package basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Demo {

	public static void main(String[] args) {
		String str = "12383567324";
		String regex = "^[0-9]*$";
		Pattern ptr = Pattern.compile(regex);
		Matcher match = ptr.matcher(str);
		if(match.matches()) {
			System.out.println("CORRECT");
		} else {
			System.out.println("WRONG");
		}
	}

}
