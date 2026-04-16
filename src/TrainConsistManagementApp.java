import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Adding bogies with capacities
        System.out.println("\nAdding Bogie Capacity Data...");
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        // Display all bogies with capacities
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println(bogie + " -> Capacity: " + capacity);
        }

        // Example lookup
        System.out.println("\nChecking capacity of Sleeper:");
        System.out.println("Sleeper Capacity: " + bogieCapacityMap.get("Sleeper"));
    }
}