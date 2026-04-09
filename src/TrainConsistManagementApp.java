import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize train consist
        List<String> train = new ArrayList<>();
        System.out.println("Initial Bogie Count: " + train.size());

        // ================= UC2 =================

        train.add("Sleeper");
        train.add("AC Chair");
        train.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println(train);

        train.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(train);

        if (train.contains("Sleeper")) {
            System.out.println("\n'Sleeper' bogie exists in the train.");
        }

        System.out.println("\nFinal Train Consist:");
        System.out.println(train);

        // ================= UC3 START =================

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicate)
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B101"); // Duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs (Duplicates Ignored):");
        System.out.println(bogieIds);

        // ================= UC3 END =================
    }
}