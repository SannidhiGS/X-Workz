class Train {

    String trainNumber;
    String trainRoute;

    Train(String trainNumber, String trainRoute) {
        this.trainNumber = trainNumber;
        this.trainRoute = trainRoute;
    }

    public void getTrainDetails() {
        System.out.println("The train number is: " + trainNumber);
        System.out.println("The train route is: " + trainRoute);
    }
}