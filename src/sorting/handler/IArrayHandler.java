/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.handler;

import sorting.model.Book;

/**
 *
 * @author Rajeeda Dev
 */
public interface IArrayHandler {
    
    public Book addBook(Book book);
    public void deleteBook();
    public Book editeBook(Book book);
 
    
}
