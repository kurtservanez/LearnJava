/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo;

/**
 *
 * @author raini
 */
public class Dog {
    private String dogName;
    private String dogBreed;
    private int dogAge;

    /**
     * @return the dogName
     */
    public String getDogName() {
        return dogName;
    }

    /**
     * @param dogName the dogName to set
     */
    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    /**
     * @return the dogBreed
     */
    public String getDogBreed() {
        return dogBreed;
    }

    /**
     * @param dogBreed the dogBreed to set
     */
    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    /**
     * @return the dogAge
     */
    public int getDogAge() {
        return dogAge;
    }

    /**
     * @param dogAge the dogAge to set
     */
    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }
    
    public void print (String name, String breed){
        System.out.println("Hi my name is " + getDogName() + " , My breed is " + getDogBreed());
    }
    
    public void print (int age){
        System.out.println("My age is " + getDogAge());
    }
    
}
