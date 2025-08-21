class Zepto {
    public static String order(String fruit) {
        String price = null;

        if (fruit == "Apple"){
            price = "200/kg";
			return price;
		}
        else if (fruit == "Banana"){
            price = "65/dozen";
			return price;
		}
        else if (fruit == "Mango"){
            price = "150/kg";
			return price;
		}
        else if (fruit == "Orange"){
            price = "160/kg";
			return price;
		}
        else if (fruit == "Guava"){
            price = "80/kg";
			return price;
		}
        else if (fruit == "Pomegranate"){
            price = "160/kg";
			return price;
		}
        else if (fruit == "Papaya"){
            price = "49/pcs";
			return price;
		}
        else if (fruit == "Watermelon"){
            price = "115/pcs";
			return price;
		}
        else if (fruit == "Muskmelon"){
            price = "58/pcs";
			return price;
		}
        else if (fruit == "Kiwi"){
            price = "35/pcs";
			return price;
		}
        else if (fruit == "Dragon Fruit"){
            price = "150/kg";
			return price;
		}
        else if (fruit == "Avocado"){
            price = "39/pcs";
			return price;
		}
        else if (fruit == "Pear"){
            price = "150/kg";
			return price;
		}
        else if (fruit == "Plum"){
            price = "110/kg";
			return price;
		}
        else if (fruit == "Lychee"){
            price = "80/kg";
			return price;
		}
        else if (fruit == "Custard Apple"){
            price = "116/500g";
			return price;
		}
        else if (fruit == "Chikoo"){
            price = "70/kg";
			return price;
		}
        else if (fruit == "Jamun"){
            price = "133/250g";
			return price;
		}
        else if (fruit == "Peach"){
            price = "119/250g";
			return price;
		}
        else if (fruit == "Tangerine"){
            price = "169/500g";
			return price;
		}
        else if (fruit == "Cranberry"){
            price = "150/250g";
			return price;
		}
        else if (fruit == "Blueberry"){
            price = "299/125g";
			return price;
		}
        else if (fruit == "Raspberry"){
            price = "190";
			return price;
		}
        else if (fruit == "Strawberry"){
            price = "140";
			return price;
		}
        else if (fruit == "Fig"){
            price = "92";
			return price;
		}
        else if (fruit == "Indian Cherry"){
            price = "176";
			return price;
		}
        else if (fruit == "Sweet Lime"){
            price = "150";
			return price;
		}
        else if (fruit == "Amla"){
            price = "19";
			return price;
		}
        else if (fruit == "Apricot"){
            price = "109";
			return price;
		}
        else if (fruit == "Tender Coconut"){
            price = "77";
			return price;
		}

        if (price == null)
            System.out.println("Fruit not available");
        else
            System.out.println("Price: " + price);

        System.out.println("Fruit: " + fruit);
		return price;
    }
}
