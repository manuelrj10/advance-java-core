package methodreferncepack;

@FunctionalInterface
interface Test{
	public void add(int first,int second);
}

class AddDemo{
	public void sum(int one,int two) {
		System.out.println("sum "+(one+two));
	}
}

public class InstanceMethodRefereence {

	public static void main(String[] args) {
		AddDemo ad=new AddDemo();
		
		
		Test t=ad::sum;
		t.add(10, 20);
		
		Test t1=(one,two)->System.out.println("sum :" +(one+two));
		t1.add(10,20);
		
		

	}

}
