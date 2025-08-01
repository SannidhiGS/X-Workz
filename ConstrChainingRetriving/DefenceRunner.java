class DefenceRunner {

    public static void main(String[] args) {

        Squad squad = new Squad("Alpha Squad", 30);

        Army army = new Army("Mountain Division", 5000, squad);

        Defence defence = new Defence(101, "Indian Defence Force", 3, army);

        defence.getDefenceDetails();
    }
}