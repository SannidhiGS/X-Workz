class Zepto {
    public static void order(String fruit) {
        String price = null;

        if (fruit == "Apple")
            price = "200/kg";
        else if (fruit == "Banana")
            price = "65/dozen";
        else if (fruit == "Mango")
            price = "150/kg";
        else if (fruit == "Orange")
            price = "160/kg";
        else if (fruit == "Guava")
            price = "80/kg";
        else if (fruit == "Pomegranate")
            price = "160/kg";
        else if (fruit == "Papaya")
            price = "49/pcs";
        else if (fruit == "Watermelon")
            price = "115/pcs";
        else if (fruit == "Muskmelon")
            price = "58/pcs";
        else if (fruit == "Kiwi")
            price = "35/pcs";
        else if (fruit == "Dragon Fruit")
            price = "150/kg";
        else if (fruit == "Avocado")
            price = "39/pcs";
        else if (fruit == "Pear")
            price = "150/kg";
        else if (fruit == "Plum")
            price = "110/kg";
        else if (fruit == "Lychee")
            price = "80/kg";
        else if (fruit == "Custard Apple")
            price = "116/500g";
        else if (fruit == "Chikoo")
            price = "70/kg";
        else if (fruit == "Jamun")
            price = "133/250g";
        else if (fruit == "Peach")
            price = "119/250g";
        else if (fruit == "Tangerine")
            price = "169/500g";
        else if (fruit == "Cranberry")
            price = "150/250g";
        else if (fruit == "Blueberry")
            price = "299/125g";
        else if (fruit == "Raspberry")
            price = "190";
        else if (fruit == "Strawberry")
            price = "140;
        else if (fruit == "Fig")
            price = "92";
        else if (fruit == "Indian Cherry")
            price = "176";
        else if (fruit == "Sweet Lime")
            price = "150";
        else if (fruit == "Amla")
            price = "19";
        else if (fruit == "Apricot")
            price = "109";
        else if (fruit == "Tender Coconut")
            price = "77";

        if (price == null)
            System.out.println("Fruit not available");
        else
            System.out.println("Price: " + price);

        System.out.println("Fruit: " + fruit);
    }
}
