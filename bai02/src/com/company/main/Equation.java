package com.company.main;

public class Equation {
    private double a, b, c;
    private double x1, x2;
    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double delta() {
        return Math.pow(b, 2) - 4*a*c;
    }
    public void sovle() {
        final double delta = this.delta();
        if(a != 0) {
            if(delta > 0) {
                x1 = (-b + Math.sqrt(delta)/(2*a));
                x2 = (-b + Math.sqrt(delta)/(2*a));
            } else if(this.delta() == 0) {

            } else {

            }
        } else {
            if (b == 0) {
                //vo nghiem
                if(c == 0) {
                    //vo so nghiem
                }
            } else {

            }
        }
    }
    void showResult() {
        System.out.println("Nghiem...");
    }
}
