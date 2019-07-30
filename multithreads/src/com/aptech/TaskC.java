package com.aptech;

public class TaskC extends Thread{
    private TaskD taskD;
    public TaskC(TaskD taskD) {
        this.taskD = taskD;
    }
    @Override
    public void run() {
        super.run();
        System.out.println("Begin task3");
        for(int i = 0; i< 3000; i ++){
            System.out.print(i+",");
        }
        System.out.println("\nEnd task3");
        this.taskD.finishTask(this);
    }
}
