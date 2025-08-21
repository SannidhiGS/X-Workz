class Pmo {

    String pmoOfficeLocation;
    int numberOfStaff;

    PrimeMinister primeMinister;

    Pmo(String pmoOfficeLocation, int numberOfStaff, PrimeMinister primeMinister) {
        this.pmoOfficeLocation = pmoOfficeLocation;
        this.numberOfStaff = numberOfStaff;
        this.primeMinister = primeMinister;
    }

    public void getPmoDetails() {
        System.out.println("PMO Office Location: " + pmoOfficeLocation);
        System.out.println("Number of Staff in PMO: " + numberOfStaff);
        this.primeMinister.getPrimeMinisterDetails();
    }
}