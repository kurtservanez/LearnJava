/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeePackage;

/**
 *
 * @author raini
 */
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new Employee ("Alpha" , 101 , 10000 , "Bronze");
        Employee emp2 = new Employee ("Bravo" , 456 , 6000 , "Silver");
        
        emp1.showSalary();
        System.out.println("");
        emp2.showSalary();
        
        System.out.println("Total employee created: " + Employee.getEmployeeCount());
        
    }
    
}
