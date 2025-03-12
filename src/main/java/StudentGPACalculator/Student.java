/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentGPACalculator;

/**
 *
 * @author raini
 */
public class Student {
    private String name;
    private int id;
    private double math,english,science;
    private static int studentCount = 0;
    public Student(String name, int id, double math, double english, double science) {
        this.name = name;
        this.id = id;
        this.math = math;
        this.english = english;
        this.science = science;
        studentCount++;
    }
    
    public double gpa(){
        return (math + english + science)/3;
    }
    
    public String status(){
        return (gpa() >= 75 )? "Status: PASSED" : "Status: FAILED";
    }
    
    public void showInfo(){
        System.out.println("Student: " + name + "(id: " + id + ")");
        System.out.println("Math: " + math + " |" + "English: " + english + " |" + "Science: " + science);
    }
    
    public static int getStudentCount() {
        return studentCount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }

    public double getScience() {
        return science;
    }
    

}