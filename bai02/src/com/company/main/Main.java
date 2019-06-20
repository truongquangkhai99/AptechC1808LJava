package com.company.main;

public class Main {
    //primitive types: int, float, double,
    //Float, Double, Integer,..
    public static void main(String []args) {
        /*
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
        calculation.inputData();
        */
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        Product product4 = product1;//ref
        Product product5 = product1;
        product4.setProductName("iphone 7");
        product4 = null;

        Product iphone6 = new Product(1, "iphone 6", 2016);
        Product iphone7 = new Product(3, "iphone 7", 2017);
        Product iphone8 = new Product(4, "iphone 8", 2018);

        Stack stack = new Stack();
        stack.push(new Product(5, "watch 1", 2017));
        stack.push(new Product(6, "watch 2", 2018));
        stack.push(new Product(7, "watch 3", 2019));
        stack.pop();
        System.out.println("");
        Equation equation = new Equation(1, -2, 1);
        equation.sovle();

    }

}
