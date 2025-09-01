/**
 * Represents a Bank account with withdrawal functionality.
 * Demonstrates custom exception handling.
 */
public class Bank {
    private int balance = 10000;
    
    /**
     * Withdraws the specified amount from the account.
     * @param amount the amount to withdraw
     * @throws InsufficientBalanceException if withdrawal amount exceeds balance
     */
    public void withdraw(int amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal successful, remaining balance: " + balance);
        }
    }
    
    /**
     * Returns the current account balance.
     * @return the current balance
     */
    public int getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("Initial balance: " + bank.getBalance());
        
        try {
            bank.withdraw(5000);
            bank.withdraw(6000); // This should throw an exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
