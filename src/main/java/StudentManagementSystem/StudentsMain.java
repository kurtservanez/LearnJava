/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentManagementSystem;

/**
 *
 * @author raini
 */
import java.util.Scanner;
public class StudentsMain {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Student stu1 = new Student();
        
        System.out.print("Enter your id: ");
        int idInput = scan.nextInt();
        scan.nextLine();
        stu1.setId(idInput);
        
        System.out.print("Enter your name: ");
        String nameInput = scan.nextLine();
        stu1.setName(nameInput);
        
        System.out.print("Enter your age: ");
        int ageInput = scan.nextInt();
        scan.nextLine();
        stu1.setAge(ageInput);
        
        System.out.print("Enter your grade: ");
        double gradeInput = scan.nextDouble();
        stu1.setGrade(gradeInput);
        
        System.out.println("");    
        System.out.println("Student Identity:");
        
        stu1.printId(stu1.getId());
        stu1.print(stu1.getName());
        stu1.printAge(stu1.getAge());
        stu1.print(stu1.getGrade());
        
        if (idInput < 1){
            stu1.printInvalidId();
        }
        
        if (ageInput < 5 || ageInput > 100){
            stu1.printInvalidAge();
        }
        
        if (gradeInput < 0 ||  gradeInput > 100){
            stu1.printInvalidGrade();
        }
        
    }
    
}
