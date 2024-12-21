package Entities;

public class BankAccount {
    private int accountNumber;
    private String holder;
    private double balance;

    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public String toString(){
        return "Account Number: "
                + getAccountNumber()
                + ", Holder: "
                + getHolder()
                + ", Balance: $ "
                + getBalance();
    }

}
