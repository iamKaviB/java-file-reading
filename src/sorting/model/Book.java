/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.model;

import java.util.ArrayList;

/**
 *
 * @author Rajeeda Dev
 */
public class Book {
    
    private int isbn;
    private String title;
    private String edition;
    private ArrayList<String> author;
    private String price;

    public Book(int isbn, String title, String edition, ArrayList<String> author, String price) {
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
        this.author = author;
        this.price = price;
    }
    
    public Book(){}

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public ArrayList<String> getAuthor() {
        return author;
    }

    public void setAuthor(ArrayList<String> author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
    
    
}
