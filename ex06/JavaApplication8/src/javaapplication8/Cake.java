/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

public class Cake {
    protected String name;
    protected double rate;

    public Cake(String n, double r) {
        name = n;
        rate = r;
    }
    public abstract double calcPrice();

    @Override
    public String toString() {
        return "name"+"\t"+rate;
    }
    
    
}
