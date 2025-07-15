class Zomato {
    public static void order(String sweet) {
        int price = 0;
        if (sweet == "Gulab Jamun")
            price = 25;
        else if (sweet == "Rasgulla")
            price = 20;
        else if (sweet == "Ladoo")
            price = 15;
        else if (sweet == "Kaju Katli")
            price = 80;
        else if (sweet == "Barfi")
            price = 60;
        else if (sweet == "Jalebi")
            price = 30;
        else if (sweet == "Halwa")
            price = 45;
        else if (sweet == "Peda")
            price = 12;
        else if (sweet == "Mysore Pak")
            price = 70;
        else if (sweet == "Imarti")
            price = 25;
        else if (sweet == "Soan Papdi")
            price = 55;
        else if (sweet == "Cham Cham")
            price = 22;
        else if (sweet == "Malpua")
            price = 40;
        else if (sweet == "Kalakand")
            price = 60;
        else if (sweet == "Milk Cake")
            price = 75;
        else if (sweet == "Besan Ladoo")
            price = 50;
        else if (sweet == "Chocolate Barfi")
            price = 85;
        else if (sweet == "Coconut Ladoo")
            price = 20;
        else if (sweet == "Moong Dal Halwa")
            price = 90;
        else if (sweet == "Ghevar")
            price = 120;
        else if (sweet == "Til Ladoo")
            price = 18;
        else if (sweet == "Anjeer Barfi")
            price = 100;
        else if (sweet == "Badam Katli")
            price = 95;
        else if (sweet == "Rasmalai")
            price = 45;
        else if (sweet == "Kheer")
            price = 50;
        else if (sweet == "Fruit Custard")
            price = 60;
        else if (sweet == "Shahi Tukda")
            price = 70;
        else if (sweet == "Rabri")
            price = 65;
        else if (sweet == "Kesari")
            price = 55;
        else if (sweet == "Patishapta")
            price = 80;

        else
            System.out.println("Price: " + price);

        System.out.println("Sweet: " + sweet +" Price: "+price);
    }
}
