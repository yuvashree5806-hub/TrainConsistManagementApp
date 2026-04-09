import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // ================= UC1 =================
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

        // ================= UC3 =================
        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B101"); // duplicate

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        // ================= UC4 START =================

        // Create LinkedList for train consist
        LinkedList<String> linkedTrain = new LinkedList<>();

        // Add bogies
        linkedTrain.add("Engine");
        linkedTrain.add("Sleeper");
        linkedTrain.add("AC");
        linkedTrain.add("Cargo");
        linkedTrain.add("Guard");

        System.out.println("\nInitial Linked Train:");
        System.out.println(linkedTrain);

        // Insert Pantry Car at position 2
        linkedTrain.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting Pantry Car at position 2:");
        System.out.println(linkedTrain);

        // Remove first and last bogie
        linkedTrain.removeFirst();
        linkedTrain.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(linkedTrain);

        // Final consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(linkedTrain);

        // ================= UC4 END =================
    }
}