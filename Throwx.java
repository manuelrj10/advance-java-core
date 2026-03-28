package exeptionX;

public class Throwx {
	
	void checkAge(int age )throws ArithmeticException{
		if(age<18) {
		throw new ArithmeticException("Not eligible to vote");
	}
	else {
		System.out.println("welcome your eligible");
		System.out.println("Age validation succeaa proceed to next step");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwx obj =new Throwx();
		System.out.println("hi user please check your age");
		
		try {
			obj.checkAge(2);
		}
		catch(ArithmeticException a) {
			a.printStackTrace();
		}finally {
			System.out.println("Thank you");
		}

	}

}
