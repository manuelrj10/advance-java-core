package regexexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String line=sc.nextLine();
		String checkdigit="\\d";
		System.out.println("digit present"+Pattern.matches(checkdigit,line));
		String checkalpa="\\D";
		System.out.println("non digit present"+Pattern.matches(checkalpa,line));
		
	
		
	}

}
