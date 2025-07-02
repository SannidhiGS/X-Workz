class PlayStation {
    public static void main(String args[]) {
         String khoKho = "KhoKho";
		String kabaddi = "Kabaddi";
		String gilliDanda = "GilliDanda";
		String kancha = "Kancha";
		String lagori = "Lagori";
		String kithKith = "KithKith";
		String pittu = "Pittu";
		String vishAmrit = "VishAmrit";
		String chorPolice = "ChorPolice";
		String antakshari = "Antakshari";
		String games[] = {khoKho, kabaddi, gilliDanda, kancha, lagori, kithKith, pittu, vishAmrit, chorPolice, antakshari};
	 
        System.out.println("The number of games" + games.length);
        //System.out.println(games[0]+" "+games[1]+" "+games[2]+" "+games[3]+" "+games[4]+" "+games[5]+" "+games[6]+" "+games[7]+" "+games[8]+" "+games[9]);
		for(String game:games){
			System.out.println(game);
		}
	}
}
