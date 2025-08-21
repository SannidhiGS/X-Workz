package com.xworkz.libraryapp.library;

public class Library {
    private int libraryId;
    private String libraryName;
    private int noOfBranch;

    public int getLibraryId(){
        return libraryId;
    }
    public void setLibraryId(int libraryId){
        this.libraryId=libraryId;
    }
    public String getLibraryName(){
        return libraryName;
    }
    public void setLibraryName(String libraryName){
        this.libraryName=libraryName;
    }

    public int getNoOfBranch(){
        return noOfBranch;
    }

    public void setNoOfBranch(int noOfBranch) {
        this.noOfBranch = noOfBranch;
    }
}
