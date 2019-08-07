/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;

import java.util.Scanner;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public void display() {
        System.out.println("name: "+name+" Age: "+age);
    }
    
    public static Person input() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter name: ");
        String name = scanner.nextLine(); 
        System.out.println("Enter age: ");
        Integer age = scanner.nextInt(); 
        return new Person(name, age);
    }
}
