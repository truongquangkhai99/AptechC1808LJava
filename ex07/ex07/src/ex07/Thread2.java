/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;
import java.util.Random;

public class Thread2 extends Thread {
    private Thread3 thread3;//ref to Thread3
    public Thread2(Thread3 thread3) {
        this.thread3 = thread3;
    }
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        int result = this.randomNumber();
        this.thread3.finishTask(this, result);
    }
    public int randomNumber() {
        Random rand = new Random();
        int result = 100 + rand.nextInt(101);
        return result;
    }
    
}
