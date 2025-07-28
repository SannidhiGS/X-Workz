class CasinoRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Casino Data");

        Casino casino1 = new Casino();
        casino1.name = "Deltin Royale";
        casino1.locationCity = "Goa";
        casino1.numberOfGames = 100;
        casino1.hasHotel = true;
        casino1.averageDailyRevenueMillions = 1.5;
        casino1.yearEstablished = 2013;
        casino1.getCasinoInfo();

        Casino casino2 = new Casino();
        casino2.name = "Casino Mahjong";
        casino2.locationCity = "Sikkim";
        casino2.numberOfGames = 50;
        casino2.hasHotel = true;
        casino2.averageDailyRevenueMillions = 0.8;
        casino2.yearEstablished = 2007;
        casino2.getCasinoInfo();

        Casino casino3 = new Casino();
        casino3.name = "Casino Paradise";
        casino3.locationCity = "Goa";
        casino3.numberOfGames = 70;
        casino3.hasHotel = false;
        casino3.averageDailyRevenueMillions = 0.6;
        casino3.yearEstablished = 2011;
        casino3.getCasinoInfo();

        Casino casino4 = new Casino();
        casino4.name = "Big Daddy Casino";
        casino4.locationCity = "Goa";
        casino4.numberOfGames = 90;
        casino4.hasHotel = true;
        casino4.averageDailyRevenueMillions = 1.2;
        casino4.yearEstablished = 2019;
        casino4.getCasinoInfo();

        Casino casino5 = new Casino();
        casino5.name = "Casino Sikkim";
        casino5.locationCity = "Sikkim";
        casino5.numberOfGames = 40;
        casino5.hasHotel = true;
        casino5.averageDailyRevenueMillions = 0.5;
        casino5.yearEstablished = 2004;
        casino5.getCasinoInfo();
		
        Casino casino6 = new Casino();
        casino6.name = "Majestic Pride Casino";
        casino6.locationCity = "Goa";
        casino6.numberOfGames = 80;
        casino6.hasHotel = true;
        casino6.averageDailyRevenueMillions = 1.0;
        casino6.yearEstablished = 2007;
        casino6.getCasinoInfo();

        // Adding 14 more casino objects to reach 20
        Casino casino7 = new Casino();
        casino7.name = "Casino Deltin Jaqk";
        casino7.locationCity = "Goa";
        casino7.numberOfGames = 75;
        casino7.hasHotel = true;
        casino7.averageDailyRevenueMillions = 0.9;
        casino7.yearEstablished = 2008;
        casino7.getCasinoInfo();

        Casino casino8 = new Casino();
        casino8.name = "Casino Carnival";
        casino8.locationCity = "Goa";
        casino8.numberOfGames = 60;
        casino8.hasHotel = false;
        casino8.averageDailyRevenueMillions = 0.7;
        casino8.yearEstablished = 2001;
        casino8.getCasinoInfo();
		
        Casino casino9 = new Casino();
        casino9.name = "Casino Pride 2";
        casino9.locationCity = "Goa";
        casino9.numberOfGames = 85;
        casino9.hasHotel = true;
        casino9.averageDailyRevenueMillions = 1.1;
        casino9.yearEstablished = 2014;
        casino9.getCasinoInfo();

        Casino casino10 = new Casino();
        casino10.name = "Casino Strike";
        casino10.locationCity = "Goa";
        casino10.numberOfGames = 65;
        casino10.hasHotel = true;
        casino10.averageDailyRevenueMillions = 0.75;
        casino10.yearEstablished = 2016;
        casino10.getCasinoInfo();

        Casino casino11 = new Casino();
        casino11.name = "The Zuri White Sands Casino";
        casino11.locationCity = "Goa";
        casino11.numberOfGames = 30;
        casino11.hasHotel = true;
        casino11.averageDailyRevenueMillions = 0.4;
        casino11.yearEstablished = 2006;
        casino11.getCasinoInfo();

        Casino casino12 = new Casino();
        casino12.name = "Crown Casino";
        casino12.locationCity = "Goa";
        casino12.numberOfGames = 55;
        casino12.hasHotel = true;
        casino12.averageDailyRevenueMillions = 0.65;
        casino12.yearEstablished = 2009;
        casino12.getCasinoInfo();

        Casino casino13 = new Casino();
        casino13.name = "Chances Casino";
        casino13.locationCity = "Goa";
        casino13.numberOfGames = 45;
        casino13.hasHotel = true;
        casino13.averageDailyRevenueMillions = 0.55;
        casino13.yearEstablished = 2000;
       casino13.getCasinoInfo();

        Casino casino14 = new Casino();
        casino14.name = "Grand 7 Casino";
        casino14.locationCity = "Goa";
        casino14.numberOfGames = 70;
        casino14.hasHotel = true;
        casino14.averageDailyRevenueMillions = 0.8;
        casino14.yearEstablished = 2018;
        casino14.getCasinoInfo();

        Casino casino15 = new Casino();
        casino15.name = "Golden Peace Casino";
        casino15.locationCity = "Nepal"; // Example of a casino outside India, but nearby
        casino15.numberOfGames = 50;
        casino15.hasHotel = true;
        casino15.averageDailyRevenueMillions = 0.6;
        casino15.yearEstablished = 2010;
        casino15.getCasinoInfo();
		
        Casino casino16 = new Casino();
        casino16.name = "Casino Royale (Nepal)";
        casino16.locationCity = "Nepal";
        casino16.numberOfGames = 80;
        casino16.hasHotel = true;
        casino16.averageDailyRevenueMillions = 1.0;
        casino16.yearEstablished = 2001;
		casino16.getCasinoInfo();

        Casino casino17 = new Casino();
        casino17.name = "The Deltin";
        casino17.locationCity = "Daman"; 
        casino17.numberOfGames = 95;
        casino17.hasHotel = true;
        casino17.averageDailyRevenueMillions = 1.3;
        casino17.yearEstablished = 2014;
        casino17.getCasinoInfo();

        Casino casino18 = new Casino();
        casino18.name = "Casino Goa";
        casino18.locationCity = "Goa";
        casino18.numberOfGames = 60;
        casino18.hasHotel = false;
        casino18.averageDailyRevenueMillions = 0.6;
        casino18.yearEstablished = 1999;
        casino18.getCasinoInfo();

        Casino casino19 = new Casino();
        casino19.name = "Casino Palms";
        casino19.locationCity = "Goa";
        casino19.numberOfGames = 40;
        casino19.hasHotel = true;
        casino19.averageDailyRevenueMillions = 0.45;
        casino19.yearEstablished = 2012;
        casino19.getCasinoInfo();

        Casino casino20 = new Casino();
        casino20.name = "Casino Park";
        casino20.locationCity = "Sikkim";
        casino20.numberOfGames = 35;
        casino20.hasHotel = true;
        casino20.averageDailyRevenueMillions = 0.35;
        casino20.yearEstablished = 2005;
        casino20.getCasinoInfo();

        System.out.println("Main Ended - Casino Data Display Complete");
    }
}
