package Challenges;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
}
