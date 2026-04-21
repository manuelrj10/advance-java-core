package regexexp;

import java.util.regex.Pattern;

public class DateRegex {

	public static void main(String[] args) {
		boolean flag=Pattern.matches("^(\\d{2})/(\\d{2})/(\\d{4})$","10/10/2002");
		if(flag) {
			System.out.println("valid date");
		}
		else {
			System.out.println("invalid");
		}


	}

}
