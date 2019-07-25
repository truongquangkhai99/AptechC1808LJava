package com.aptech;

public class BankAccount {
    private String accountNumber = "";
    private Double balance = 0.0;
    //relation
    private Customer customer;

    public BankAccount(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void deposit(Double amount) {
        balance += amount;
    }
    public Boolean withdraw(Double amount){
        if(balance - amount < 100000.0){
            System.out.println("Cannot enough money to withdraw");
            return false;
        }
        balance -= amount;
        return true;
    }
    public Boolean checkBalance() {
        return true;
    }

    @Override
    public String toString() {
        return "account Number:"+accountNumber+
                ",Balance: "+balance+
                ",customer: "+customer ==null? "" : customer.toString();
    }
}
