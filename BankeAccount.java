package exeptionX;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class InvalidAmountException extends Exception {
	public InvalidAmountException(String message) {
		super(message);
	}
}

class NegativeInitialBalanceException extends Exception {
	public NegativeInitialBalanceException(String message) {
		super(message);
	}
}

class Bank {
	int accountNumber;
	String accountHolder;
	double Balance;

	Bank(int accountNumber, String accountHolder, double Balance) throws NegativeInitialBalanceException {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		if (Balance < 0) {
			throw new NegativeInitialBalanceException("negative value");
		} else {
			this.Balance = Balance;
		}

	}
	void deposit(double amount) throws InvalidAmountException  {
		if(amount<=0) {
			throw new InvalidAmountException("negative amount");
		}
		else {
			Balance+=amount;
			System.out.println("amount : "+amount+" is successfully credited");
			System.out.println("Balance : "+Balance);
		}
	}
	void withdraw(double amount) throws InvalidAmountException,InsufficientBalanceException {
		if(amount<=0) {
			throw new InvalidAmountException("negative value");
		}
		else if(amount > Balance) {
			throw new InsufficientBalanceException("not enough balance");
		}
		else {
			Balance-=amount;
			System.out.println("amount : "+amount+" is successfully withdrawed");
			System.out.println("Balance : "+Balance);
		}
	}
}
public class BankeAccount {
    public static void main(String[] args) {
        try {
            Bank b = new Bank(1, "Manuel", 1000.0);
            
            b.deposit(500);
            
          
            //b.deposit(-1); 
            
            b.withdraw(1000);
 
            b.withdraw(2000);

        } catch (NegativeInitialBalanceException | InvalidAmountException | InsufficientBalanceException e) {
            System.err.println("Transaction Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred.");
        }
    }
}