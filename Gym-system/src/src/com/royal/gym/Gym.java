package src.com.royal.gym;

public class Gym {

    int gymID;
    String gymName;
    String location;

    public void setID(int gymID) {
        this.gymID = gymID;
    }
    int getGymID(){
        return gymID;
    }

    public void setGymName(String gymName){
        this.gymName=gymName;
    }
    String getGymName(){
        return gymName;
    }

    public void setLocation(String location){
        this.location=location;
    }
    String getLocation(){
        return location;
    }


    public void getGymDetails(){
        System.out.println("The gym ID: "+gymID);
        System.out.println("The gym center name: "+gymName);
        System.out.println("The gym location: "+location);
    }
}
