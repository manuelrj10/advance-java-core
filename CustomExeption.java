package exeptionX;

class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
}
public class CustomExeption {
	void checkAge(int age )throws InvalidAgeException{
		if(age<18) {
		throw new InvalidAgeException("Not eligible to vote");
	}
	else {
		System.out.println("welcome your eligible");
		System.out.println("Age validation succeaa proceed to next step");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomExeption obj =new CustomExeption();
		System.out.println("hi user please check your age");
		
		try {
			obj.checkAge(2);
		}
		catch(InvalidAgeException a) {
			a.printStackTrace();
		}finally {
			System.out.println("Thank you");
		}
		

	}

}
