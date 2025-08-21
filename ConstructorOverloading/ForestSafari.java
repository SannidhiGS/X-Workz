public class ForestSafari {
    private String name;
    private int numberOfTrees;
    private boolean hasWildlife;

    public Forest() {
        this.name = name;
        this.numberOfTrees = 0;
        this.hasWildlife = false;
    }

    public Forest(String name) {
        this.name = name;
        this.numberOfTrees = 100;
        this.hasWildlife = true;
    }

    public Forest(String name, int numberOfTrees) {
        this.name = name;
        this.numberOfTrees = numberOfTrees;
        this.hasWildlife = true;
    }

    public Forest(String name, int numberOfTrees, boolean hasWildlife) {
        this.name = name;
        this.numberOfTrees = numberOfTrees;
        this.hasWildlife = hasWildlife;
    }

    public void displayInfo() {
        System.out.println("Forest Name: " + name);
        System.out.println("Number of Trees: " + numberOfTrees);
        System.out.println("Has Wildlife: " + hasWildlife);
        System.out.println();
    }
}
