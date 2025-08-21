package src.com.raymonds.blazer;

public class Blazer {

    int blazerId;
    String brand;
    char size;

    Blazer(int blazerId,String brand,char size){
        this.blazerId=blazerId;
        this.brand=brand;
        this.size=size;
    }

    void getBlazerDetails(){
        System.out.println("The blazer id: "+blazerId);
        System.out.println("The brand name: "+brand);
        System.out.print("The size is :"+size);
    }
}
