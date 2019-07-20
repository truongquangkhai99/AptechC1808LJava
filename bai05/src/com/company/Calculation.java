package com.company;

public class Calculation {
    Calculation() {

    }
    public void doTryCatch() {
        try {
            System.out.println("step 1");
            System.out.println("step 2");
            int []a = {1,2};
            int y = a[10];
            int x = 10 / 0;
            System.out.println("step 3");

        } catch(ArithmeticException e) {

            System.out.println("Error1 is:"+e.toString());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error2 is:"+e.toString());
        }
        finally {
            //Kieu gi cung chui vao
        }
    }
}
