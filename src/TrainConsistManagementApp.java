// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    String shape;   // Cylindrical / Rectangular
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {
        // Rule: Rectangular bogie cannot carry Petroleum
        if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
            throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be loaded in Rectangular bogie");
        }
        this.cargo = cargo;
        System.out.println("Cargo assigned: " + cargo + " to " + shape + " bogie");
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        GoodsBogie bogie = new GoodsBogie("Rectangular");

        try {
            // Attempt unsafe assignment
            bogie.assignCargo("Petroleum");

        } catch (CargoSafetyException e) {
            System.out.println("\nError: " + e.getMessage());

        } finally {
            System.out.println("\nOperation completed (logged in finally block)");
        }

        System.out.println("\nProgram continues safely...");
    }
}