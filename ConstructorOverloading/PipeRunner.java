public class PipeRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Pipe Data");

        Pipe pipe1 = new Pipe("PVC");
        pipe1.getPipeInfo();

        Pipe pipe2 = new Pipe(10.5, 6.0);
        pipe2.getPipeInfo();

        Pipe pipe3 = new Pipe("Aquaflow", 250.75);
        pipe3.getPipeInfo();

        Pipe pipe4 = new Pipe(true, "Chennai", "Water Supply");
        pipe4.getPipeInfo();

        System.out.println("Main Ended - Pipe Data");
    }
}
