package exeptionX;

import java.util.Scanner;

public class ExeptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the divisor");
		int num=sc.nextInt();
		System.out.println("enter the divident");
		int nn=sc.nextInt();
		System.out.println("Mathematical Operation");
		try {
			int out=num/nn;
			System.out.println("out ="+out);
		}
		catch(ArithmeticException a) {
			System.out.println("Exeption "+a);
		}
		
		System.out.println("thank u");
		
	}

}
