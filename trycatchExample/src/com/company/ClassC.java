package com.company;

public class ClassC {
    IAccessDB iAccessDB;
    ClassC(IAccessDB iAccessDB){
        this.iAccessDB = iAccessDB;
    }
    public void saveData(IAccessDB iAccessDB){
        iAccessDB.connectDB();
        System.out.println("save dataaaaaaa");
    }
}
