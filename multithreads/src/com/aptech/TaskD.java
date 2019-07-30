package com.aptech;

import java.util.ArrayList;

public class TaskD extends Thread{
    private ArrayList<Object> tasks = new ArrayList<>();
    private Integer numberOfTasks = 0;
    @Override
    public void run() {
        super.run();
        System.out.println("Begin task4");
        for(int i = 0; i< 5000; i ++){
            System.out.print(i+",");
        }
        System.out.println("\nEnd task4");

    }
    public void finishTask(Object task) {
        if(task instanceof TaskA ||
                task instanceof TaskB || task instanceof TaskC) {
            numberOfTasks++;
        }
        tasks.add(task);
        if(numberOfTasks == 3) {
            this.start();
        }

    }
}
