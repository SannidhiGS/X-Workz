package com.xworkz.libraryapp;

import com.xworkz.libraryapp.render.Render;

public class RenderRunner {
    public static  void main(String args[]){
        Render render=new Render();

        render.renderName="Sannidhi Shetty";
        render.BookID=123;

        System.out.println("The render name: "+render.renderName);
        System.out.println("The bookID: "+render.BookID);
    }
}
