/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentManagementSystem;

/**
 *
 * @author raini
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private double grade;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public void printId(int id){
        System.out.println("Student ID: " + getId());
    }
    
    public void print(String name){
        System.out.println("Student Name: " + getName());
    }
    
    public void printAge(int age){
        System.out.println("Student Age: " + getAge());
    }
     
    public void print(double grade){
        System.out.println("Student Grade: " + getGrade());
    }
    
    public void printInvalidId(){
        System.out.println("Invalid age! ID must be postitive, not negative.");
    }
    
    public void printInvalidAge(){
        System.out.println("Invalid age! Age must be between 5 and 100.");
    }
    
    public void printInvalidGrade(){
        System.out.println("Invalid grade! Grade must be between 0.0 and 100.0.");
    }
    
    
}
