class Meeting {
    String topic;
    String time;
    Invitee invitee;

    Meeting(String topic, String time, Invitee invitee) {
        this.topic = topic;
        this.time = time;
        this.invitee = invitee;
    }

    void getMeetingDetails() {
        System.out.println("Meeting Topic: " + topic);
        System.out.println("Time: " + time);
        invitee.getInviteeDetails();
    }
}
