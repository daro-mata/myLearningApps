package pl.learning.vehicleChallenge;

public class Main {
    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);

        outlander.accelerate(30);
        System.out.println("...");
        outlander.setCurrentDirection(12);
        outlander.accelerate(20);
        System.out.println("");
        outlander.accelerate(-15);
        System.out.println("");
        outlander.accelerate(-35);
    }
}
