/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

import java.util.Random;

public class Thread3 extends Thread {
    private int numberOfThreads = 0;
    private int x, y;
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("sum 2 numbers = "+this.sum2Number());
    }
    public void finishTask(Object thread, int result) {
        if(thread instanceof Thread1) {
            numberOfThreads++;
            x = result;
            System.out.println("x = "+x);
        }
        if(thread instanceof Thread2) {
            numberOfThreads++;
            y = result;
            System.out.println("y = "+y);
        }
        if(numberOfThreads == 2) {
            numberOfThreads = 0;
            this.start();
            
        }
        
    }
    public int sum2Number() {
        return x + y;
    }
    
}