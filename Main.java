package assignment;

class BankAccount {
    protected double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Cannot withdraw $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance should be maintained.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Current balance: $" + account.getBalance());

        System.out.println();

        SavingAccount savingsAccount = new SavingAccount();
        savingsAccount.deposit(500);
        savingsAccount.withdraw(400);
        savingsAccount.withdraw(200);
        System.out.println("Current balance: $" + savingsAccount.getBalance());
    }
}
