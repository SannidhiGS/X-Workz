class GymRunner {

    public static void main(String[] args) {
        boolean userIsRegistered = Gym.registerUser("Arjun Mehta", "Annual");

        System.out.println("Is User Registered: " + userIsRegistered);

        Gym.getUserInfo();
    }
}
