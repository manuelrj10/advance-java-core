package threadex;


class thread1 extends Thread{
	
	public void run() {
		Mtable.mutliplaictionTable(5);
	}
	
	
	
}
class thread2 extends Thread{
	
	public void run() {
		Mtable.mutliplaictionTable(10);
	}
}

public class SysnhMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thread1 th1=new thread1();
		thread2 th2=new thread2();
		
		
		th1.start();
		th2.start();
	}

}
