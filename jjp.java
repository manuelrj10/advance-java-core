package threadex;

class MyThread implements Runnable {
    public void run() {
        System.out.println("Task running");
    }
}

public class jjp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th=new MyThread();
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
		t1.start();
		t2.start();
		
		
		
		

	}

}
