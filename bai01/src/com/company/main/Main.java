package com.company.main;

public class Main {
    //primitive types: int, float, double,
    //Float, Double, Integer,..
    public static void main(String []args) {
        int sum = Calculation.sum(3, 4);
        Integer multiply = Calculation.multiply(2,3);
        System.out.println("multiply result is "+multiply);
        Calculation.doSomething();
        System.out.println("REsult is "+sum);
        //Initialise an object of "Calculation"
        Calculation calculation = new Calculation();
        //Get timestamp
        long t1 = System.nanoTime();
        for(int i = 0; i < Math.pow(10, 1); i++) {
            //System.out.println("FX = " + calculation.calculateFX(120.356));
            System.out.println(i);
            calculation.calculateFX(120.356);
        }
        long t2 = System.nanoTime();
        //Get timestamp
        System.out.println("Duration is "+(t2-t1)/1000000.000);
        System.out.println(calculation.getDayName(2));
        //calculation.exampleList();
        calculation.exampleMatrix();
        calculation.printArray();
        calculation.printStars();
    }

}
