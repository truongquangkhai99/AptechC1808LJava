/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

public class OrderCake extends Cake {
    private double weight;
    public OrderCake(String n, double r, double w) {
        super(n, r);
        weight = w;
    }
    
    public double calcPrice() {
        return weight * rate;
    }
    public static OrderCake inputData() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter rate: ");
        Double rate = scanner.nextDouble();
        System.out.println("Enter weight: ");
        Double weight = scanner.nextDouble();
        OrderCake orderCake = new OrderCake(name, rate, weight);
        return orderCake;
    }
    
}
