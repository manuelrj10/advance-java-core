package threadex;
class BankEcp extends Exception{
	public BankEcp(String message) {
		super(message);
	}
}

class WithdrawThread extends Thread{
	private Bank2 b;
	private int amount;
	WithdrawThread(Bank2 b,int amount){
		this.b=b;
		this.amount=amount;
	}
	public void run() {
		try {
			b.withdraw(amount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
class DepositThread extends Thread{
	private Bank2 b;
	private int amount;
	DepositThread(Bank2 b,int amount){
		this.b=b;
		this.amount=amount;
	}
	public void run() {
		try {
			b.deposit(amount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}


class Bank2{
	private int balance;
	Bank2(int balance){
		this.balance=balance;
	}
	synchronized void deposit(int amount) throws BankEcp {
		if(amount<0) {
			throw new BankEcp("inavalid");
		}
		balance+=amount;
		System.out.println("deposited"+amount);
		notify();
		
		
	}
	synchronized void withdraw(int amount) {
		while(balance<amount) {
			try {
				wait();
			}catch(Exception e) {
			System.out.println(e.getMessage());
			}
		}
		balance-=amount;
		System.out.println("withdraw"+amount);
	}

	public int getBalance() {
		return balance;
	}
}
public class BankAccount1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank2 b=new Bank2(1000);
		WithdrawThread wt=new WithdrawThread(b,20000);
		DepositThread dt=new DepositThread(b,2000);
		wt.start();
		dt.start();

	}

}