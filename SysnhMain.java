package threadex;


class thread1 extends Thread{
	Mtable t;
	thread1(Mtable t){
		this.t=t;
	}
	public void run() {
		t.mutliplaictionTable(5);
	}
	
	
	
}
class thread2 extends Thread{
	Mtable t;
	thread2(Mtable t){
		this.t=t;
	}
	public void run() {
		t.mutliplaictionTable(10);
	}
}

public class SysnhMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mtable obj=new Mtable();
		thread1 th1=new thread1(obj);
		thread2 th2=new thread2(obj);
		
		
		th1.start();
		th2.start();
	}

}
