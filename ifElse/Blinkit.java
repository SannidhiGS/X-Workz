class Blinkit {
    public static int order(String grocery) {
        int price = 0;

        if (grocery == "Dairy Milk"){
            price = 50;
			return price;
		}
        else if (grocery == "Bread"){
            price = 30;
			return price;
		}
        else if (grocery == "Eggs"){
            price = 60;
			return price;
		}
        else if (grocery == "Butter"){
            price = 45;
			return price;
		}
        else if (grocery == "Cheese"){
            price = 80;
			return price;
		}
        else if (grocery == "Rice"){
            price = 70;
			return price;
		}
        else if (grocery == "Wheat"){
            price = 60;
			return price;
		}
        else if (grocery == "Oil"){
            price = 130;
			return price;
		}
        else if (grocery == "Sugar"){
            price = 40;
			return price;
		}
        else if (grocery == "Salt"){
            price = 20;
			return price;
		}
        else if (grocery == "Toor Dal"){
            price = 90;
			return price;
		}
        else if (grocery == "Moong Dal"){
            price = 95;
			return price;
		}
        else if (grocery == "Tea Powder"){
            price = 150;
			return price;
		}
        else if (grocery == "Coffee"){
            price = 120;
			return price;
		}
        else if (grocery == "Soap"){
            price = 35;
			return price;
		}
        else if (grocery == "Shampoo"){
            price = 110;
			return price;
		}
        else if (grocery == "Toothpaste"){
            price = 90;
			return price;
		}
        else if (grocery == "Detergent"){
            price = 95;
			return price;
		}
        else if (grocery == "Dishwash"){
            price = 75;
			return price;
		}
        else if (grocery == "Floor Cleaner"){
            price = 85;
			return price;
		}
        else if (grocery == "Sanitizer"){
            price = 60;
			return price;
		}
        else if (grocery == "Handwash"){
            price = 55;
			return price;
		}
        else if (grocery == "Curd"){
            price = 40;
			return price;
		}
        else if (grocery == "Paneer"){
            price = 90;
			return price;
		}
        else if (grocery == "Ice Cream"){
            price = 100;
			return price;
		}
        else if (grocery == "Pickle"){
            price = 50;
			return price;
		}
        else if (grocery == "Honey"){
            price = 180;
			return price;
		}
        else if (grocery == "Jam"){
            price = 70;
			return price;
		}
        else if (grocery == "Chips"){
            price = 20;
			return price;
		}
        else if (grocery == "Biscuits"){
            price = 30;
			return price;
		}
        else
            System.out.println("Grocery not available");


        System.out.println("Grocery: " + grocery+"Price: " + price);
		return price;
    }
}
