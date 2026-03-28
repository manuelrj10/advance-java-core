package exeptionX;

public class ArrayIndexEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,56};
		System.out.println("Array is "+arr);
		
		try {
			arr[10]=80;
			System.out.println(arr[10]);
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
		}

	}

}
