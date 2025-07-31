//Create a class Employee with name and salary.
// Include a method to display employee information. Use encapsulation for attributes.
package org.example;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
       return name;
    }

    public double getSalary(){
        return salary;
    }

    public void displayInfo(){
        System.out.println("Name: " + name );
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args){
        Employee employee1 = new Employee("Andres Calderon", 1800000);
        employee1.displayInfo();
    }

}
