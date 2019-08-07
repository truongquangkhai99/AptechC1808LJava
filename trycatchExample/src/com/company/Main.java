package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculation calculation = new Calculation();
        //calculation.doSomething();
        try {
            calculation.doSomething2();
        } catch (Exception e) {

        }
        Point p1 = new Point(1.0f, 2.0f);
        Point p3 = p1.cloneObject();
        try {
            Point p2 = (Point) p1.clone();
            System.out.println("Clone success");
        }catch (Exception e) {
            System.out.println("Cannot clone");
        }
        IExample p4 = new Point(3.0f,3.0f);
        ClassC classC = new ClassC();
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        classC.saveData(classB);
    }
}
