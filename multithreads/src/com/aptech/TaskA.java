package com.aptech;

public class TaskA extends Thread{
    private TaskD taskD;
    public TaskA(TaskD taskD) {
        this.taskD = taskD;
    }
    @Override
    public void run() {
        super.run();
        System.out.println("Begin task1");
        for(int i = 0; i< 1000; i ++){
            System.out.print(i+",");
        }
        System.out.println("\nEnd task1");
        this.taskD.finishTask(this);

    }
}
