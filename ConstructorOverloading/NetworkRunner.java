public class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Network Data");

        Network net1 = new Network("Corporate LAN");
        net1.getNetworkInfo();

        Network net2 = new Network("Wireless", "WiFi 6");
        net2.getNetworkInfo();

        Network net3 = new Network(1000.0, 200);
        net3.getNetworkInfo();

        Network net4 = new Network(true, "New York Data Center", "Alice Johnson");
        net4.getNetworkInfo();

        System.out.println("Main Ended - Network Data");
    }
}
