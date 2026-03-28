package exeptionX;

// 1. Defined the correct custom exception
class InSufficientBalanceException extends Exception {
    InSufficientBalanceException(String s) {
        super(s);
    }
}

class InSufficientBalance {
    int balance = 10000; // Fixed spelling of "balance"
    
    // 2. Updated the 'throws' and 'throw' to use the banking exception
    void withdraw(int amount) throws InSufficientBalanceException {
        if (balance < amount) {
            throw new InSufficientBalanceException("Insufficient funds! Your balance is: " + balance);
        } else {
            balance -= amount; // Deduct the money
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        InSufficientBalance sb = new InSufficientBalance();
        try {
            // Try to withdraw 15000 (which is more than the 10000 balance)
            sb.withdraw(150);
        } catch (InSufficientBalanceException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for banking with us.");
        }
    }
}