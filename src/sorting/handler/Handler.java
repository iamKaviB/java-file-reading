/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.handler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sorting.model.Book;
import sorting.sortingmethod.SortByBookName;
import sorting.sortingmethod.SortByIsbn;

/**
 *
 * @author Rajeeda Dev
 */
public class Handler implements IFileHandler,IArrayHandler{
    
  
    /*Main.............................................................................................................
    ...................................................................................................................
    ...................................................................................................................
    ...................................................................................................................
    */
    public Handler(){}
    
    public void run(){
        
       
        ArrayList<Book> temp = readFile();  
 
        
        
        sortingHandler(temp);
        
        
        
       
    }
    
    /*.................................................................................................................
    ...................................................................................................................
    ...................................................................................................................
    ...................................................................................................................
    */
    
    
    
    
    
    
    
    
    
    
    /*IFileHandler Methods start here..................................................................................
    ...................................................................................................................
    ...................................................................................................................
    ...................................................................................................................
    */
    @Override
    public ArrayList<Book> readFile(){
        
        BufferedReader reader = null;
        Scanner scn = new Scanner(System.in);
        ArrayList<Book> bookRecords = new ArrayList<Book>();
        
        try {
            System.out.println("Enter the file name");
            String name=scn.nextLine();
            reader = new BufferedReader(new FileReader(getPath(name)));
            System.out.println("File found Successfully");
            
            //Creating ArrayList to hold Book objec
            
            //Reading Book records one by one 
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                String[] bookDetail = currentLine.split(",");
                int bookIsbn =Integer.valueOf(bookDetail[0]);
                String bookTitle = bookDetail[1];
                String bookEdition = bookDetail[2];
                ArrayList<String> bookAuthors = new ArrayList();
                String bookPrice = bookDetail[4];
                
                //Creating book object for every book record and adding it to ArrayList
                
                bookRecords.add(new Book(bookIsbn, bookTitle,bookEdition,bookAuthors,bookPrice));
                
                currentLine = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookRecords;
 
    }
    
    
    

    @Override
    public void sortingHandler(ArrayList<Book> bookRecords) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Sorting options you have:\n1:sort by book title\n2:sort by isbn\nenter the option ");
        int sortingOption = scn.nextInt();
        
        if(sortingOption==1)
            Collections.sort(bookRecords, new SortByBookName());
        if(sortingOption==2)
            Collections.sort(bookRecords, new SortByIsbn());
        
        
        
        
        writefile(sortingOption,bookRecords);
        
    }

    @Override
    public void createfile(String path) {
        
      File f = new File(path);
      System.out.println(f.exists());
      System.out.println("in here");

      if(!f.exists()) {
         try {
            f.createNewFile();
         } catch (Exception e) {
            e.printStackTrace();
         }        
      }

       
    }

    @Override
    public void writefile(int option,ArrayList<Book> bookRecords) {
        
   
        try {
             
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the output file name   :");
            String name = scn.nextLine();
            System.out.print(getPath(name));
            createfile(getPath(name));
            BufferedWriter writer = new BufferedWriter(new FileWriter(getPath(name)));
            
            
            
        writingOrder(option,bookRecords);  
       
        writer.close();
 
        //Closing the resources
 
            
        } catch (IOException ex) {
            Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

    @Override
    public String getPath(String name) {
        return System.getProperty("user.home") + File.separator + "Desktop"+ File.separator + name+".txt";
    }

    @Override
    public void writingOrder(int option,ArrayList<Book> bookRecords) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    /*IFileHandler Methods end here....................................................................................
    ...................................................................................................................
    ...................................................................................................................
    ...................................................................................................................
    */
    
    
    
    
    
    
    
    
    
    
    
    /*IArrayHandler Methods start here.................................................................................
    ...................................................................................................................
    ...................................................................................................................
    ...................................................................................................................
    */
    
    
    
}
