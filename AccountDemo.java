package assignment;

import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1122);
        account.setBalance(20000);
        account.setAnnualInterestRate(4.5);

        System.out.println("Account Details:");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: Rs. " + account.getBalance());
        System.out.println("Monthly Interest: Rs. " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());

        System.out.println("\nWithdraw Rs. 2,500");
        account.withdraw(2500);
        System.out.println("Updated Balance: Rs. " + account.getBalance());

        System.out.println("\nDeposit Rs. 3,000");
        account.deposit(3000);
        System.out.println("Updated Balance: Rs. " + account.getBalance());
    }
}

