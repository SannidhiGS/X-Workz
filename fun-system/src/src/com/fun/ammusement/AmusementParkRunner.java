package src.com.fun.ammusement;

class AmusementParkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Amusement Park Data");


        AmusementPark park1 = new AmusementPark();
        park1.name="Wonderla Bengaluru";
        park1.locationCity="Bengaluru";
        park1.areaAcres=82.0;
        park1.numberOfRides=60;
        park1.ticketPriceAdult=1249.00;
        park1.hasWaterParkSection=true;
        park1.getParkInfo();
        
        System.out.println("Main Ended - Amusement Park Data Display Complete");
    }
}