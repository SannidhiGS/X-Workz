class CoinsRunner {
    public static void main(String[] args) {

        Coins c1 = new Coins("Liberty Head Nickel");
      
		c1.getCoinsInfo();

        Coins c2 = new Coins("India Head Cent",1987);
        
		c2.getCoinsInfo();


        Coins c3 = new Coins("Bronze",12.00);
		c3.getCoinsInfo();


        Coins c4 = new Coins(6.5);
		c4.getCoinsInfo();


        

    }
}
