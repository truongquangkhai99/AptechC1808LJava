package com.company.main;
import com.sun.deploy.util.SyncAccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Calculation {
    private static final int MAX_ROW = 100;
    private static final int MAX_COL = 100;

    private int [][] arrayA = new int[Calculation.MAX_ROW+1][Calculation.MAX_COL+1];
    public static final Double PI = 3.1416;
    public static int sum(int x, int y) {
        return x + y;
    }
    public static Integer multiply(Integer x, Integer y) {
        return  x * y;
    }
    public static void doSomething() {
        System.out.println("do something");
    }
    public Double calculateFX(Double x) {
        return Math.pow(x, 10) + Math.sin(12)+ Math.abs(-9);
    }
    public String getDayName(Integer day) {
        String result = "";
        switch (day){
            case 1:
              result = "Sunday";
              break;
            case 2:
                result = "Monday";
                break;
            case 3:
                result = "Tuesday";
                break;
                default:
                    result = "Unknown";
        }
        return result;
    }
    /*
    public void exampleList() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list2.add("d");
        list2.add("e");

        list1.addAll(list2);
        list1.forEach(item -> {
            System.out.println(item);
        });
    }*/
    public int random(int min, int max) {
        Random rand = new Random();
        return (rand.nextInt((max - min) + 1) + min);
    }
    public void exampleMatrix() {

        for(int i = 1; i <= Calculation.MAX_COL; i++) {
            for(int j = 1; j <= Calculation.MAX_ROW; j++) {
                System.out.print(i+","+j+ "  ");
                arrayA[i][j] = this.random(-10, 10);
            }
            System.out.println("");
        }
    }
    public void printArray() {
        System.out.println("Array details: ");
        for(int i = 1; i <= Calculation.MAX_COL; i++) {
            for(int j = 1; j <= Calculation.MAX_ROW; j++) {
                System.out.print(arrayA[i][j]+ "  ");
                arrayA[i][j] = random(-120, 120);
            }
            System.out.println("");
        }
    }
    public void printStars() {
        for(int i = 0; i < Calculation.MAX_COL; i++) {
            for(int j = 0; j < Calculation.MAX_ROW; j++) {
                if(i%2 == 0) {
                    if(j%2 == 0) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
        }
    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x : ");
        Integer x = scanner.nextInt();
        System.out.println("x = "+x);
    }
}
