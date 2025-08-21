class LokSabhaRunner {

    public static void main(String[] args) {

        Politician politician = new Politician("Rahul Sharma", "Janata Party");

        Seat seat = new Seat(42, "Maharashtra", politician);

        LokSabha lokSabha = new LokSabha(17, "Indian Parliament", 543, seat);

        lokSabha.getLokSabhaDetails();
    }
}