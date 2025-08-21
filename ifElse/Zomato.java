class Zomato {
    public static int order(String sweet) {
        int price = 0;
        if (sweet == "Gulab Jamun"){
            price = 25;
			return price;
		}
        else if (sweet == "Rasgulla"){
            price = 20;
			return price;
		}
        else if (sweet == "Ladoo"){
            price = 15;
			return price;
		}
        else if (sweet == "Kaju Katli"){
            price = 80;
			return price;
		}
        else if (sweet == "Barfi"){
            price = 60;
			return price;
		}
        else if (sweet == "Jalebi"){
            price = 30;
			return price;
		}
        else if (sweet == "Halwa"){
            price = 45;
			return price;
		}
        else if (sweet == "Peda"){
            price = 12;
			return price;
		}
        else if (sweet == "Mysore Pak")
            price = 70;
        else if (sweet == "Imarti"){
            price = 25;
			return price;
		}
        else if (sweet == "Soan Papdi"){
            price = 55;
			return price;
		}
        else if (sweet == "Cham Cham"){
            price = 22;
			return price;
		}
        else if (sweet == "Malpua"){
            price = 40;
			return price;
		}
        else if (sweet == "Kalakand"){
            price = 60;
			return price;
		}
        else if (sweet == "Milk Cake"){
            price = 75;
			return price;
		}
        else if (sweet == "Besan Ladoo"){
            price = 50;
			return price;
		}
        else if (sweet == "Chocolate Barfi"){
            price = 85;
			return price;
		}
        else if (sweet == "Coconut Ladoo"){
            price = 20;
			return price;
		}
        else if (sweet == "Moong Dal Halwa"){
            price = 90;
			return price;
		}
        else if (sweet == "Ghevar"){
            price = 120;
			return price;
		}
        else if (sweet == "Til Ladoo"){
            price = 18;
			return price;
		}
        else if (sweet == "Anjeer Barfi"){
            price = 100;
			return price;
		}
        else if (sweet == "Badam Katli"){
            price = 95;
			return price;
		}
        else if (sweet == "Rasmalai"){
            price = 45;
			return price;
		}
        else if (sweet == "Kheer"){
            price = 50;
			return price;
		}
        else if (sweet == "Fruit Custard"){
            price = 60;
			return price;
		}
        else if (sweet == "Shahi Tukda"){
            price = 70;
			return price;
		}
        else if (sweet == "Rabri"){
            price = 65;
			return price;
		}
        else if (sweet == "Kesari"){
            price = 55;
			return price;
		}
        else if (sweet == "Patishapta"){
            price = 80;
			return price;
		}

        else
            System.out.println("Price: " + price);

        System.out.println("Sweet: " + sweet +" Price: "+price);
	return price;
    }
}
