package com.xworkz.library.Validator;

import com.xworkz.library.book.Book;

public class Validator {
    Book book;
    public boolean getValidateData(Book book){
        boolean isBookId=false;
        if(book.getBookId()!=0 && book.getBookId()>0)
            isBookId=true;
        else
            System.out.println("The book id not valid");

        boolean isTitle=false;
        if(book.getTitle()!=null && !book.getTitle().isEmpty())
            isTitle=true;
        else
            System.out.println("The book title not Valid");

        boolean isAuthor=false;
        if(book.getAuthor()!=null &&  !book.getAuthor().isEmpty())
            isAuthor=true;
        else
            System.out.println("The book author name not valid");

        boolean isGenre=false;
        if (book.getGenre()!=null && !book.getGenre().isEmpty())
            isGenre=true;
        else
            System.out.println("the genre not avaolable");

        boolean isPrice=false;
        if(book.getPrice()!=0 && book.getPrice()>0)
            isPrice=true;
        else
            System.out.println("The book price not valid");

        boolean getValidateData=false;
        if(isBookId && isTitle && isAuthor && isGenre && isPrice)
            getValidateData=true;
        else
            System.out.print("The book data not valid");
        return getValidateData;
    }
}
