package plastics;

public class Plastic {

    public int id;
    public String brand;
    public double price;

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void getPlasticDetails(){
        System.out.println("The plastic id: "+id);
        System.out.println("The plastic brand: "+brand);
        System.out.println("The price "+price);
    }
}
