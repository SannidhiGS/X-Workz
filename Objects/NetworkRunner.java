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

        System.out.println("Network ID: " + network1.networkId);
        System.out.println("Name: " + network1.name);
        System.out.println("Type: " + network1.type);
        System.out.println("Protocol: " + network1.protocol);
        System.out.println("Connected Devices: " + network1.connectedDevices);
        System.out.println("Max Speed: " + network1.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network1.securityProtocol);
        System.out.println();

        Network network2 = new Network();
        network2.networkId = 102;
        network2.name = "Home Wi-Fi";
        network2.type = "WLAN";
        network2.protocol = "Wi-Fi 5 (802.11ac)";
        network2.connectedDevices = 15;
        network2.maxSpeedMbps = 867.0;
        network2.securityProtocol = "WPA2-PSK";

        System.out.println("Network ID: " + network2.networkId);
        System.out.println("Name: " + network2.name);
        System.out.println("Type: " + network2.type);
        System.out.println("Protocol: " + network2.protocol);
        System.out.println("Connected Devices: " + network2.connectedDevices);
        System.out.println("Max Speed: " + network2.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network2.securityProtocol);
        System.out.println();

        Network network3 = new Network();
        network3.networkId = 103;
        network3.name = "Guest Network";
        network3.type = "WLAN";
        network3.protocol = "Wi-Fi 4 (802.11n)";
        network3.connectedDevices = 8;
        network3.maxSpeedMbps = 150.0;
        network3.securityProtocol = "WPA2-PSK";

        System.out.println("Network ID: " + network3.networkId);
        System.out.println("Name: " + network3.name);
        System.out.println("Type: " + network3.type);
        System.out.println("Protocol: " + network3.protocol);
        System.out.println("Connected Devices: " + network3.connectedDevices);
        System.out.println("Max Speed: " + network3.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network3.securityProtocol);
        System.out.println();

        Network network4 = new Network();
        network4.networkId = 104;
        network4.name = "Mobile Data (5G)";
        network4.type = "WAN";
        network4.protocol = "5G NR";
        network4.connectedDevices = 1; // Your phone
        network4.maxSpeedMbps = 200.0; // Varies widely
        network4.securityProtocol = "Carrier Encrypted";

        System.out.println("Network ID: " + network4.networkId);
        System.out.println("Name: " + network4.name);
        System.out.println("Type: " + network4.type);
        System.out.println("Protocol: " + network4.protocol);
        System.out.println("Connected Devices: " + network4.connectedDevices);
        System.out.println("Max Speed: " + network4.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network4.securityProtocol);
        System.out.println();

        Network network5 = new Network();
        network5.networkId = 105;
        network5.name = "Data Center Network";
        network5.type = "LAN";
        network5.protocol = "10 Gigabit Ethernet";
        network5.connectedDevices = 200;
        network5.maxSpeedMbps = 10000.0;
        network5.securityProtocol = "ACLs & Firewalls";

        System.out.println("Network ID: " + network5.networkId);
        System.out.println("Name: " + network5.name);
        System.out.println("Type: " + network5.type);
        System.out.println("Protocol: " + network5.protocol);
        System.out.println("Connected Devices: " + network5.connectedDevices);
        System.out.println("Max Speed: " + network5.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network5.securityProtocol);
        System.out.println();

        Network network6 = new Network();
        network6.networkId = 106;
        network6.name = "IoT Home Network";
        network6.type = "WLAN";
        network6.protocol = "Zigbee/Wi-Fi";
        network6.connectedDevices = 30;
        network6.maxSpeedMbps = 50.0;
        network6.securityProtocol = "WPA3";

        System.out.println("Network ID: " + network6.networkId);
        System.out.println("Name: " + network6.name);
        System.out.println("Type: " + network6.type);
        System.out.println("Protocol: " + network6.protocol);
        System.out.println("Connected Devices: " + network6.connectedDevices);
        System.out.println("Max Speed: " + network6.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network6.securityProtocol);
        System.out.println();

        Network network7 = new Network();
        network7.networkId = 107;
        network7.name = "Public Wi-Fi Cafe";
        network7.type = "WLAN";
        network7.protocol = "Wi-Fi 4";
        network7.connectedDevices = 25;
        network7.maxSpeedMbps = 20.0;
        network7.securityProtocol = "Open/Captive Portal";

        System.out.println("Network ID: " + network7.networkId);
        System.out.println("Name: " + network7.name);
        System.out.println("Type: " + network7.type);
        System.out.println("Protocol: " + network7.protocol);
        System.out.println("Connected Devices: " + network7.connectedDevices);
        System.out.println("Max Speed: " + network7.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network7.securityProtocol);
        System.out.println();

        Network network8 = new Network();
        network8.networkId = 108;
        network8.name = "VPN Tunnel";
        network8.type = "WAN";
        network8.protocol = "IPSec/OpenVPN";
        network8.connectedDevices = 1;
        network8.maxSpeedMbps = 100.0;
        network8.securityProtocol = "Strong Encryption";

        System.out.println("Network ID: " + network8.networkId);
        System.out.println("Name: " + network8.name);
        System.out.println("Type: " + network8.type);
        System.out.println("Protocol: " + network8.protocol);
        System.out.println("Connected Devices: " + network8.connectedDevices);
        System.out.println("Max Speed: " + network8.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network8.securityProtocol);
        System.out.println();

        Network network9 = new Network();
        network9.networkId = 109;
        network9.name = "Campus Network (University)";
        network9.type = "MAN";
        network9.protocol = "Gigabit Ethernet";
        network9.connectedDevices = 1000;
        network9.maxSpeedMbps = 1000.0;
        network9.securityProtocol = "802.1X";

        System.out.println("Network ID: " + network9.networkId);
        System.out.println("Name: " + network9.name);
        System.out.println("Type: " + network9.type);
        System.out.println("Protocol: " + network9.protocol);
        System.out.println("Connected Devices: " + network9.connectedDevices);
        System.out.println("Max Speed: " + network9.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network9.securityProtocol);
        System.out.println();

        Network network10 = new Network();
        network10.networkId = 110;
        network10.name = "Bluetooth Mesh";
        network10.type = "PAN"; // Personal Area Network
        network10.protocol = "Bluetooth Low Energy";
        network10.connectedDevices = 7;
        network10.maxSpeedMbps = 1.0;
        network10.securityProtocol = "AES-128";

        System.out.println("Network ID: " + network10.networkId);
        System.out.println("Name: " + network10.name);
        System.out.println("Type: " + network10.type);
        System.out.println("Protocol: " + network10.protocol);
        System.out.println("Connected Devices: " + network10.connectedDevices);
        System.out.println("Max Speed: " + network10.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network10.securityProtocol);
        System.out.println();

        Network network11 = new Network();
        network11.networkId = 111;
        network11.name = "5G Private Network";
        network11.type = "WAN";
        network11.protocol = "5G URLLC";
        network11.connectedDevices = 500;
        network11.maxSpeedMbps = 10000.0;
        network11.securityProtocol = "Private 5G Security";

        System.out.println("Network ID: " + network11.networkId);
        System.out.println("Name: " + network11.name);
        System.out.println("Type: " + network11.type);
        System.out.println("Protocol: " + network11.protocol);
        System.out.println("Connected Devices: " + network11.connectedDevices);
        System.out.println("Max Speed: " + network11.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network11.securityProtocol);
        System.out.println();

        Network network12 = new Network();
        network12.networkId = 112;
        network12.name = "Satellite Internet";
        network12.type = "WAN";
        network12.protocol = "DVB-S2";
        network12.connectedDevices = 1;
        network12.maxSpeedMbps = 100.0;
        network12.securityProtocol = "Proprietary Encryption";

        System.out.println("Network ID: " + network12.networkId);
        System.out.println("Name: " + network12.name);
        System.out.println("Type: " + network12.type);
        System.out.println("Protocol: " + network12.protocol);
        System.out.println("Connected Devices: " + network12.connectedDevices);
        System.out.println("Max Speed: " + network12.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network12.securityProtocol);
        System.out.println();

        Network network13 = new Network();
        network13.networkId = 113;
        network13.name = "VPN - Remote Access";
        network13.type = "WAN";
        network13.protocol = "SSL VPN";
        network13.connectedDevices = 1;
        network13.maxSpeedMbps = 50.0;
        network13.securityProtocol = "TLS";

        System.out.println("Network ID: " + network13.networkId);
        System.out.println("Name: " + network13.name);
        System.out.println("Type: " + network13.type);
        System.out.println("Protocol: " + network13.protocol);
        System.out.println("Connected Devices: " + network13.connectedDevices);
        System.out.println("Max Speed: " + network13.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network13.securityProtocol);
        System.out.println();

        Network network14 = new Network();
        network14.networkId = 114;
        network14.name = "Local Development Env";
        network14.type = "LAN";
        network14.protocol = "Loopback";
        network14.connectedDevices = 1;
        network14.maxSpeedMbps = 10000.0; // Virtual, very fast
        network14.securityProtocol = "None (Local)";

        System.out.println("Network ID: " + network14.networkId);
        System.out.println("Name: " + network14.name);
        System.out.println("Type: " + network14.type);
        System.out.println("Protocol: " + network14.protocol);
        System.out.println("Connected Devices: " + network14.connectedDevices);
        System.out.println("Max Speed: " + network14.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network14.securityProtocol);
        System.out.println();

        Network network15 = new Network();
        network15.networkId = 115;
        network15.name = "Ad-Hoc Network";
        network15.type = "WLAN";
        network15.protocol = "Wi-Fi Direct";
        network15.connectedDevices = 2;
        network15.maxSpeedMbps = 10.0;
        network15.securityProtocol = "WPA2-Personal";

        System.out.println("Network ID: " + network15.networkId);
        System.out.println("Name: " + network15.name);
        System.out.println("Type: " + network15.type);
        System.out.println("Protocol: " + network15.protocol);
        System.out.println("Connected Devices: " + network15.connectedDevices);
        System.out.println("Max Speed: " + network15.maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " + network15.securityProtocol);
        System.out.println();

        System.out.println("Main Ended - Network Configurations Display Complete");
    }
}