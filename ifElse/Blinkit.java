class Blinkit {
    public static void order(String grocery) {
        int price = -1;

        if (grocery == "Dairy Milk")
            price = 50;
        else if (grocery == "Bread")
            price = 30;
        else if (grocery == "Eggs")
            price = 60;
        else if (grocery == "Butter")
            price = 45;
        else if (grocery == "Cheese")
            price = 80;
        else if (grocery == "Rice")
            price = 70;
        else if (grocery == "Wheat")
            price = 60;
        else if (grocery == "Oil")
            price = 130;
        else if (grocery == "Sugar")
            price = 40;
        else if (grocery == "Salt")
            price = 20;
        else if (grocery == "Toor Dal")
            price = 90;
        else if (grocery == "Moong Dal")
            price = 95;
        else if (grocery == "Tea Powder")
            price = 150;
        else if (grocery == "Coffee")
            price = 120;
        else if (grocery == "Soap")
            price = 35;
        else if (grocery == "Shampoo")
            price = 110;
        else if (grocery == "Toothpaste")
            price = 90;
        else if (grocery == "Detergent")
            price = 95;
        else if (grocery == "Dishwash")
            price = 75;
        else if (grocery == "Floor Cleaner")
            price = 85;
        else if (grocery == "Sanitizer")
            price = 60;
        else if (grocery == "Handwash")
            price = 55;
        else if (grocery == "Curd")
            price = 40;
        else if (grocery == "Paneer")
            price = 90;
        else if (grocery == "Ice Cream")
            price = 100;
        else if (grocery == "Pickle")
            price = 50;
        else if (grocery == "Honey")
            price = 180;
        else if (grocery == "Jam")
            price = 70;
        else if (grocery == "Chips")
            price = 20;
        else if (grocery == "Biscuits")
            price = 30;

        else
            System.out.println("Grocery not available");


        System.out.println("Grocery: " + grocery+"Price: " + price);
    }
}
