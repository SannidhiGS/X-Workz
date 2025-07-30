public class Network {
    String name;
    String type;
    String protocol;
    double bandwidth;
    int maxDevices;
    boolean isSecure;
    String location;
    String admin;

    Network() {
    }

    Network(String name) {
        this.name = name;
    }

    Network(String type, String protocol) {
        this.type = type;
        this.protocol = protocol;
    }

    Network(double bandwidth, int maxDevices) {
        this.bandwidth = bandwidth;
        this.maxDevices = maxDevices;
    }

    Network(boolean isSecure, String location, String admin) {
        this.isSecure = isSecure;
        this.location = location;
        this.admin = admin;
    }

    void getNetworkInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Protocol: " + protocol);
        System.out.println("Bandwidth: " + bandwidth + " Mbps");
        System.out.println("Max Devices: " + maxDevices);
        System.out.println("Secure: " + isSecure);
        System.out.println("Location: " + location);
        System.out.println("Admin: " + admin);
        System.out.println();
    }
}
