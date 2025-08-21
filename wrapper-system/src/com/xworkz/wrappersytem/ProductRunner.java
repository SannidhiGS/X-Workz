package com.xworkz.wrappersytem;

public class ProductRunner {
    public static void main(String args[]){
        Integer productId=12;
        Integer productIdA=new Integer(12);

        String productName="Kurta";
        String productNameA=new String("Kurta");

        Character size='M';
        Character sizeA=new Character('M');

        Boolean isProductWorth=true;
        Boolean isProductWorthA=new Boolean(true);

        Byte noOfThing=2;
        Byte noOfThingA=new Byte((byte) 2);

        Double price=899.00;
        Double priceA=new Double(890.0);

        Long productCode= 899878L;
        Long productCodeA=new Long(899878L);

        Float rating=4.5F;
        Float ratingA=new Float(4.5);

        Short productNo=12;
        Short productNoA=new Short((short) 12);

        System.out.println(productId==productIdA);
        System.out.println(productName==productNameA);
        System.out.println(size==sizeA);
        System.out.println(isProductWorth==isProductWorthA);
        System.out.println(noOfThing==noOfThingA);
        System.out.println(price==priceA);
        System.out.println(productCode==productCodeA);
        System.out.println(rating==ratingA);
        System.out.println(productNo==productNoA);

    }
}
