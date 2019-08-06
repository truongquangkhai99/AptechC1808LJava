package com.company;

import java.io.Serializable;

public class Point implements Serializable, Cloneable, IExample {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //manual clone using "copy constructor", using in C
    public Point cloneObject() {
        Point newPoint = new Point(this.getX(), this.getY());
        return newPoint;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public void doTaskA() {
        System.out.println("Do task A");
    }
}
