/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

public class ReadymadeCake extends Cake {
    private int quantity;
    public ReadymadeCake(String n, double r, int q) {
        super(n, r);
        quantity = q;
    }
    
    public double calcPrice() {
        return quantity * rate;
    }
    
}