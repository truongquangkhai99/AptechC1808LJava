package com.company;

public class ClassA implements IAccessDB{
    @Override
    public void connectDB() {
        System.out.println("Connect SQL SERVER");
    }
}
