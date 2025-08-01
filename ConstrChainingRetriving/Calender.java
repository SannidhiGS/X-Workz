class Calendar {
    String owner;
    String date;
    Meeting meeting;

    Calendar(String owner, String date, Meeting meeting) {
        this.owner = owner;
        this.date = date;
        this.meeting = meeting;
    }

    void getCalendarDetails() {
        System.out.println("Calendar Owner: " + owner);
        System.out.println("Date: " + date);
        meeting.getMeetingDetails();
    }
}
