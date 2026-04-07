package regexexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurenceCheck {

	public static void main(String[] args) {
		
		
		Pattern pattern=Pattern.compile("manuel", Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("hi my name is manuel");
		boolean flag=matcher.find();
		if(flag) {
			System.out.println("pattern found");
		}
		else {
			System.out.println("pattern not found");
		}
		
		
		

	}

}
