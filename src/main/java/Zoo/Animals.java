/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo;

/**
 *
 * @author raini
 */
public class Animals {
    public static void main(String[] args) {
        
        Dog dog1 = new Dog ();
        Dog dog2 = new Dog ();
        
        dog1.setDogName("Alpha");
        dog2.setDogName("Beta");
        
        dog1.setDogBreed("Bulldog");
        dog2.setDogBreed("Pitbull");
        
        dog1.setDogAge(1);
        dog2.setDogAge(2);
        
        dog1.print(dog1.getDogName(),dog1.getDogBreed());
        dog1.print(dog1.getDogAge());
        
        System.out.println();
        
        dog2.print(dog2.getDogName(),dog2.getDogBreed());
        dog2.print(dog2.getDogAge());
        
    }
    
}
