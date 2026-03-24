package threadex;


public class OddEven {
	int num=1;
	int max=20;
	synchronized void even(){
		while(num<=max) {
			if(num%2!=0) {
				try {
					wait();
				}
				catch(Exception e) {}
			}
			else {
				System.out.print(" "+num);
				num++;
				notify();
			}
		}
		
	}
	synchronized void odd() {
		while(num<=max) {
			if(num%2==0) {
				try {
					wait();
				}
				catch(Exception e) {}
			}
			else {
				System.out.print(" "+num);
				num++;
				notify();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEven oe=new OddEven();
		new Thread(()->oe.odd()).start();
		new Thread() {
			public void run() {
			oe.even();
			}
		}.start();

	}
}
