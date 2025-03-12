/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentPackage;

/**
 *
 * @author raini
 */
public class StudentRecords {
    public static void main(String[] args) {
        
        Student stu1 = new Student ("Alpha", 101, 85);
        Student stu2 = new Student ("Alpha", 456, 90);
        
        stu1.showGrade();

        System.out.println("");
        
        stu2.showGrade();
        
        System.out.println("");
        System.out.println("Total students created: " + Student.getTotalStudents());

                
    }
    
}
