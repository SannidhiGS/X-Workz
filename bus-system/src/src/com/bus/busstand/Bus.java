package src.com.bus.busstand;

public class Bus {

    String busId;
    String busRoute;

    Bus(String busId,String busRoute){
        this.busId=busId;
        this.busRoute=busRoute;
    }

    public void getBusDetails(){

        System.out.println("The bus ID is "+busId);
        System.out.println("The bus Route "+busRoute);

    }
}
