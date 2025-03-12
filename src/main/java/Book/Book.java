/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import javax.swing.border.TitledBorder;

/**
 *
 * @author raini
 */
public class Book {

    private String title, author;
    private double price;
    private static int bookCount = 0;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    public void setPrice() {
        System.out.println("The current price of the book is " + price);
        System.out.println("And it's discounted price is " + (price * 0.90));
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return the bookCount
     */
    public static int getBookCount() {
        return bookCount;
    }

}
