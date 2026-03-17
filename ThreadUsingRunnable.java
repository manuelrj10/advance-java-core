package threadex;

class thread2 implements Runnable{
	public void run() {
		System.out.println("Thread 2 using runnable function");
		
		
	}
}

public class ThreadUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread2 t2 =new thread2();
		Thread obj =new Thread(t2);
		obj.start();
		

	}

}
