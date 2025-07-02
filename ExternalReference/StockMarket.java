class StockMarket {
    public static void main(String args[]) {
       static String reliance = "Reliance";
		static String tcs = "TCS";
		static String infosys = "Infosys";
		static String hdfcBank = "HDFCBank";
		static String iciciBank = "ICICIBank";
		static String itc = "ITC";
		static String bhartiAirtel = "BhartiAirtel";
		static String hul = "HUL";
		static String axisBank = "AxisBank";
		static String larsenToubro = "LarsenToubro";

		static String stockNames[] = {reliance, tcs, infosys, hdfcBank, iciciBank, itc, bhartiAirtel, hul, axisBank, larsenToubro};

        System.out.println("The number of stocks " + stockNames.length);
        //System.out.println(stockNames[0] + " " + stockNames[1] + " " + stockNames[2]+" "+ stockNames[3]+" "+stockNames[4] +" "+stockNames[5] + " "+ stockNames[6] + " " + stockNames[7] + " " + stockNames[8] + " " + stockNames[9]);
		for(String stockName:stockNames){
			System.out.println(stockName);
		}
	}
}
