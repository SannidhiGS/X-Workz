class CabinetMinister {

    String ministerName;
    String department;

    CabinetMinister(String ministerName, String department) {
        this.ministerName = ministerName;
        this.department = department;
    }

    public void getCabinetMinisterDetails() {
        System.out.println("Cabinet Minister Name: " + ministerName);
        System.out.println("Department: " + department);
    }
}