package threadex;

class dThread extends Thread{
	dThread(String name){
		super(name);
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+"is deamon thread");
		}
		else {
			System.out.println(getName()+"is not deamon thread");
		}
	}
}

public class DeamonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dThread d1=new dThread("thread 1");
		dThread d2=new dThread("thread 2");
		d1.setDaemon(true);
		d1.start();
		d2.start();

	}

}
