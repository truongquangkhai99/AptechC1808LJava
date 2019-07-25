package com.aptech;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public Boolean withdraw(Double amount) {
        if(super.withdraw(amount) == false) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
