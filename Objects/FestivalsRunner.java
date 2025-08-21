class FestivalsRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Festivals Data");

        Festivals festival1 = new Festivals();
        festival1.name = "Diwali";
        festival1.mainReligionCulture = "Hindu";
        festival1.typicalSeason = "Autumn";
        festival1.approximateDurationDays = 5;
        festival1.primaryCelebrationActivity = "Lighting lamps, fireworks, prayers, sweets";
        festival1.geographicalFocus = "Pan-India, Global";
        festival1.getFestInfo();

        Festivals festival2 = new Festivals();
        festival2.name = "Eid al-Fitr";
        festival2.mainReligionCulture = "Islam";
        festival2.typicalSeason = "Varies (Lunar Calendar)";
        festival2.approximateDurationDays = 1;
        festival2.primaryCelebrationActivity = "Prayers, feasting, charity, new clothes";
        festival2.geographicalFocus = "Global";
        festival2.getFestInfo();

        Festivals festival3 = new Festivals();
        festival3.name = "Christmas";
        festival3.mainReligionCulture = "Christian";
        festival3.typicalSeason = "Winter";
        festival3.approximateDurationDays = 1;
        festival3.primaryCelebrationActivity = "Church services, gift-giving, family meals";
        festival3.geographicalFocus = "Global";
        festival3.getFestInfo();

        Festivals festival4 = new Festivals();
        festival4.name = "Holi";
        festival4.mainReligionCulture = "Hindu";
        festival4.typicalSeason = "Spring";
        festival4.approximateDurationDays = 2;
        festival4.primaryCelebrationActivity = "Playing with colors, bonfires, sweets";
        festival4.geographicalFocus = "Pan-India, Nepal";
        festival4.getFestInfo();
		
        Festivals festival5 = new Festivals();
        festival5.name = "Onam";
        festival5.mainReligionCulture = "Hindu";
        festival5.typicalSeason = "Monsoon (August/September)";
        festival5.approximateDurationDays = 10;
        festival5.primaryCelebrationActivity = "Pookalam, Onam Sadya, boat races";
        festival5.geographicalFocus = "Kerala, South India";
        festival5.getFestInfo();
		
        Festivals festival6 = new Festivals();
        festival6.name = "Pongal";
        festival6.mainReligionCulture = "Hindu";
        festival6.typicalSeason = "Winter (January)";
        festival6.approximateDurationDays = 4;
        festival6.primaryCelebrationActivity = "Harvest celebration, Pongal dish, cattle worship";
        festival6.geographicalFocus = "Tamil Nadu, South India";
        festival6.getFestInfo();

        Festivals festival7 = new Festivals();
        festival7.name = "Ugadi";
        festival7.mainReligionCulture = "Hindu";
        festival7.typicalSeason = "Spring (March/April)";
        festival7.approximateDurationDays = 1;
        festival7.primaryCelebrationActivity = "New Year, Ugadi Pachadi, traditional rituals";
        festival7.geographicalFocus = "Karnataka, Andhra Pradesh, Telangana";
        festival7.getFestInfo();

        Festivals festival8 = new Festivals();
        festival8.name = "Ganesh Chaturthi";
        festival8.mainReligionCulture = "Hindu";
        festival8.typicalSeason = "Monsoon (August/September)";
        festival8.approximateDurationDays = 10;
        festival8.primaryCelebrationActivity = "Idol worship, processions, modak sweets";
        festival8.geographicalFocus = "Maharashtra, Karnataka, Gujarat";
        festival8.getFestInfo();

        Festivals festival9 = new Festivals();
        festival9.name = "Durga Puja";
        festival9.mainReligionCulture = "Hindu";
        festival9.typicalSeason = "Autumn (September/October)";
        festival9.approximateDurationDays = 5;
        festival9.primaryCelebrationActivity = "Pandal hopping, cultural programs, feasting";
        festival9.geographicalFocus = "West Bengal, Northeast India";
        festival9.getFestInfo();

        Festivals festival10 = new Festivals();
        festival10.name = "Navaratri";
        festival10.mainReligionCulture = "Hindu";
        festival10.typicalSeason = "Autumn (September/October)";
        festival10.approximateDurationDays = 9;
        festival10.primaryCelebrationActivity = "Garba/Dandiya dances, fasting, goddess worship";
        festival10.geographicalFocus = "Gujarat, North India";
        festival10.getFestInfo();

        Festivals festival11 = new Festivals();
        festival11.name = "Makar Sankranti";
        festival11.mainReligionCulture = "Hindu";
        festival11.typicalSeason = "Winter (January)";
        festival11.approximateDurationDays = 1;
        festival11.primaryCelebrationActivity = "Kite flying, sesame sweets, harvest rituals";
        festival11.geographicalFocus = "Pan-India";
        festival11.getFestInfo();

        Festivals festival12 = new Festivals();
        festival12.name = "Baisakhi";
        festival12.mainReligionCulture = "Sikh, Hindu";
        festival12.typicalSeason = "Spring (April)";
        festival12.approximateDurationDays = 1;
        festival12.primaryCelebrationActivity = "Harvest festival, Nagar Kirtan, Bhangra";
        festival12.geographicalFocus = "Punjab, North India";
        festival12.getFestInfo();

        Festivals festival13 = new Festivals();
        festival13.name = "Good Friday";
        festival13.mainReligionCulture = "Christian";
        festival13.typicalSeason = "Spring (March/April)";
        festival13.approximateDurationDays = 1;
        festival13.primaryCelebrationActivity = "Church services, fasting, reflection";
        festival13.geographicalFocus = "Global";
        festival13.getFestInfo();

        Festivals festival14 = new Festivals();
        festival14.name = "Buddha Purnima";
        festival14.mainReligionCulture = "Buddhist";
        festival14.typicalSeason = "Spring (May)";
        festival14.approximateDurationDays = 1;
        festival14.primaryCelebrationActivity = "Prayers, meditation, processions";
        festival14.geographicalFocus = "Pan-India, Southeast Asia";
        festival14.getFestInfo();

        Festivals festival15 = new Festivals();
        festival15.name = "Guru Nanak Jayanti";
        festival15.mainReligionCulture = "Sikh";
        festival15.typicalSeason = "Autumn (November)";
        festival15.approximateDurationDays = 1;
        festival15.primaryCelebrationActivity = "Kirtan, langar, processions";
        festival15.geographicalFocus = "Pan-India, Global";
        festival15.getFestInfo();

        Festivals festival16 = new Festivals();
        festival16.name = "Mahavir Jayanti";
        festival16.mainReligionCulture = "Jain";
        festival16.typicalSeason = "Spring (March/April)";
        festival16.approximateDurationDays = 1;
        festival16.primaryCelebrationActivity = "Processions, prayers, charity";
        festival16.geographicalFocus = "Pan-India";
        System.out.println("Name: " + festival16.name);
        System.out.println("Main Religion/Culture: " + festival16.mainReligionCulture);
        System.out.println("Typical Season: " + festival16.typicalSeason);
        System.out.println("Approximate Duration (Days): " + festival16.approximateDurationDays);
        System.out.println("Primary Celebration Activity: " + festival16.primaryCelebrationActivity);
        System.out.println("Geographical Focus: " + festival16.geographicalFocus);
        System.out.println();

        Festivals festival17 = new Festivals();
        festival17.name = "New Year's Day";
        festival17.mainReligionCulture = "Secular, Global";
        festival17.typicalSeason = "Winter (January)";
        festival17.approximateDurationDays = 1;
        festival17.primaryCelebrationActivity = "Parties, resolutions, gatherings";
        festival17.geographicalFocus = "Global";
        festival17.getFestInfo();

        Festivals festival18 = new Festivals();
        festival18.name = "Republic Day";
        festival18.mainReligionCulture = "National";
        festival18.typicalSeason = "Winter (January)";
        festival18.approximateDurationDays = 1;
        festival18.primaryCelebrationActivity = "Parades, flag hoisting, patriotic events";
        festival18.geographicalFocus = "India";
        festival18.getFestInfo();

        Festivals festival19 = new Festivals();
        festival19.name = "Independence Day";
        festival19.mainReligionCulture = "National";
        festival19.typicalSeason = "Monsoon (August)";
        festival19.approximateDurationDays = 1;
        festival19.primaryCelebrationActivity = "Flag hoisting, patriotic speeches, cultural programs";
        festival19.geographicalFocus = "India";
        festival19.getFestInfo();

        Festivals festival20 = new Festivals();
        festival20.name = "Gandhi Jayanti";
        festival20.mainReligionCulture = "National";
        festival20.typicalSeason = "Autumn (October)";
        festival20.approximateDurationDays = 1;
        festival20.primaryCelebrationActivity = "Prayer meetings, tributes, non-violence awareness";
        festival20.geographicalFocus = "India";
        festival20.getFestInfo();

        System.out.println("Main Ended - Festivals Data Display Complete");
    }
}
