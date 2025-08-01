class RailwayStation {

    String stationName;
    int noOfPlatforms;
    String location;

    Platform1 platform;

    RailwayStation(String stationName, int noOfPlatforms, String location, Platform1 platform) {
        this.stationName = stationName;
        this.noOfPlatforms = noOfPlatforms;
        this.location = location;
        this.platform = platform;
    }

    public void getRailwayStationInfo() {
        System.out.println("The railway station name: " + stationName);
        System.out.println("The number of platforms: " + noOfPlatforms);
        System.out.println("The location is: " + location);
        this.platform.getPlatformInfo();
    }
}