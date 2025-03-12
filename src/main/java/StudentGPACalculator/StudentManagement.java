/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentGPACalculator;

/**
 *
 * @author raini
 */
public class StudentManagement {
    public static void main(String[] args) {
        
        Student stu1 = new Student ("Alpha", 101, 85, 90, 78);
        Student stu2 = new Student ("Bravo", 456, 70, 65, 80);
        
        stu1.showInfo();
        System.out.println("GPA: " + stu1.gpa());
        System.out.println(stu1.status());
        stu1.status();
    
        System.out.println("");
        
        stu2.showInfo();
        System.out.println("GPA: " + stu2.gpa());
        System.out.println(stu2.status());


        System.out.println("Total student created: " + Student.getStudentCount());

    }
    
}
