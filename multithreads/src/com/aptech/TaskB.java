package com.aptech;

public class TaskB extends Thread{
    private TaskD taskD;
    public TaskB(TaskD taskD) {
        this.taskD = taskD;
    }
    @Override
    public void run() {
        super.run();
        System.out.println("Begin task2");
        for(int i = 0; i< 2000; i ++){
            System.out.print(i+",");
        }
        System.out.println("\nEnd task2");
        this.taskD.finishTask(this);
    }
}
