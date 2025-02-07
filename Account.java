import java.util.List;

public class Account {
    private String accountNumber;
    private String fullName;
    private String pin;
    private double balance;
    private List<Transaction> transactionHistory;

    public Account(String accountNumber, String fullName, String pin, double balance, List<Transaction> transactionHistory) {
        this.accountNumber = accountNumber;
        this.fullName = fullName;
        this.pin = pin;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public void deposit(double amount){

    }

    public void withdraw(double amount) {

    }

    public void addTransaction(Transaction transaction){}
}
