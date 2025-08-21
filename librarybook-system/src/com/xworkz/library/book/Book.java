package com.xworkz.library.book;

public class Book {
    private int bookId;
    public void setBookId(int bookId){
        this.bookId=bookId;
    }
    public int getBookId(){
        return bookId;
    }

    private String title;
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }

    private String author;
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
       return author;
    }

    private int price;
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }

    private String genre;
    public void setGenre(String genre){
        this.genre=genre;
    }
    public String getGenre(){
        return genre;
    }


}
