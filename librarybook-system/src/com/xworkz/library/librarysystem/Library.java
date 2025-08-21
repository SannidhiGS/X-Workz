package com.xworkz.library.librarysystem;

import com.xworkz.library.Validator.Validator;
import com.xworkz.library.book.Book;

public class Library {
    Book book;
    public boolean getBookData( Book book){
        boolean getBookData=false;
        Validator validator=new Validator();
        boolean data=validator.getValidateData(book);

        if(data){
            this.book=book;
            getBookData=true;
        }
        else
            System.out.println("Invalid book data");
        return  getBookData;
    }

    public void bookDetails(){
        System.out.println("The book Id: "+book.getBookId());
        System.out.println("The book title: "+book.getTitle());
        System.out.println("The book author: "+book.getAuthor());
        System.out.println("The book genre: "+book.getGenre());
        System.out.println("The book price: "+book.getPrice());
    }
}
