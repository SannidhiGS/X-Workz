class ForestSafariRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Forest Safari Data");

        ForestSafari safari1 = new ForestSafari();
        safari1.locationName = "Bandipur National Park";
        safari1.state = "Karnataka";
        safari1.areaSqKm = 874.0;
        safari1.numberOfJeeps = 40;
        safari1.primaryWildlifeAttraction = "Tiger";
        safari1.hasAccommodation = true;
        safari1.getForestInfo();

        ForestSafari safari2 = new ForestSafari();
        safari2.locationName = "Nagarhole National Park";
        safari2.state = "Karnataka";
        safari2.areaSqKm = 643.0;
        safari2.numberOfJeeps = 35;
        safari2.primaryWildlifeAttraction = "Leopard";
        safari2.hasAccommodation = true;
        safari2.getForestInfo();

        ForestSafari safari3 = new ForestSafari();
        safari3.locationName = "Kabini Forest Reserve";
        safari3.state = "Karnataka";
        safari3.areaSqKm = 55.0; // Part of Nagarhole
        safari3.numberOfJeeps = 20;
        safari3.primaryWildlifeAttraction = "Black Panther";
        safari3.hasAccommodation = true;
        safari3.getForestInfo();

        ForestSafari safari4 = new ForestSafari();
        safari4.locationName = "Bhadra Wildlife Sanctuary";
        safari4.state = "Karnataka";
        safari4.areaSqKm = 492.0;
        safari4.numberOfJeeps = 15;
        safari4.primaryWildlifeAttraction = "Elephants";
        safari4.hasAccommodation = true;
        safari4.getForestInfo();

        ForestSafari safari5 = new ForestSafari();
        safari5.locationName = "Ranthambore National Park";
        safari5.state = "Rajasthan";
        safari5.areaSqKm = 1334.0;
        safari5.numberOfJeeps = 50;
        safari5.primaryWildlifeAttraction = "Tiger";
        safari5.hasAccommodation = true;
        safari5.getForestInfo();

        ForestSafari safari6 = new ForestSafari();
        safari6.locationName = "Jim Corbett National Park";
        safari6.state = "Uttarakhand";
        safari6.areaSqKm = 1318.0;
        safari6.numberOfJeeps = 60;
        safari6.primaryWildlifeAttraction = "Tiger";
        safari6.hasAccommodation = true;
        safari6.getForestInfo();

        ForestSafari safari7 = new ForestSafari();
        safari7.locationName = "Kaziranga National Park";
        safari7.state = "Assam";
        safari7.areaSqKm = 1090.0;
        safari7.numberOfJeeps = 45;
        safari7.primaryWildlifeAttraction = "One-horned Rhinoceros";
        safari7.hasAccommodation = true;
        safari7.getForestInfo();

        ForestSafari safari8 = new ForestSafari();
        safari8.locationName = "Periyar National Park";
        safari8.state = "Kerala";
        safari8.areaSqKm = 925.0;
        safari8.numberOfJeeps = 25;
        safari8.primaryWildlifeAttraction = "Elephants";
        safari8.hasAccommodation = true;
        safari8.getForestInfo();

        ForestSafari safari9 = new ForestSafari();
        safari9.locationName = "Sunderbans National Park";
        safari9.state = "West Bengal";
        safari9.areaSqKm = 1330.0;
        safari9.numberOfJeeps = 10; // Boat safaris are more common
        safari9.primaryWildlifeAttraction = "Royal Bengal Tiger";
        safari9.hasAccommodation = true;
        safari9.getForestInfo();

        ForestSafari safari10 = new ForestSafari();
        safari10.locationName = "Gir National Park";
        safari10.state = "Gujarat";
        safari10.areaSqKm = 1412.0;
        safari10.numberOfJeeps = 30;
        safari10.primaryWildlifeAttraction = "Asiatic Lion";
        safari10.hasAccommodation = true;
        safari10.getForestInfo();

        ForestSafari safari11 = new ForestSafari();
        safari11.locationName = "Pench National Park";
        safari11.state = "Madhya Pradesh";
        safari11.areaSqKm = 758.0;
        safari11.numberOfJeeps = 28;
        safari11.primaryWildlifeAttraction = "Tiger";
        safari11.hasAccommodation = true;
        safari11.getForestInfo();

        ForestSafari safari12 = new ForestSafari();
        safari12.locationName = "Kanha National Park";
        safari12.state = "Madhya Pradesh";
        safari12.areaSqKm = 940.0;
        safari12.numberOfJeeps = 32;
        safari12.primaryWildlifeAttraction = "Tiger";
        safari12.hasAccommodation = true;
        safari12.getForestInfo();

        ForestSafari safari13 = new ForestSafari();
        safari13.locationName = "Tadoba Andhari Tiger Reserve";
        safari13.state = "Maharashtra";
        safari13.areaSqKm = 625.0;
        safari13.numberOfJeeps = 22;
        safari13.primaryWildlifeAttraction = "Tiger";
        safari13.hasAccommodation = true;
        safari13.getForestInfo();

        ForestSafari safari14 = new ForestSafari();
        safari14.locationName = "Panna National Park";
        safari14.state = "Madhya Pradesh";
        safari14.areaSqKm = 542.0;
        safari14.numberOfJeeps = 18;
        safari14.primaryWildlifeAttraction = "Tiger";
        safari14.hasAccommodation = true;
        safari14.getForestInfo();

        ForestSafari safari15 = new ForestSafari();
        safari15.locationName = "Bharatpur Bird Sanctuary";
        safari15.state = "Rajasthan";
        safari15.areaSqKm = 29.0;
        safari15.numberOfJeeps = 5; // Primarily rickshaw/walking
        safari15.primaryWildlifeAttraction = "Migratory Birds";
        safari15.hasAccommodation = true;
        safari15.getForestInfo();

        ForestSafari safari16 = new ForestSafari();
        safari16.locationName = "Anshi National Park";
        safari16.state = "Karnataka";
        safari16.areaSqKm = 340.0;
        safari16.numberOfJeeps = 10;
        safari16.primaryWildlifeAttraction = "Black Panther";
        safari16.hasAccommodation = false; // Limited accommodation
        safari16.getForestInfo();

        ForestSafari safari17 = new ForestSafari();
        safari17.locationName = "Bannerghatta National Park";
        safari17.state = "Karnataka";
        safari17.areaSqKm = 104.0;
        safari17.numberOfJeeps = 25;
        safari17.primaryWildlifeAttraction = "Lion and Tiger Safari";
        safari17.hasAccommodation = true;
        safari17.getForestInfo();

        ForestSafari safari18 = new ForestSafari();
        safari18.locationName = "Dubare Elephant Camp";
        safari18.state = "Karnataka";
        safari18.areaSqKm = 0.5; // Smaller area, focus on elephants
        safari18.numberOfJeeps = 0; // Elephant interaction, no jeep safari
        safari18.primaryWildlifeAttraction = "Elephants";
        safari18.hasAccommodation = true;
        safari18.getForestInfo();

        ForestSafari safari19 = new ForestSafari();
        safari19.locationName = "Sharavathi Valley Wildlife Sanctuary";
        safari19.state = "Karnataka";
        safari19.areaSqKm = 431.0;
        safari19.numberOfJeeps = 8;
        safari19.primaryWildlifeAttraction = "Lion-tailed Macaque";
        safari19.hasAccommodation = false;
        safari19.getForestInfo();

        ForestSafari safari20 = new ForestSafari();
        safari20.locationName = "Dandeli Wildlife Sanctuary";
        safari20.state = "Karnataka";
        safari20.areaSqKm = 866.0;
        safari20.numberOfJeeps = 12;
        safari20.primaryWildlifeAttraction = "Black Panther";
        safari20.hasAccommodation = true;
        safari20.getForestInfo();

        System.out.println("Main Ended - Forest Safari Data Display Complete");
    }
}
