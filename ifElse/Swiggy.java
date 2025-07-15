class Swiggy {
    public static int order(String dish) {
        int price = 0; 
        if (dish == "Masala Dosa"){
            price = 90;
			return price;
		}
        else if (dish == "Butter Chicken"){
            price = 240;
			return price;
		}
        else if (dish == "Paneer Butter Masala"){
            price = 180;
			return price;
		}
        else if (dish == "Chicken Biryani"){
            price = 220;
			return price;
		}
        else if (dish == "Veg Biryani"){
            price = 160;
			return price;
		}
        else if (dish == "Roti"){
            price = 15;
			return price;
		}
        else if (dish == "Naan"){
            price = 25;
			return price;
		}
        else if (dish == "Pav Bhaji"){
            price = 120;
			return price;
		}
        else if (dish == "Chole Bhature"){
            price = 150;
			return price;
		}
        else if (dish == "Rajma Chawal"){
            price = 130;
			return price;
		}
        else if (dish == "Dal Makhani"){
            price = 140;
			return price;
		}
        else if (dish == "Idli Sambar"){
            price = 70;
			return price;
		}
        else if (dish == "Vada Sambar"){
            price = 80;
			return price;
		}
        else if (dish == "Chicken Tikka"){
            price = 200;
			return price;
		}
        else if (dish == "Fish Curry"){
            price = 230;
			return price;
		}
        else if (dish == "Egg Curry"){
            price = 170;
			return price;
		}
        else if (dish == "Fried Rice"){
            price = 140;
			return price;
		}
        else if (dish == "Manchurian"){
            price = 130;
			return price;
		}
        else if (dish == "Hakka Noodles"){
            price = 120;
			return price;
		}
        else if (dish == "Samosa"){
            price = 25;
			return price;
		}
        else if (dish == "Kachori"){
            price = 30;
			return price;
		}
        else if (dish == "Poha"){
            price = 60;
			return price;
		}
        else if (dish == "Upma"){
            price = 65;
			return price;
		}
        else if (dish == "Dhokla"){
            price = 70;
			return price;
		}
        else if (dish == "Pani Puri"){
            price = 50;
			return price;
		}
        else if (dish == "Burger"){
            price = 150;
			return price;
		}
        else if (dish == "Pizza"){
            price = 250;
			return price;
		}
        else if (dish == "Sandwich"){
            price = 120;
			return price;
		}
        else if (dish == "Cold Coffee"){
            price = 90;
			return price;
		}
        else if (dish == "Ice Cream"){
            price = 100;
			return price;
		}

        else
            System.out.println("Not available");

        System.out.println("Dish: " + dish +"Price: "+price);
   
		return price;
    }
	
}
