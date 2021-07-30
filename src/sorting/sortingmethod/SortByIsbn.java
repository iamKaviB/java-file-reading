/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.sortingmethod;

import java.util.Comparator;
import sorting.model.Book;

/**
 *
 * @author Rajeeda Dev
 */
public class SortByIsbn implements Comparator<Book>{

   @Override
    public int compare(Book b1, Book b2)
    {
        return b2.getIsbn() - b1.getIsbn();
    }
    
}
