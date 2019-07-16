/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
public class SavingsAccount {
    private static Double annualInterestRate;

    public static void setAnnualInterestRate(Double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
    private Double savingsBalance;

    public SavingsAccount(Double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    
    public Double calculateMonthyInterest() {
        Double monthlyInterest = savingsBalance*annualInterestRate / 12.0;
        this.savingsBalance += monthlyInterest;
        return savingsBalance*annualInterestRate / 12.0;
    }
    public void printBalance() {
        System.out.println("Balance is: "+this.savingsBalance);
    }
    
}
