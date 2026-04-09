import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize train consist
        List<String> train = new ArrayList<>();
        System.out.println("Initial Bogie Count: " + train.size());

        // ================= UC2 START =================

        // Add passenger bogies
        train.add("Sleeper");
        train.add("AC Chair");
        train.add("First Class");

        // Display bogies after addition
        System.out.println("\nAfter Adding Bogies:");
        System.out.println(train);

        // Remove a bogie
        train.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(train);

        // Check existence
        if (train.contains("Sleeper")) {
            System.out.println("\n'Sleeper' bogie exists in the train.");
        } else {
            System.out.println("\n'Sleeper' bogie NOT found.");
        }

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);

        // ================= UC2 END =================
    }
}