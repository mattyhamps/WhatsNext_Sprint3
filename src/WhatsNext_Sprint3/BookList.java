/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhatsNext_Sprint3;

import java.util.ArrayList;

/**
 *
 * @author Laura 
 */
public class BookList {
    private ArrayList <Book> bookList;
    
    public BookList(){
        
        bookList = new ArrayList();
        
        Book book1 = new Book("The Great Gatsby","F. Scott Fitzgerald","Drama","Parties in New York");
        
        bookList.add(book1);
  
        
        
    }
    
    public void addBooks(Book book)
    {
        getBookList().add(book);
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }
}
