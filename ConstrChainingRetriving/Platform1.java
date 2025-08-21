class Platform1 {

    int platformNumber;
    String boardName;

    Train train;

    Platform1(int platformNumber, String boardName, Train train) {
        this.platformNumber = platformNumber;
        this.boardName = boardName;
        this.train = train;
    }

    public void getPlatformInfo() {
        System.out.println("The platform number: " + platformNumber);
        System.out.println("The board name: " + boardName);
        this.train.getTrainDetails();
    }
}