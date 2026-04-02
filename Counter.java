package threadex;

public class Counter {
	int count=0;
	
	synchronized void increement() {
		count+=1000;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c=new Counter();
		new Thread(()->c.increement()).start();
		new Thread(()->c.increement()).start();
		new Thread(()->c.increement()).start();
		

	}

}
