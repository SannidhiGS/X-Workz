class RailwayStationRunner {

    public static void main(String args[]) {

        Train train = new Train("12627", "Bangalore to Chennai");

        Platform1 platform = new Platform1(1, "Main Platform", train);
			

        RailwayStation station = new RailwayStation("KSR Bengaluru", 10, "Bangalore", platform);
	

        station.getRailwayStationInfo();
    }
}