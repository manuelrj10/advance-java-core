package regexexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String line=sc.nextLine();
		String checkdigit="\\d";
		System.out.println("is it valid: "+Pattern.matches("[a-zA-Z0-9]{6}",line));
		

	}

}
