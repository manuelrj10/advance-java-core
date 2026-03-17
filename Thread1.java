package threadex;


class thread0d extends Thread{
	public void run() {
		System.out.println("Thread is working");
		super.run();
		
	}
	
}

public class Thread1 {
	public static void main(String args[]) {
		thread0d th=new thread0d();
		th.start();
		System.out.println("outside thread");
	}

}
