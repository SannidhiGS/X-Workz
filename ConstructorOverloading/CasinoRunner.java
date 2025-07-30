class CasinoRunner {
    public static void main(String[] args) {

        Casino c1 = new Casino(1);
        
        c1.getCasinoInfo();

        Casino c2 = new Casino("Monte Carlo","Monaco");
       
		c2.getCasinoInfo();

        Casino c3 = new Casino(true,300);
       
		c3.getCasinoInfo();

        Casino c4 = new Casino(400,true,60.00);
        
		c4.getCasinoInfo();

    }
}
