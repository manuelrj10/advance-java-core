package threadex;


class ThreadF extends Thread{
	public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("i="+i);
		try {
		Thread.sleep(1000);
	}
		catch(InterruptedException e) {
            e.printStackTrace();
        }
}
}
}
public class JoinRunThreaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadF th=new ThreadF();
		th.start();
		try {
		th.join();
		}
		catch(InterruptedException e) {
            e.printStackTrace();
        }
		for(int i=0;i<5;i++) {
			System.out.println("hi manuel"+i);
		

	}

}
}

