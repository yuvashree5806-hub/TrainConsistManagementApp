import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list (currently empty to demonstrate exception)
        List<String> bogieIds = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        // Defensive check (Fail-Fast)
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        // Search logic (will not execute if list is empty)
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID " + key + " FOUND ✅");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND ❌");
        }

        scanner.close();
    }
}