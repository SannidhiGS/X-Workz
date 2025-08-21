package src.com.fun.ammusement;

class AmusementPark {
    String name;
    String locationCity;
    double areaAcres;
    int numberOfRides;
    double ticketPriceAdult;
    boolean hasWaterParkSection;

    public void getName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    public void setLocationCity(String locationCity){
        this.locationCity=locationCity;
    }
    String getLocationCity(){
        return locationCity;
    }
    public void setAreaAcres(double areaAcres){
        this.areaAcres=areaAcres;
    }
    double getAreaAcres(){
        return areaAcres;
    }
    public void setNumberOfRides(int numberOfRides){
        this.numberOfRides=numberOfRides;
    }
    int getNumberOfRides(){
        return numberOfRides;
    }
    public void setTicketPriceAdult(){
        this.ticketPriceAdult=ticketPriceAdult;
    }
    double getTicketPriceAdult(){
        return ticketPriceAdult;
    }
    public void setHasWaterParkSection(){
        this.hasWaterParkSection=hasWaterParkSection;
    }
    boolean getHasWaterParkSection(){
        return hasWaterParkSection;
    }
public void getParkInfo() {

    System.out.println("Name: " + name);
    System.out.println("Location: " + locationCity);
    System.out.println("Area (Acres): " +areaAcres);
    System.out.println("Number of Rides: " + numberOfRides);
    System.out.println("Adult Ticket Price: Rs." + ticketPriceAdult);
    System.out.println("Has Water Park: " +hasWaterParkSection);
    System.out.println();
}

}
