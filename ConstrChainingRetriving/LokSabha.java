class LokSabha {

    int houseNumber;
    String houseName;
    int totalSeats;

    Seat seat;

    LokSabha(int houseNumber, String houseName, int totalSeats, Seat seat) {
        this.houseNumber = houseNumber;
        this.houseName = houseName;
        this.totalSeats = totalSeats;
        this.seat = seat;
    }

    public void getLokSabhaDetails() {
        System.out.println("House Number: " + houseNumber);
        System.out.println("House Name: " + houseName);
        System.out.println("Total Seats: " + totalSeats);
        this.seat.getSeatDetails();
    }
}