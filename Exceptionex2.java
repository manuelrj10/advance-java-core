package exeptionX;

import java.util.Scanner;

public class Exceptionex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("eneter a string");
			String str=sc.nextLine();
			System.out.println("length"+str.length());
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
		}

	}

}
