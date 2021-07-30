/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.handler;

import java.util.ArrayList;
import sorting.model.Book;

/**
 *
 * @author Rajeeda Dev
 */
public interface IFileHandler {
    
    public ArrayList<Book> readFile();
    public void sortingHandler(ArrayList<Book> bookRecords);
    public void createfile(String path);
    public void writefile(int option,ArrayList<Book> bookRecords);
    public String getPath(String name);
    public void writingOrder(int option,ArrayList<Book> bookRecords);
    
}
