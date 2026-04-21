package regexexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalRegex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string with Capityal");
		String str=sc.nextLine();
		
		Pattern pattern=Pattern.compile("\\b[A-Z][a-z]*\\b");
		Matcher matcher=pattern.matcher(str);
		while(matcher.find()) {
			System.out.println("String is"+matcher.group());
		}

	}

}
