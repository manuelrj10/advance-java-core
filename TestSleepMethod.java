package threadex;

public class TestSleepMethod extends Thread{
	
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
				}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSleepMethod t1=new TestSleepMethod();
		TestSleepMethod t2=new TestSleepMethod();
		TestSleepMethod t3=new TestSleepMethod();
		TestSleepMethod t4=new TestSleepMethod();
		TestSleepMethod t5=new TestSleepMethod();
		TestSleepMethod t6=new TestSleepMethod();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		

	}

}
