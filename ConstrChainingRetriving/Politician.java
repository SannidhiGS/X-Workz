class Politician {

    String name;
    String party;

    Politician(String name, String party) {
        this.name = name;
        this.party = party;
    }

    public void getPoliticianDetails() {
        System.out.println("Politician Name: " + name);
        System.out.println("Party: " + party);
    }
}