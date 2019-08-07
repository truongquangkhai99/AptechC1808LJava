/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;

public class Employee extends Person {
    private int salary;
    public Employee(String name, Integer age, int salary) {
        super(name, age);
        this.salary = salary;
    }
    public void increaseSalary(int x) {
        salary = salary + x;
    }
    public void increaseSalary(double x) {
        salary = (int)((double)salary * x);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
    @Override
    public void display() {
        super.display();
        System.out.println("salary: "+salary);
    }
    
    
    
}
