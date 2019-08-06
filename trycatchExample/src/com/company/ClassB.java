package com.company;

public class ClassB implements IAccessDB{
    @Override
    public void connectDB() {
        System.out.println("Connect MY SQL");
    }
}
