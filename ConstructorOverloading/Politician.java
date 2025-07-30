public class Politician {
    String name;
    String party;
    String constituency;
    int age;
    int yearsInOffice;
    boolean isCurrentMember;
    String education;
    String country;

    Politician() {
    }

    Politician(String name) {
        this.name = name;
    }

    Politician(String party, String constituency) {
        this.party = party;
        this.constituency = constituency;
    }

    Politician(int age, int yearsInOffice) {
        this.age = age;
        this.yearsInOffice = yearsInOffice;
    }

    Politician(boolean isCurrentMember, String education, String country) {
        this.isCurrentMember = isCurrentMember;
        this.education = education;
        this.country = country;
    }

    void getPoliticianInfo() {
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Constituency: " + constituency);
        System.out.println("Age: " + age);
        System.out.println("Years in Office: " + yearsInOffice);
        System.out.println("Current Member: " + isCurrentMember);
        System.out.println("Education: " + education);
        System.out.println("Country: " + country);
        System.out.println();
    }
}
