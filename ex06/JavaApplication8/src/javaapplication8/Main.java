/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Bai1 bai1 = new Bai1();
        //bai1.inputNumbers();
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);        
        SavingsAccount.setAnnualInterestRate(4.00/100.00);
        saver1.calculateMonthyInterest();
        saver1.printBalance();
        saver2.calculateMonthyInterest();
        saver2.printBalance();
        SavingsAccount.setAnnualInterestRate(5.00/100.00);
        saver1.calculateMonthyInterest();
        saver1.printBalance();
        saver2.calculateMonthyInterest();
        saver2.printBalance();
        ArrayList<Cake> cakes = new ArrayList<Cake>();
        cakes.add(new OrderCake("chocopie", 5, 20.2));
        cakes.add(new ReadymadeCake("chocolate1", 3, 32));
        cakes.add(new OrderCake("chocopie", 5, 20.2));
        cakes.add(new ReadymadeCake("choco milk", 6, 13));
        cakes.add(new OrderCake("ALBA l", 7, 30.2));
        double allPrice = 0.0;
        for(Cake cake: cakes) {
            double price = cake.calcPrice();
            allPrice += price;
        }
        double totalPriceMadeCake = 0.0;
        for(Cake cake: cakes) {
            if(cake instanceof ReadymadeCake){
                double price = cake.calcPrice();
                totalPriceMadeCake += price;
            }
        }
        
    }
    
}
