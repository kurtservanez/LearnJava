/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarInfo;

/**
 *
 * @author raini
 */
public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        
        car1.setBrand("Toyota");
        car1.setModel("Corolla");
        car1.setYear(2020);
        
        car2.setBrand("Honda");
        car2.setModel("Civic");
        car2.setYear(2019);
        
        car3.setBrand("Ford");
        car3.setModel("Mustang");
        car3.setYear(2021);
        
        car1.print(car1.getBrand(),car1.getModel());
        car1.print(car1.getYear());
        
        System.out.println("");
        
        car2.print(car2.getBrand(),car2.getModel());
        car2.print(car2.getYear());
        
        System.out.println("");
       
        car3.print(car3.getBrand(),car3.getModel());
        car3.print(car3.getYear());
       
        
    }
    
}
