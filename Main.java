package threadex;
class Task extends Thread{
	public void run() {
	    for(int i=1;i<=5;i++) {
	        System.out.println(Thread.currentThread().getName());
	        try {
	            Thread.sleep(1);
	        } catch(Exception e) {}
	    }
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t1=new Task();
		
		
		
		t1.start();
		try {
		t1.start();
		}catch(Exception e) {
			System.out.println("Thread cannot be executed twice");
		}

	}

}
