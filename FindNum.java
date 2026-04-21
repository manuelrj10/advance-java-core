package regexexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string with numbers");
		String str=sc.nextLine();
		
		Pattern pattern=Pattern.compile("\\d+");
		Matcher matcher=pattern.matcher(str);
		while(matcher.find()) {
			System.out.println("number is"+matcher.group());
		}

	}

}
