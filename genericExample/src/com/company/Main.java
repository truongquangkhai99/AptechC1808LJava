package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Clother c1 = new Clother();
        Clother c2 = new Clother();
        Clother c3 = new Clother();
        Book b1 = new Book();
        Clother c4 = new Clother();
        Stack<Stationary> stack = new Stack<Stationary>();
        stack.push(c1);
        stack.push(c2);
        stack.push(c3);
        stack.push(b1);
        stack.push(c4);
        System.out.println("ddd");
    }
}
