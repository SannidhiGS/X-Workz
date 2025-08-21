class NetworkRunner {
    public static void main(String args[]) {
        System.out.println("Main Started - Network Configurations Display");

        Network network1 = new Network();
        network1.networkId = 101;
        network1.name = "Office LAN";
        network1.type = "LAN";
        network1.protocol = "Ethernet";
        network1.connectedDevices = 50;
        network1.maxSpeedMbps = 1000.0;
        network1.securityProtocol = "WPA2 Enterprise";

        network1.getNetInfo();

        Network network2 = new Network();
        network2.networkId = 102;
        network2.name = "Home Wi-Fi";
        network2.type = "WLAN";
        network2.protocol = "Wi-Fi 5 (802.11ac)";
        network2.connectedDevices = 15;
        network2.maxSpeedMbps = 867.0;
        network2.securityProtocol = "WPA2-PSK";

        network2.getNetInfo();
		
        Network network3 = new Network();
        network3.networkId = 103;
        network3.name = "Guest Network";
        network3.type = "WLAN";
        network3.protocol = "Wi-Fi 4 (802.11n)";
        network3.connectedDevices = 8;
        network3.maxSpeedMbps = 150.0;
        network3.securityProtocol = "WPA2-PSK";

        network3.getNetInfo();

        Network network4 = new Network();
        network4.networkId = 104;
        network4.name = "Mobile Data (5G)";
        network4.type = "WAN";
        network4.protocol = "5G NR";
        network4.connectedDevices = 1; // Your phone
        network4.maxSpeedMbps = 200.0; // Varies widely
        network4.securityProtocol = "Carrier Encrypted";

        network4.getNetInfo();

        Network network5 = new Network();
        network5.networkId = 105;
        network5.name = "Data Center Network";
        network5.type = "LAN";
        network5.protocol = "10 Gigabit Ethernet";
        network5.connectedDevices = 200;
        network5.maxSpeedMbps = 10000.0;
        network5.securityProtocol = "ACLs & Firewalls";

        network5.getNetInfo();

        Network network6 = new Network();
        network6.networkId = 106;
        network6.name = "IoT Home Network";
        network6.type = "WLAN";
        network6.protocol = "Zigbee/Wi-Fi";
        network6.connectedDevices = 30;
        network6.maxSpeedMbps = 50.0;
        network6.securityProtocol = "WPA3";

        network6.getNetInfo();

        Network network7 = new Network();
        network7.networkId = 107;
        network7.name = "Public Wi-Fi Cafe";
        network7.type = "WLAN";
        network7.protocol = "Wi-Fi 4";
        network7.connectedDevices = 25;
        network7.maxSpeedMbps = 20.0;
        network7.securityProtocol = "Open/Captive Portal";

        network7.getNetInfo();

        Network network8 = new Network();
        network8.networkId = 108;
        network8.name = "VPN Tunnel";
        network8.type = "WAN";
        network8.protocol = "IPSec/OpenVPN";
        network8.connectedDevices = 1;
        network8.maxSpeedMbps = 100.0;
        network8.securityProtocol = "Strong Encryption";

        network8.getNetInfo();

        Network network9 = new Network();
        network9.networkId = 109;
        network9.name = "Campus Network (University)";
        network9.type = "MAN";
        network9.protocol = "Gigabit Ethernet";
        network9.connectedDevices = 1000;
        network9.maxSpeedMbps = 1000.0;
        network9.securityProtocol = "802.1X";

        network9.getNetInfo();

        Network network10 = new Network();
        network10.networkId = 110;
        network10.name = "Bluetooth Mesh";
        network10.type = "PAN"; // Personal Area Network
        network10.protocol = "Bluetooth Low Energy";
        network10.connectedDevices = 7;
        network10.maxSpeedMbps = 1.0;
        network10.securityProtocol = "AES-128";

        network10.getNetInfo();

        Network network11 = new Network();
        network11.networkId = 111;
        network11.name = "5G Private Network";
        network11.type = "WAN";
        network11.protocol = "5G URLLC";
        network11.connectedDevices = 500;
        network11.maxSpeedMbps = 10000.0;
        network11.securityProtocol = "Private 5G Security";

        network11.getNetInfo();

        Network network12 = new Network();
        network12.networkId = 112;
        network12.name = "Satellite Internet";
        network12.type = "WAN";
        network12.protocol = "DVB-S2";
        network12.connectedDevices = 1;
        network12.maxSpeedMbps = 100.0;
        network12.securityProtocol = "Proprietary Encryption";

        network12.getNetInfo();

        Network network13 = new Network();
        network13.networkId = 113;
        network13.name = "VPN - Remote Access";
        network13.type = "WAN";
        network13.protocol = "SSL VPN";
        network13.connectedDevices = 1;
        network13.maxSpeedMbps = 50.0;
        network13.securityProtocol = "TLS";

        network13.getNetInfo();

        Network network14 = new Network();
        network14.networkId = 114;
        network14.name = "Local Development Env";
        network14.type = "LAN";
        network14.protocol = "Loopback";
        network14.connectedDevices = 1;
        network14.maxSpeedMbps = 10000.0; // Virtual, very fast
        network14.securityProtocol = "None (Local)";

        network14.getNetInfo();

        Network network15 = new Network();
        network15.networkId = 115;
        network15.name = "Ad-Hoc Network";
        network15.type = "WLAN";
        network15.protocol = "Wi-Fi Direct";
        network15.connectedDevices = 2;
        network15.maxSpeedMbps = 10.0;
        network15.securityProtocol = "WPA2-Personal";

        network15.getNetInfo();

        System.out.println("Main Ended - Network Configurations Display Complete");
    }
}