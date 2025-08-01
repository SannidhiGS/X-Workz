class PrimeMinister {

    String name;
    int age;

    CabinetMinister cabinetMinister;

    PrimeMinister(String name, int age, CabinetMinister cabinetMinister) {
        this.name = name;
        this.age = age;
        this.cabinetMinister = cabinetMinister;
    }

    public void getPrimeMinisterDetails() {
        System.out.println("Prime Minister Name: " + name);
        System.out.println("Prime Minister Age: " + age);
        this.cabinetMinister.getCabinetMinisterDetails();
    }
}