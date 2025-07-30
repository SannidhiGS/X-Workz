public class Festival {
    String name;
    String country;
    String religion;
    String season;
    String mainDeityOrFigure;
    boolean isNationalHoliday;

    // Default constructor
    Festival() {
    }

    // Constructor with name
    Festival(String name) {
        this.name = name;
    }

    // Constructor with country and religion
    Festival(String country, String religion) {
        this.country = country;
        this.religion = religion;
    }

    // Constructor with season and deity - changed this to use all fields
    Festival(String name, String season, String mainDeityOrFigure) {
        this.name = name;
        this.season = season;
        this.mainDeityOrFigure = mainDeityOrFigure;
    }

    // Constructor with isNationalHoliday
    Festival(boolean isNationalHoliday) {
        this.isNationalHoliday = isNationalHoliday;
    }

    // Display method
    void getFestivalInfo() {
        System.out.println("Festival: " + name);
        System.out.println("Country: " + country);
        System.out.println("Religion: " + religion);
        System.out.println("Season: " + season);
        System.out.println("Main Deity/Figure: " + mainDeityOrFigure);
        System.out.println("Is National Holiday: " + isNationalHoliday);
        System.out.println();
    }
}
