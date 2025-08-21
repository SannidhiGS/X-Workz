package com.xworkz.library;

import com.xworkz.library.Validator.Validator;
import com.xworkz.library.book.Book;
import com.xworkz.library.librarysystem.Library;

public class LibraryRunner {

    public static void main(String args[]){

        Book book=new Book() ;
        book.setBookId(5);
        book.setTitle("Malegalalli Madhumagalu");
        book.setAuthor("Kuvempu");
        book.setGenre("Poetry");
        book.setPrice(350);

        Library library=new Library();
        boolean bookData=library.getBookData(book);
        if(bookData)
            library.bookDetails();
        else
            System.out.println("Book not available");
    }
}
