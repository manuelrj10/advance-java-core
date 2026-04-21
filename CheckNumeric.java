package regexexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckNumeric {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numeric string");
		String num=sc.next();
		boolean flag=Pattern.matches("\\d+", num);
		if(flag) {
			System.out.println("valid phno");
		}
		else {
			System.out.println("invalid");
		}
		

	}

}
