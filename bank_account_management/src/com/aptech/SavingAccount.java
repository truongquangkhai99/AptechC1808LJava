package com.aptech;

public class SavingAccount extends BankAccount{
    private Float rate = 0.0f;
    public SavingAccount(String accountNumber, Double balance, Float rate) {
        super(accountNumber, balance);
        this.rate = rate;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    @Override
    public Boolean withdraw(Double amount) {
        
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+"rate: "+rate;
    }
}
