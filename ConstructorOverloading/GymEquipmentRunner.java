public class GymEquipmentRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Gym Equipment Data");

        GymEquipment g1 = new GymEquipment("Adjustable Dumbbell");
        g1.getEquipmentInfo();

        GymEquipment g2 = new GymEquipment("Strength", "PowerMax");
        g2.getEquipmentInfo();

        GymEquipment g3 = new GymEquipment(8999.99, 200);
        g3.getEquipmentInfo();

        GymEquipment g4 = new GymEquipment("Steel", true, "Delhi");
        g4.getEquipmentInfo();

        System.out.println("Main Ended - Gym Equipment Data");
    }
}
