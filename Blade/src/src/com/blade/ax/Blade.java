package src.com.blade.ax;

public class Blade {

    int id;
    String material;
    String brand;

    Blade(int id,String material,String brand){
        this.id=id;
        this.material=material;
        this.brand=brand;
    }

    void getBladeDetails(){
        System.out.println("The blade Id: "+id);
        System.out.println("The material: "+material);
        System.out.println("The brand: "+brand);
    }
}
