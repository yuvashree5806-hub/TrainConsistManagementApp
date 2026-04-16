import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        // Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Display sorted names
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
    }
}