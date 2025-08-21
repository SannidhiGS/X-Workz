class Network {
    int networkId;
    String name; 
    String type; 
    String protocol; 
    int connectedDevices;
    double maxSpeedMbps; 
    String securityProtocol; 
	
	public void getNetInfo(){
		System.out.println("Network ID: " +networkId);
        System.out.println("Name: " + name);
        System.out.println("Type: " +type);
        System.out.println("Protocol: " + protocol);
        System.out.println("Connected Devices: " + connectedDevices);
        System.out.println("Max Speed: " + maxSpeedMbps + " Mbps");
        System.out.println("Security Protocol: " +securityProtocol);
        System.out.println();
	}
}