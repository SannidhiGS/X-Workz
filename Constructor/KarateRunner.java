class KarateRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Karate Data");

        Karate karate1 = new Karate();
        karate1.style = "Shotokan";
        karate1.originCountry = "Japan";
        karate1.founder = "Gichin Funakoshi";
        karate1.foundingYear = 1938;
        karate1.primaryTechniqueFocus = "Linear Striking, Deep Stances";
        karate1.isOlympicSport = true;
        System.out.println("Style: " + karate1.style + ", Origin: " + karate1.originCountry + ", Founder: " + karate1.founder + ", Founding Year: " + karate1.foundingYear + ", Focus: " + karate1.primaryTechniqueFocus + ", Olympic Sport: " + karate1.isOlympicSport);
        System.out.println();

        Karate karate2 = new Karate();
        karate2.style = "Goju-ryu";
        karate2.originCountry = "Japan (Okinawa)";
        karate2.founder = "Chojun Miyagi";
        karate2.foundingYear = 1930;
        karate2.primaryTechniqueFocus = "Hard and Soft Techniques, Close Combat";
        karate2.isOlympicSport = false;
        System.out.println("Style: " + karate2.style + ", Origin: " + karate2.originCountry + ", Founder: " + karate2.founder + ", Founding Year: " + karate2.foundingYear + ", Focus: " + karate2.primaryTechniqueFocus + ", Olympic Sport: " + karate2.isOlympicSport);
        System.out.println();

        Karate karate3 = new Karate();
        karate3.style = "Wado-ryu";
        karate3.originCountry = "Japan";
        karate3.founder = "Hironori Ōtsuka";
        karate3.foundingYear = 1922;
        karate3.primaryTechniqueFocus = "Movement, Evasion, Joint Locks";
        karate3.isOlympicSport = false;
        System.out.println("Style: " + karate3.style + ", Origin: " + karate3.originCountry + ", Founder: " + karate3.founder + ", Founding Year: " + karate3.foundingYear + ", Focus: " + karate3.primaryTechniqueFocus + ", Olympic Sport: " + karate3.isOlympicSport);
        System.out.println();

        Karate karate4 = new Karate();
        karate4.style = "Kyokushin";
        karate4.originCountry = "Japan";
        karate4.founder = "Masutatsu Oyama";
        karate4.foundingYear = 1964;
        karate4.primaryTechniqueFocus = "Full-Contact Kumite, Physical Conditioning";
        karate4.isOlympicSport = false;
        System.out.println("Style: " + karate4.style + ", Origin: " + karate4.originCountry + ", Founder: " + karate4.founder + ", Founding Year: " + karate4.foundingYear + ", Focus: " + karate4.primaryTechniqueFocus + ", Olympic Sport: " + karate4.isOlympicSport);
        System.out.println();

        Karate karate5 = new Karate();
        karate5.style = "Shito-ryu";
        karate5.originCountry = "Japan (Okinawa)";
        karate5.founder = "Kenwa Mabuni";
        karate5.foundingYear = 1931;
        karate5.primaryTechniqueFocus = "Diverse Katas, Powerful Strikes";
        karate5.isOlympicSport = false;
        System.out.println("Style: " + karate5.style + ", Origin: " + karate5.originCountry + ", Founder: " + karate5.founder + ", Founding Year: " + karate5.foundingYear + ", Focus: " + karate5.primaryTechniqueFocus + ", Olympic Sport: " + karate5.isOlympicSport);
        System.out.println();

        Karate karate6 = new Karate();
        karate6.style = "Uechi-ryu";
        karate6.originCountry = "Japan (Okinawa)";
        karate6.founder = "Kanbun Uechi";
        karate6.foundingYear = 1920;
        karate6.primaryTechniqueFocus = "Circular Blocks, Finger Strikes, Body Conditioning";
        karate6.isOlympicSport = false;
        System.out.println("Style: " + karate6.style + ", Origin: " + karate6.originCountry + ", Founder: " + karate6.founder + ", Founding Year: " + karate6.foundingYear + ", Focus: " + karate6.primaryTechniqueFocus + ", Olympic Sport: " + karate6.isOlympicSport);
        System.out.println();

        System.out.println("Main Ended - Karate Data Display Complete");
    }
}
