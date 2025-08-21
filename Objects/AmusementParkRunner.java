class AmusementParkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Amusement Park Data");

        AmusementPark park1 = new AmusementPark();
        park1.name = "Wonderla Bengaluru";
        park1.locationCity = "Bengaluru";
        park1.areaAcres = 82.0;
        park1.numberOfRides = 60;
        park1.ticketPriceAdult = 1249.00;
        park1.hasWaterParkSection = true;
        park1.getAmmusement();

        AmusementPark park2 = new AmusementPark();
        park2.name = "Imagicaa";
        park2.locationCity = "Khopoli, Maharashtra";
        park2.areaAcres = 130.0;
        park2.numberOfRides = 25;
        park2.ticketPriceAdult = 1499.00;
        park2.hasWaterParkSection = true;
        park2.getAmmusement();

        AmusementPark park3 = new AmusementPark();
        park3.name = "EsselWorld";
        park3.locationCity = "Mumbai";
        park3.areaAcres = 64.0;
        park3.numberOfRides = 30;
        park3.ticketPriceAdult = 999.00;
        park3.hasWaterParkSection = false; 
        park3.getAmmusement();

        AmusementPark park4 = new AmusementPark();
        park4.name = "Nicco Park";
        park4.locationCity = "Kolkata";
        park4.areaAcres = 40.0;
        park4.numberOfRides = 35;
        park4.ticketPriceAdult = 300.00;
        park4.hasWaterParkSection = true;
        park4.getAmmusement();

        AmusementPark park5 = new AmusementPark();
        park5.name = "Ramoji Film City";
        park5.locationCity = "Hyderabad";
        park5.areaAcres = 2000.0;
        park5.numberOfRides = 15; 
        park5.ticketPriceAdult = 1350.00;
        park5.hasWaterParkSection = false;
        park5.getAmmusement();

        AmusementPark park6 = new AmusementPark();
        park6.name = "Adlabs Aquamagica";
        park6.locationCity = "Khopoli, Maharashtra";
        park6.areaAcres = 30.0;
        park6.numberOfRides = 12;
        park6.ticketPriceAdult = 999.00;
        park6.hasWaterParkSection = true;
        park6.getAmmusement();

        AmusementPark park7 = new AmusementPark();
        park7.name = "GRS Fantasy Park";
        park7.locationCity = "Mysuru, Karnataka";
        park7.areaAcres = 30.0;
        park7.numberOfRides = 20;
        park7.ticketPriceAdult = 800.00;
        park7.hasWaterParkSection = true;
        park7.getAmmusement();

        AmusementPark park8 = new AmusementPark();
        park8.name = "Queensland Amusement Park";
        park8.locationCity = "Chennai";
        park8.areaAcres = 70.0;
        park8.numberOfRides = 50;
        park8.ticketPriceAdult = 600.00;
        park8.hasWaterParkSection = true;
        park8.getAmmusement();

        AmusementPark park9 = new AmusementPark();
        park9.name = "Worlds of Wonder";
        park9.locationCity = "Noida";
        park9.areaAcres = 10.0;
        park9.numberOfRides = 20;
        park9.ticketPriceAdult = 1000.00;
        park9.hasWaterParkSection = true;
        park9.getAmmusement();

        AmusementPark park10 = new AmusementPark();
        park10.name = "Fun N Food Village";
        park10.locationCity = "Delhi";
        park10.areaAcres = 15.0;
        park10.numberOfRides = 10;
        park10.ticketPriceAdult = 1200.00;
        park10.hasWaterParkSection = true;
        park10.getAmmusement();

        AmusementPark park11 = new AmusementPark();
        park11.name = "Funtasia Island";
        park11.locationCity = "Patna";
        park11.areaAcres = 5.0;
        park11.numberOfRides = 8;
        park11.ticketPriceAdult = 400.00;
        park11.hasWaterParkSection = true;
        park11.getAmmusement();

        AmusementPark park12 = new AmusementPark();
        park12.name = "Snow Kingdom";
        park12.locationCity = "Bengaluru";
        park12.areaAcres = 2.0; // Indoor park
        park12.numberOfRides = 5;
        park12.ticketPriceAdult = 700.00;
        park12.hasWaterParkSection = false;
        park12.getAmmusement();

        AmusementPark park13 = new AmusementPark();
        park13.name = "Innovative Film City";
        park13.locationCity = "Bengaluru";
        park13.areaAcres = 58.0;
        park13.numberOfRides = 10;
        park13.ticketPriceAdult = 600.00;
        park13.hasWaterParkSection = true;
        park13.getAmmusement();

        AmusementPark park14 = new AmusementPark();
        park14.name = "Wonderla Kochi";
        park14.locationCity = "Kochi, Kerala";
        park14.areaAcres = 30.0;
        park14.numberOfRides = 50;
        park14.ticketPriceAdult = 1050.00;
        park14.hasWaterParkSection = true;
        park14.getAmmusement();
		
        AmusementPark park15 = new AmusementPark();
        park15.name = "Aquatica";
        park15.locationCity = "Kolkata";
        park15.areaAcres = 17.0;
        park15.numberOfRides = 15;
        park15.ticketPriceAdult = 450.00;
        park15.hasWaterParkSection = true;
        park15.getAmmusement();

        AmusementPark park16 = new AmusementPark();
        park16.name = "Adventure Island";
        park16.locationCity = "Delhi";
        park16.areaAcres = 62.0;
        park16.numberOfRides = 25;
        park16.ticketPriceAdult = 800.00;
        park16.hasWaterParkSection = false;
        park16.getAmmusement();

        AmusementPark park17 = new AmusementPark();
        park17.name = "Snow World";
        park17.locationCity = "Hyderabad";
        park17.areaAcres = 3.0; // Indoor snow park
        park17.numberOfRides = 3;
        park17.ticketPriceAdult = 500.00;
        park17.hasWaterParkSection = false;
        park17.getAmmusement();

        AmusementPark park18 = new AmusementPark();
        park18.name = "Wonderla Hyderabad";
        park18.locationCity = "Hyderabad";
        park18.areaAcres = 50.0;
        park18.numberOfRides = 43;
        park18.ticketPriceAdult = 1149.00;
        park18.hasWaterParkSection = true;
        park18.getAmmusement();

        AmusementPark park19 = new AmusementPark();
        park19.name = "Splash Water Park";
        park19.locationCity = "Delhi";
        park19.areaAcres = 8.0;
        park19.numberOfRides = 10;
        park19.ticketPriceAdult = 700.00;
        park19.hasWaterParkSection = true;
        park19.getAmmusement();
		
        AmusementPark park20 = new AmusementPark();
        park20.name = "DREAM WORLD Water Park";
        park20.locationCity = "Surat, Gujarat";
        park20.areaAcres = 10.0;
        park20.numberOfRides = 18;
        park20.ticketPriceAdult = 650.00;
        park20.hasWaterParkSection = true;
        park20.getAmmusement();

        System.out.println("Main Ended - Amusement Park Data Display Complete");
    }
}
