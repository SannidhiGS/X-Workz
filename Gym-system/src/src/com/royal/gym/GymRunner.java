package src.com.royal.gym;

public class GymRunner
{
    public static void main(String args[]) {

        Gym gym = new Gym();
        gym.gymID=12;
        gym.gymName="Royal Fitness Center";
        gym.location="Banglore";
        gym.getGymDetails();
    }
}
