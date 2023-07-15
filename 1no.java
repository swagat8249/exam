public class CreditCard {
    // Fields
    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    // Constructor
    public CreditCard(String customer, String bank, String account, int limit) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = 0.0;
    }

    // Methods

    // Getter for Customer
    public String getCustomer() {
        return customer;
    }

    // Getter for Bank
    public String getBank() {
        return bank;
    }

    // Method to charge a specific price
    public boolean charge(double price) {
        if (price > 0 && price <= (limit - balance)) {
            balance += price;
            return true; // Charge successful
        }
        return false; // Charge failed
    }

    // Method to make a payment towards the balance
    public void makePayment(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    // Getter for Account
    public String getAccount() {
        return account;
    }

    // Getter for Credit Limit
    public int getLimit() {
        return limit;
    }

    // Getter for Current Balance
    public double getBalance() {
        return balance;
    }
}
