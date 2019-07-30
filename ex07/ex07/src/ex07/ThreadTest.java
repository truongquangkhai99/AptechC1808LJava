/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

public class ThreadTest {
    public void testThreads() {
        Thread3 thread3 = new Thread3();
        Thread1 thread1 = new Thread1(thread3);
        Thread2 thread2 = new Thread2(thread3);
        thread1.start();
        thread2.start();
    }
}
