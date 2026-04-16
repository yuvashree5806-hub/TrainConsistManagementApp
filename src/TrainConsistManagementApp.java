import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"B101", "B205", "B309", "B412", "B523"};

        Scanner scanner = new Scanner(System.in);

        // Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // early termination
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND ✅");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND ❌");
        }

        scanner.close();
    }
}