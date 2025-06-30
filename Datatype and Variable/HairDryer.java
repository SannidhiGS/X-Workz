class HairDryer {
    public static void main(String args[]) {
        String item = "Hair Dryer";
        String brand = "Havells";
        int cost = 1899;
        String color = "Pink and White";
        String material = "Plastic";
        String mode = "Electric";
        int power = 1600; // in watts
        String speedSettings = "3-speed";
        boolean foldable = true;

        String it = "The item name is ";
        String bra = "The brand name is ";
        String co = "The cost of the item is";
        String col = "The color is ";
        String mat = "The material used is ";
        String mo = "The mode of operation is ";
        String pow = "Power consumption is ";
        String speed = "Speed settings: ";
        String fold = "Is it foldable? ";

        System.out.println(it + item);
        System.out.println(bra + brand);
        System.out.println(co + cost);
        System.out.println(col + color);
        System.out.println(mat + material);
        System.out.println(mo + mode);
        System.out.println(pow + power + "W");
        System.out.println(speed + speedSettings);
        System.out.println(fold + foldable);
    }
}
