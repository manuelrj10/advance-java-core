package exeptionX;

import java.util.Scanner;

public class markException {
	void Mark(int mark) throws Exception{
		if(mark<40) {
			throw new Exception("yor failed bitch");
		}
		else {
			System.out.println("you have passed the test");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		markException mar=new markException();
		
		try {
			mar.Mark(marks);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("thank you");
		}
		

	}

}
