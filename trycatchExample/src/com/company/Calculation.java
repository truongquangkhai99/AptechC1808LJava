package com.company;

public class Calculation {
    public void doSomething() {
        try {
            int x = 10;
            int y = 3;
            if(y == 3) {
                throw new Exception("Ko duoc = 3");
            }
            float result = x/y;
            System.out.println("Calculation success");
        } catch (Exception e) {
            System.out.println("Error = "+e);
        }finally {

        }
    }
    public void doSomething2() throws Exception {
        int a = 10;
        int b = 0;
        int result = a / b;
    }
}
