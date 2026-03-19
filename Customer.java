package threadex;



class Bank {
	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw");
		if(this.amount<amount) {
			System.out.println("less balance");
			try {
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("withdraw completed");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("goint to deposit");
		this.amount+=amount;
		System.out.println("deposit completed");
		notify();
	}
}

public class Customer {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		new Thread() {
			public void run() {
				b.withdraw(5000);
			}
		}.start();
		new Thread() {
			public void run() {
				b.deposit(10000);
			}
		}.start();

	}

}

