class PmoRunner {

    public static void main(String args[]) {

        CabinetMinister cabinetMinister = new CabinetMinister("Nirmala Sitharaman", "Finance");

        PrimeMinister primeMinister = new PrimeMinister("Narendra Modi", 74, cabinetMinister);

        Pmo pmo = new Pmo("South Block, New Delhi", 500, primeMinister);

        pmo.getPmoDetails();
    }
}