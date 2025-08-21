package com.xworkz.tv;
import com.xworkz.tv.Telivision.News;
public class NewsRunner {
    public static void main(String args[]){
        System.out.println("Main Started");
        News news=new News();

        news.setNewChanelRating(4.5);
        news.setNewsChanelName("Mast Maga");
        news.setIsHonest(true);

        System.out.println("Rating :"+news.getNewChanelRating());
        System.out.println("Chanel Name: "+news.getNewsChanelName());
        System.out.println("Is the chanel worth to follow? "+news.getIsHonest());
        System.out.println("The main ended");

    }
}
