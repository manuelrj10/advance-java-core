package regexexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhnoCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter the phno");
		//int phno=sc.nextInt();
		//8System.out.println("is phno valid "+Pattern.matches("^[6-9]\\d{9}$",phno));
		System.out.println("is phno valid "+Pattern.matches("^[6-9]\\d{9}$","8281809178"));
		System.out.println("is phno valid "+Pattern.matches("^[6789][0-9]{9}$","828180j9178"));

	}

}
