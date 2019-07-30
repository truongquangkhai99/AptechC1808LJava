package com.aptech;

public class Main {

    public static void main(String[] args) {
        TaskD taskD = new TaskD();
	    TaskA taskA = new TaskA(taskD);
        TaskB taskB = new TaskB(taskD);
        TaskC taskC = new TaskC(taskD);

        taskA.start();
        taskB.start();
        taskC.start();

    }
}
