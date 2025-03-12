/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentPackage;

/**
 *
 * @author raini
 */
public class Student {
    private String name;
    private int id;
    private double grade;
    private static int totalStudents = 0;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        totalStudents ++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
    
    public void showGrade(){
        System.out.println("Name: " + getName() + "(" + getId() + ")");
        System.out.println("Current grade: " + getGrade());
        System.out.println("Adjusted grade (+5): " + (getGrade() + 5));
        System.out.println("");
    }
    
}
