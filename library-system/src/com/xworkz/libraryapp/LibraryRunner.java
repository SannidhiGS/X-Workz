package com.xworkz.libraryapp;

import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static  void main(String args[]){

        Library library=new Library();

        library.setLibraryId(12);
        library.setLibraryName("Ambedkar Library");
        library.setNoOfBranch(20);

        System.out.println("The library ID: "+library.getLibraryId());
        System.out.println("The library name: "+library.getLibraryName());
        System.out.println("The library branch "+library.getNoOfBranch());

    }
}
