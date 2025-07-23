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
        System.out.println("Name: " + casino1.name + ", Location: " + casino1.locationCity + ", Games: " + casino1.numberOfGames + ", Has Hotel: " + casino1.hasHotel + ", Avg Daily Revenue (Millions): " + casino1.averageDailyRevenueMillions + ", Established: " + casino1.yearEstablished);
        System.out.println();

        Casino casino2 = new Casino();
        casino2.name = "Casino Mahjong";
        casino2.locationCity = "Sikkim";
        casino2.numberOfGames = 50;
        casino2.hasHotel = true;
        casino2.averageDailyRevenueMillions = 0.8;
        casino2.yearEstablished = 2007;
        System.out.println("Name: " + casino2.name + ", Location: " + casino2.locationCity + ", Games: " + casino2.numberOfGames + ", Has Hotel: " + casino2.hasHotel + ", Avg Daily Revenue (Millions): " + casino2.averageDailyRevenueMillions + ", Established: " + casino2.yearEstablished);
        System.out.println();

        Casino casino3 = new Casino();
        casino3.name = "Casino Paradise";
        casino3.locationCity = "Goa";
        casino3.numberOfGames = 70;
        casino3.hasHotel = false;
        casino3.averageDailyRevenueMillions = 0.6;
        casino3.yearEstablished = 2011;
        System.out.println("Name: " + casino3.name + ", Location: " + casino3.locationCity + ", Games: " + casino3.numberOfGames + ", Has Hotel: " + casino3.hasHotel + ", Avg Daily Revenue (Millions): " + casino3.averageDailyRevenueMillions + ", Established: " + casino3.yearEstablished);
        System.out.println();

        Casino casino4 = new Casino();
        casino4.name = "Big Daddy Casino";
        casino4.locationCity = "Goa";
        casino4.numberOfGames = 90;
        casino4.hasHotel = true;
        casino4.averageDailyRevenueMillions = 1.2;
        casino4.yearEstablished = 2019;
        System.out.println("Name: " + casino4.name + ", Location: " + casino4.locationCity + ", Games: " + casino4.numberOfGames + ", Has Hotel: " + casino4.hasHotel + ", Avg Daily Revenue (Millions): " + casino4.averageDailyRevenueMillions + ", Established: " + casino4.yearEstablished);
        System.out.println();

        Casino casino5 = new Casino();
        casino5.name = "Casino Sikkim";
        casino5.locationCity = "Sikkim";
        casino5.numberOfGames = 40;
        casino5.hasHotel = true;
        casino5.averageDailyRevenueMillions = 0.5;
        casino5.yearEstablished = 2004;
        System.out.println("Name: " + casino5.name + ", Location: " + casino5.locationCity + ", Games: " + casino5.numberOfGames + ", Has Hotel: " + casino5.hasHotel + ", Avg Daily Revenue (Millions): " + casino5.averageDailyRevenueMillions + ", Established: " + casino5.yearEstablished);
        System.out.println();

        Casino casino6 = new Casino();
        casino6.name = "Majestic Pride Casino";
        casino6.locationCity = "Goa";
        casino6.numberOfGames = 80;
        casino6.hasHotel = true;
        casino6.averageDailyRevenueMillions = 1.0;
        casino6.yearEstablished = 2007;
        System.out.println("Name: " + casino6.name + ", Location: " + casino6.locationCity + ", Games: " + casino6.numberOfGames + ", Has Hotel: " + casino6.hasHotel + ", Avg Daily Revenue (Millions): " + casino6.averageDailyRevenueMillions + ", Established: " + casino6.yearEstablished);
        System.out.println();

        // Adding 14 more casino objects to reach 20
        Casino casino7 = new Casino();
        casino7.name = "Casino Deltin Jaqk";
        casino7.locationCity = "Goa";
        casino7.numberOfGames = 75;
        casino7.hasHotel = true;
        casino7.averageDailyRevenueMillions = 0.9;
        casino7.yearEstablished = 2008;
        System.out.println("Name: " + casino7.name + ", Location: " + casino7.locationCity + ", Games: " + casino7.numberOfGames + ", Has Hotel: " + casino7.hasHotel + ", Avg Daily Revenue (Millions): " + casino7.averageDailyRevenueMillions + ", Established: " + casino7.yearEstablished);
        System.out.println();

        Casino casino8 = new Casino();
        casino8.name = "Casino Carnival";
        casino8.locationCity = "Goa";
        casino8.numberOfGames = 60;
        casino8.hasHotel = false;
        casino8.averageDailyRevenueMillions = 0.7;
        casino8.yearEstablished = 2001;
        System.out.println("Name: " + casino8.name + ", Location: " + casino8.locationCity + ", Games: " + casino8.numberOfGames + ", Has Hotel: " + casino8.hasHotel + ", Avg Daily Revenue (Millions): " + casino8.averageDailyRevenueMillions + ", Established: " + casino8.yearEstablished);
        System.out.println();

        Casino casino9 = new Casino();
        casino9.name = "Casino Pride 2";
        casino9.locationCity = "Goa";
        casino9.numberOfGames = 85;
        casino9.hasHotel = true;
        casino9.averageDailyRevenueMillions = 1.1;
        casino9.yearEstablished = 2014;
        System.out.println("Name: " + casino9.name + ", Location: " + casino9.locationCity + ", Games: " + casino9.numberOfGames + ", Has Hotel: " + casino9.hasHotel + ", Avg Daily Revenue (Millions): " + casino9.averageDailyRevenueMillions + ", Established: " + casino9.yearEstablished);
        System.out.println();

        Casino casino10 = new Casino();
        casino10.name = "Casino Strike";
        casino10.locationCity = "Goa";
        casino10.numberOfGames = 65;
        casino10.hasHotel = true;
        casino10.averageDailyRevenueMillions = 0.75;
        casino10.yearEstablished = 2016;
        System.out.println("Name: " + casino10.name + ", Location: " + casino10.locationCity + ", Games: " + casino10.numberOfGames + ", Has Hotel: " + casino10.hasHotel + ", Avg Daily Revenue (Millions): " + casino10.averageDailyRevenueMillions + ", Established: " + casino10.yearEstablished);
        System.out.println();

        Casino casino11 = new Casino();
        casino11.name = "The Zuri White Sands Casino";
        casino11.locationCity = "Goa";
        casino11.numberOfGames = 30;
        casino11.hasHotel = true;
        casino11.averageDailyRevenueMillions = 0.4;
        casino11.yearEstablished = 2006;
        System.out.println("Name: " + casino11.name + ", Location: " + casino11.locationCity + ", Games: " + casino11.numberOfGames + ", Has Hotel: " + casino11.hasHotel + ", Avg Daily Revenue (Millions): " + casino11.averageDailyRevenueMillions + ", Established: " + casino11.yearEstablished);
        System.out.println();

        Casino casino12 = new Casino();
        casino12.name = "Crown Casino";
        casino12.locationCity = "Goa";
        casino12.numberOfGames = 55;
        casino12.hasHotel = true;
        casino12.averageDailyRevenueMillions = 0.65;
        casino12.yearEstablished = 2009;
        System.out.println("Name: " + casino12.name + ", Location: " + casino12.locationCity + ", Games: " + casino12.numberOfGames + ", Has Hotel: " + casino12.hasHotel + ", Avg Daily Revenue (Millions): " + casino12.averageDailyRevenueMillions + ", Established: " + casino12.yearEstablished);
        System.out.println();

        Casino casino13 = new Casino();
        casino13.name = "Chances Casino";
        casino13.locationCity = "Goa";
        casino13.numberOfGames = 45;
        casino13.hasHotel = true;
        casino13.averageDailyRevenueMillions = 0.55;
        casino13.yearEstablished = 2000;
        System.out.println("Name: " + casino13.name + ", Location: " + casino13.locationCity + ", Games: " + casino13.numberOfGames + ", Has Hotel: " + casino13.hasHotel + ", Avg Daily Revenue (Millions): " + casino13.averageDailyRevenueMillions + ", Established: " + casino13.yearEstablished);
        System.out.println();

        Casino casino14 = new Casino();
        casino14.name = "Grand 7 Casino";
        casino14.locationCity = "Goa";
        casino14.numberOfGames = 70;
        casino14.hasHotel = true;
        casino14.averageDailyRevenueMillions = 0.8;
        casino14.yearEstablished = 2018;
        System.out.println("Name: " + casino14.name + ", Location: " + casino14.locationCity + ", Games: " + casino14.numberOfGames + ", Has Hotel: " + casino14.hasHotel + ", Avg Daily Revenue (Millions): " + casino14.averageDailyRevenueMillions + ", Established: " + casino14.yearEstablished);
        System.out.println();

        Casino casino15 = new Casino();
        casino15.name = "Golden Peace Casino";
        casino15.locationCity = "Nepal"; // Example of a casino outside India, but nearby
        casino15.numberOfGames = 50;
        casino15.hasHotel = true;
        casino15.averageDailyRevenueMillions = 0.6;
        casino15.yearEstablished = 2010;
        System.out.println("Name: " + casino15.name + ", Location: " + casino15.locationCity + ", Games: " + casino15.numberOfGames + ", Has Hotel: " + casino15.hasHotel + ", Avg Daily Revenue (Millions): " + casino15.averageDailyRevenueMillions + ", Established: " + casino15.yearEstablished);
        System.out.println();

        Casino casino16 = new Casino();
        casino16.name = "Casino Royale (Nepal)";
        casino16.locationCity = "Nepal";
        casino16.numberOfGames = 80;
        casino16.hasHotel = true;
        casino16.averageDailyRevenueMillions = 1.0;
        casino16.yearEstablished = 2001;
        System.out.println("Name: " + casino16.name + ", Location: " + casino16.locationCity + ", Games: " + casino16.numberOfGames + ", Has Hotel: " + casino16.hasHotel + ", Avg Daily Revenue (Millions): " + casino16.averageDailyRevenueMillions + ", Established: " + casino16.yearEstablished);
        System.out.println();

        Casino casino17 = new Casino();
        casino17.name = "The Deltin";
        casino17.locationCity = "Daman"; // Another Indian location with casinos
        casino17.numberOfGames = 95;
        casino17.hasHotel = true;
        casino17.averageDailyRevenueMillions = 1.3;
        casino17.yearEstablished = 2014;
        System.out.println("Name: " + casino17.name + ", Location: " + casino17.locationCity + ", Games: " + casino17.numberOfGames + ", Has Hotel: " + casino17.hasHotel + ", Avg Daily Revenue (Millions): " + casino17.averageDailyRevenueMillions + ", Established: " + casino17.yearEstablished);
        System.out.println();

        Casino casino18 = new Casino();
        casino18.name = "Casino Goa";
        casino18.locationCity = "Goa";
        casino18.numberOfGames = 60;
        casino18.hasHotel = false;
        casino18.averageDailyRevenueMillions = 0.6;
        casino18.yearEstablished = 1999;
        System.out.println("Name: " + casino18.name + ", Location: " + casino18.locationCity + ", Games: " + casino18.numberOfGames + ", Has Hotel: " + casino18.hasHotel + ", Avg Daily Revenue (Millions): " + casino18.averageDailyRevenueMillions + ", Established: " + casino18.yearEstablished);
        System.out.println();

        Casino casino19 = new Casino();
        casino19.name = "Casino Palms";
        casino19.locationCity = "Goa";
        casino19.numberOfGames = 40;
        casino19.hasHotel = true;
        casino19.averageDailyRevenueMillions = 0.45;
        casino19.yearEstablished = 2012;
        System.out.println("Name: " + casino19.name + ", Location: " + casino19.locationCity + ", Games: " + casino19.numberOfGames + ", Has Hotel: " + casino19.hasHotel + ", Avg Daily Revenue (Millions): " + casino19.averageDailyRevenueMillions + ", Established: " + casino19.yearEstablished);
        System.out.println();

        Casino casino20 = new Casino();
        casino20.name = "Casino Park";
        casino20.locationCity = "Sikkim";
        casino20.numberOfGames = 35;
        casino20.hasHotel = true;
        casino20.averageDailyRevenueMillions = 0.35;
        casino20.yearEstablished = 2005;
        System.out.println("Name: " + casino20.name + ", Location: " + casino20.locationCity + ", Games: " + casino20.numberOfGames + ", Has Hotel: " + casino20.hasHotel + ", Avg Daily Revenue (Millions): " + casino20.averageDailyRevenueMillions + ", Established: " + casino20.yearEstablished);
        System.out.println();

        System.out.println("Main Ended - Casino Data Display Complete");
    }
}
