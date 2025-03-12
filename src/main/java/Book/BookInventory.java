/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

/**
 *
 * @author raini
 */
public class BookInventory {
    public static void main(String[] args) {
        
        Book book1 = new Book("Alpha", "Uno" , 100);
        Book book2 = new Book("Beta", "Dos" , 200);
        
        book1.setPrice();
        book2.setPrice();
        
        System.out.println("Count of all the object books: " + Book.getBookCount());

    }
}
