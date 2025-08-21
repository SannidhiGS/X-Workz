class WashingMachine {
    public static void main(String args[]) {
        String item = "Washing Machine";
        String brand = "LG";
        int cost = 32499;
        String color = "Silver";
        String material = "Stainless Steel";
        String mode = "Automatic";
        String type = "Front Load";
        int capacity = 7; // in kilograms
        boolean dryerIncluded = true;

        String it = "The item name is ";
        String bra = "The brand name is ";
        String co = "The cost of the item is";
        String col = "The color is ";
        String mat = "The material used is ";
        String mo = "The mode of operation is ";
        String typ = "The type of washing machine is ";
        String cap = "The washing capacity is in kg ";
        String dry = "Dryer included: ";

        System.out.println(it + item);
        System.out.println(bra + brand);
        System.out.println(co + cost);
        System.out.println(col + color);
        System.out.println(mat + material);
        System.out.println(mo + mode);
        System.out.println(typ + type);
        System.out.println(cap + capacity );
        System.out.println(dry + dryerIncluded);
    }
}
