/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeePackage;

/**
 *
 * @author raini
 */
public class Employee {
    private String name;
    private int id;
    private double salary;
    private String position;
    private static int employeeCount = 0;

    public Employee(String name, int id, double salary, String position) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.position = position;
        employeeCount++;
    }

    public void showSalary(){
        System.out.println("Name: " + name + "(id: " + id + " & position: " + position + ")");
        System.out.println("Current salary: " + salary);
        System.out.println("Salary after 10%: " + (salary * 1.10));
        
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    
    
    
}
