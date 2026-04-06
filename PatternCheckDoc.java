package regexexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternCheckDoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String line=sc.nextLine();
		System.out.println("enter the pattern");
		String pattern=sc.nextLine();
		boolean flagout=Pattern.matches(pattern, line);
		System.out.println("flagout"+flagout);

	}

}
