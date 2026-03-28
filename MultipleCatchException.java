package exeptionX;

public class MultipleCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int ans=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arthematic Exception");
		}
		catch(ArrayIndexOutOfBoundsException ep) {
			System.out.println("out of bound");
		}
		catch(Exception ex) {
			System.out.println("Exception");
		}
		finally {
			System.out.println("hi");
		}

	}

}
