class GiTagRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - GiTag Data");

        GiTag gi1 = new GiTag();
        gi1.name = "Mysore Silk";
        gi1.category = "Handicrafts";
        gi1.geographicalArea = "Mysuru, Karnataka";
        gi1.registrationYear = 2005;
        gi1.description = "Traditional silk sarees known for their purity and intricate zari work.";
        gi1.registeredHolder = "Karnataka Silk Industries Corporation (KSIC)";
        gi1.getGiInfo();

        GiTag gi2 = new GiTag();
        gi2.name = "Coorg Arabica Coffee";
        gi2.category = "Agricultural";
        gi2.geographicalArea = "Kodagu District, Karnataka";
        gi2.registrationYear = 2017;
        gi2.description = "Coffee grown in the hilly tracts of Kodagu, known for its mild flavor and aroma.";
        gi2.registeredHolder = "Coffee Board";
        gi2.getGiInfo();

        GiTag gi3 = new GiTag();
        gi3.name = "Bidriware";
        gi3.category = "Handicrafts";
        gi3.geographicalArea = "Bidar, Karnataka";
        gi3.registrationYear = 2008;
        gi3.description = "Metal handicraft from Bidar, known for its unique silver inlay work on a blackened alloy.";
        gi3.registeredHolder = "Karnataka State Handicrafts Development Corporation Ltd.";
        gi3.getGiInfo();

        GiTag gi4 = new GiTag();
        gi4.name = "Channapatna Toys & Dolls";
        gi4.category = "Handicrafts";
        gi4.geographicalArea = "Channapatna, Karnataka";
        gi4.registrationYear = 2005;
        gi4.description = "Traditional wooden toys and dolls, lacquered with natural dyes.";
        gi4.registeredHolder = "Karnataka State Handicrafts Development Corporation Ltd.";
        gi4.getGiInfo();

        GiTag gi5 = new GiTag();
        gi5.name = "Mysore Pak";
        gi5.category = "Foodstuff";
        gi5.geographicalArea = "Mysuru, Karnataka";
        gi5.registrationYear = 2019; // Example year, actual GI status is debated/pending
        gi5.description = "A sweet dish made from gram flour, ghee, and sugar, originating from the Mysore Palace kitchen.";
        gi5.registeredHolder = "Mysore Palace Board (Proposed)";
        gi5.getGiInfo();

        GiTag gi6 = new GiTag();
        gi6.name = "Udupi Sarees";
        gi6.category = "Textile";
        gi6.geographicalArea = "Udupi, Karnataka";
        gi6.registrationYear = 2016;
        gi6.description = "Handloom cotton sarees known for their unique weaving technique and vibrant colors.";
        gi6.registeredHolder = "Udupi Handloom Weavers' Cooperative Society Ltd.";
        gi6.getGiInfo();

        GiTag gi7 = new GiTag();
        gi7.name = "Bangalore Blue Grapes";
        gi7.category = "Agricultural";
        gi7.geographicalArea = "Bengaluru Rural, Karnataka";
        gi7.registrationYear = 2013;
        gi7.description = "A specific variety of grape known for its distinct foxy flavor, grown around Bangalore.";
        gi7.registeredHolder = "Karnataka Grape Growers' Association";
        gi7.getGiInfo();

        GiTag gi8 = new GiTag();
        gi8.name = "Kinnal Toys";
        gi8.category = "Handicrafts";
        gi8.geographicalArea = "Kinnal, Koppal District, Karnataka";
        gi8.registrationYear = 2012;
        gi8.description = "Traditional wooden toys and religious idols, known for their lightweight and vibrant colors.";
        gi8.registeredHolder = "Karnataka State Handicrafts Development Corporation Ltd.";
        gi8.getGiInfo();

        GiTag gi9 = new GiTag();
        gi9.name = "Mysore Agarbathi";
        gi9.category = "Manufactured";
        gi9.geographicalArea = "Mysuru, Karnataka";
        gi9.registrationYear = 2005;
        gi9.description = "Incense sticks known for their unique fragrance blends and traditional manufacturing process.";
        gi9.registeredHolder = "All India Agarbathi Manufacturers Association";
        gi9.getGiInfo();

        GiTag gi10 = new GiTag();
        gi10.name = "Ilkal Sarees";
        gi10.category = "Textile";
        gi10.geographicalArea = "Ilkal, Bagalkot District, Karnataka";
        gi10.registrationYear = 2007;
        gi10.description = "Traditional handloom sarees characterized by their unique pallu design and border.";
        gi10.registeredHolder = "Ilkal Handloom Weavers' Association";
        gi10.getGiInfo();

        GiTag gi11 = new GiTag();
        gi11.name = "Byadagi Chilli";
        gi11.category = "Agricultural";
        gi11.geographicalArea = "Byadagi, Haveri District, Karnataka";
        gi11.registrationYear = 2011;
        gi11.description = "A famous variety of red chilli known for its deep red color and low pungency.";
        gi11.registeredHolder = "Byadagi Chilli Growers' Association";
        gi11.getGiInfo();

        GiTag gi12 = new GiTag();
        gi12.name = "Ganjifa Cards";
        gi12.category = "Handicrafts";
        gi12.geographicalArea = "Mysuru, Karnataka";
        gi12.registrationYear = 2008;
        gi12.description = "Traditional Indian playing cards, hand-painted with intricate designs.";
        gi12.registeredHolder = "Karnataka State Handicrafts Development Corporation Ltd.";
        gi12.getGiInfo();

        GiTag gi13 = new GiTag();
        gi13.name = "Navalgund Durries";
        gi13.category = "Handicrafts";
        gi13.geographicalArea = "Navalgund, Dharwad District, Karnataka";
        gi13.registrationYear = 2011;
        gi13.description = "Hand-woven floor coverings known for their geometric patterns and vibrant colors.";
        gi13.registeredHolder = "Navalgund Durries Weavers' Association";
        gi13.getGiInfo();

        GiTag gi14 = new GiTag();
        gi14.name = "Mysore Traditional Paintings";
        gi14.category = "Handicrafts";
        gi14.geographicalArea = "Mysuru, Karnataka";
        gi14.registrationYear = 2005;
        gi14.description = "Classical South Indian paintings known for their elegance, muted colors, and attention to detail.";
        gi14.registeredHolder = "Karnataka State Handicrafts Development Corporation Ltd.";
       gi14.getGiInfo();

        GiTag gi15 = new GiTag();
        gi15.name = "Bangalore Rose Onion";
        gi15.category = "Agricultural";
        gi15.geographicalArea = "Bengaluru Rural, Karnataka";
        gi15.registrationYear = 2015;
        gi15.description = "A unique variety of onion known for its distinct pungency and rosy red color.";
        gi15.registeredHolder = "Bangalore Rose Onion Growers' Association";
        gi15.getGiInfo();

        GiTag gi16 = new GiTag();
        gi16.name = "Nanjangud Banana";
        gi16.category = "Agricultural";
        gi16.geographicalArea = "Nanjangud, Mysuru District, Karnataka";
        gi16.registrationYear = 2015;
        gi16.description = "A sweet and aromatic banana variety, unique to the Nanjangud region.";
        gi16.registeredHolder = "Nanjangud Banana Growers' Association";
        gi16.getGiInfo();

        GiTag gi17 = new GiTag();
        gi17.name = "Malabar Pepper";
        gi17.category = "Agricultural";
        gi17.geographicalArea = "Malabar Region, Karnataka & Kerala";
        gi17.registrationYear = 2008;
        gi17.description = "High-quality black pepper from the Malabar coast, known for its strong aroma and flavor.";
        gi17.registeredHolder = "Spices Board of India";
        gi17.getGiInfo();
        GiTag gi18 = new GiTag();
        gi18.name = "Coorg Orange";
        gi18.category = "Agricultural";
        gi18.geographicalArea = "Kodagu District, Karnataka";
        gi18.registrationYear = 2005;
        gi18.description = "A specific variety of orange grown in Coorg, known for its distinct taste and aroma.";
        gi18.registeredHolder = "Coorg Orange Growers' Association";
        gi18.getGiInfo();

        GiTag gi19 = new GiTag();
        gi19.name = "Dharwad Pedha";
        gi19.category = "Foodstuff";
        gi19.geographicalArea = "Dharwad, Karnataka";
        gi19.registrationYear = 2007;
        gi19.description = "A traditional sweet made from milk, sugar, and khoa, famous for its unique taste and texture.";
        gi19.registeredHolder = "Thakur Pedha Private Limited";
        gi19.getGiInfo();

        GiTag gi20 = new GiTag();
        gi20.name = "Mysore Sandal Soap";
        gi20.category = "Manufactured";
        gi20.geographicalArea = "Mysuru, Karnataka";
        gi20.registrationYear = 2011;
        gi20.description = "A soap made from pure sandalwood oil, produced by Karnataka Soaps and Detergents Limited.";
        gi20.registeredHolder = "Karnataka Soaps and Detergents Limited";
        gi20.getGiInfo();
		
        System.out.println("Main Ended - GiTag Data Display Complete");
    }
}
