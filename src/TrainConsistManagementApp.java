import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create train formation using LinkedHashSet
        Set<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        System.out.println("\nAdding Bogies...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        System.out.println("\nAttempting to add duplicate bogie: Sleeper");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("Duplicate bogie ignored!");
        }

        // Display final formation
        System.out.println("\nFinal Train Formation (Maintains Order & Uniqueness):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}