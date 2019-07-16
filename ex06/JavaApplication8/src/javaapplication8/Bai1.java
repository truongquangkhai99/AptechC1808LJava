/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.*;

public class Bai1 {
    private ArrayList<Integer> numbers;
    Integer currentIndex = 0;
    Bai1(){
        numbers = new ArrayList<Integer>();
    }
      
    
    public void inputNumbers() { 
        int x;
        try {
            do {
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter number(10 to 100): ");
                x = myObj.nextInt();
                if(this.isDublicate(x)) {
                    System.out.println("Dublicate !");
                } else {
                    System.out.println("Number = "+x);
                    this.numbers.add(x);
                }
               this.currentIndex++; 
            } while(x >= 10 && x <= 100 && currentIndex <=5); 
        } catch(Exception e) {
            System.out.println("Error: "+e.toString());
        }
        
    }
    public Boolean isDublicate(int x) {
        for(Integer number: this.numbers) {
            if(number == x) {
                //dublicate
                return true;
            }
        }
      
        return false;
    } 
}
