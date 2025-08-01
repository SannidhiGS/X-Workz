class Seat {

    int seatNumber;
    String stateName;

    Politician politician;

    Seat(int seatNumber, String stateName, Politician politician) {
        this.seatNumber = seatNumber;
        this.stateName = stateName;
        this.politician = politician;
    }

    public void getSeatDetails() {
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("State Name: " + stateName);
        this.politician.getPoliticianDetails();
    }
}