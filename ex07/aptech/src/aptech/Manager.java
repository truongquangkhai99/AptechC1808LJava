/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;


public class Manager extends Employee implements Tax {
    private double bonus;
    public Manager(String name, Integer age, int salary) {
        super(name, age, salary);
    }

    @Override
    public double calculateTax() {
        int salary = this.getSalary();
        bonus = salary * 0.2;
        double tax = salary * 0.2; 
        salary = (int)((double)salary + bonus - tax);
        return tax;
    }

    @Override
    public void display() {        
        super.display();
        System.out.println("bonus: "+bonus);
    }
    
    
}
