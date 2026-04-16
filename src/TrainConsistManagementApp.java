import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sorted array of bogie IDs
        String[] bogieIds = {"B101", "B205", "B309", "B412", "B523"};

        // Ensure sorted (safety step)
        Arrays.sort(bogieIds);

        Scanner scanner = new Scanner(System.in);

        // Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
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