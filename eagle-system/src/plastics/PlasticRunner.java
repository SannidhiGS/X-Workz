package plastics;

public class PlasticRunner {
    public static void main(String args[]){
        Plastic plastic=new Plastic();
        plastic.getPlasticDetails();
        plastic.brand="Eagle";
        plastic.price=12.00;
        plastic.id=20;
        plastic.getPlasticDetails();
    }
}
