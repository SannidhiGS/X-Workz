package src.com.management.hotel;

public class Hotel {
    int hotelID;
    String hotelName;
    String hotelType;

    Hotel(int hotelID,String hotelName,String HotelType ){
        this.hotelID=hotelID;
        this.hotelName=hotelName;
        this.hotelType=hotelType;
    }

    void getHotelDetails(){
        System.out.println("The hotel id: "+hotelID);
        System.out.println("The hotel name: "+hotelName);
        System.out.println("The hotel type: "+hotelType);
    }
}
