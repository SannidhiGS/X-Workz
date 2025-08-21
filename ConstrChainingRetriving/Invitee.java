class Invitee {
    String name;
    String email;
    boolean isAttending;

    Invitee(String name, String email, boolean isAttending) {
        this.name = name;
        this.email = email;
        this.isAttending = isAttending;
    }

    void getInviteeDetails() {
        System.out.println("Invitee Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Attending: " + isAttending);
    }
}