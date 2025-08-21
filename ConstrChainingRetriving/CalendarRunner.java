class CalendarRunner {
    public static void main(String[] args) {
        Invitee invitee = new Invitee("Alice", "alice@example.com", true);
        Meeting meeting = new Meeting("Project Kickoff", "10:00 AM", invitee);
        Calendar calendar = new Calendar("John", "2025-08-01", meeting);
        calendar.getCalendarDetails();
    }
}