/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(Person.input());
        persons.add(Person.input());
        persons.add(Person.input());
        Collections.sort(persons, (p1, p2) -> {
            return (p1.getName().compareTo(p2.getName()));
        });
        ArrayList<Employee> employees = new ArrayList<>();

    }
    
}
