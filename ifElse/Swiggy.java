class Swiggy {
    public static void order(String dish) {
        int price = 0; 

        if (dish == "Masala Dosa")
            price = 90;
        else if (dish == "Butter Chicken")
            price = 240;
        else if (dish == "Paneer Butter Masala")
            price = 180;
        else if (dish == "Chicken Biryani")
            price = 220;
        else if (dish == "Veg Biryani")
            price = 160;
        else if (dish == "Roti")
            price = 15;
        else if (dish == "Naan")
            price = 25;
        else if (dish == "Pav Bhaji")
            price = 120;
        else if (dish == "Chole Bhature")
            price = 150;
        else if (dish == "Rajma Chawal")
            price = 130;
        else if (dish == "Dal Makhani")
            price = 140;
        else if (dish == "Idli Sambar")
            price = 70;
        else if (dish == "Vada Sambar")
            price = 80;
        else if (dish == "Chicken Tikka")
            price = 200;
        else if (dish == "Fish Curry")
            price = 230;
        else if (dish == "Egg Curry")
            price = 170;
        else if (dish == "Fried Rice")
            price = 140;
        else if (dish == "Manchurian")
            price = 130;
        else if (dish == "Hakka Noodles")
            price = 120;
        else if (dish == "Samosa")
            price = 25;
        else if (dish == "Kachori")
            price = 30;
        else if (dish == "Poha")
            price = 60;
        else if (dish == "Upma")
            price = 65;
        else if (dish == "Dhokla")
            price = 70;
        else if (dish == "Pani Puri")
            price = 50;
        else if (dish == "Burger")
            price = 150;
        else if (dish == "Pizza")
            price = 250;
        else if (dish == "Sandwich")
            price = 120;
        else if (dish == "Cold Coffee")
            price = 90;
        else if (dish == "Ice Cream")
            price = 100;

        else
            System.out.println("Not available");

        System.out.println("Dish: " + dish +"Price: "+price);
    }
}
