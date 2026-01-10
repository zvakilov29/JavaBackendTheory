package lesson09.homework;

public class Main {
    public static void main(String[] args) {
        // We have 10 Laptops in stock
        Product laptop = new Product("MacBook Pro", 10);

        System.out.println("--- Scenario 1: Successful Order ---");
        try {
            laptop.orderProduct(3); // 10 - 3 = 7 remaining
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Scenario 2: Invalid Quantity (Negative) ---");
        try {
            laptop.orderProduct(-5); // Will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            // Unchecked Exception, caught specifically here
            System.out.println("User Error: " + e.getMessage());
        } catch (OutOfStockException e) {
            System.out.println("Stock Error: " + e.getMessage());
        }

        System.out.println("\n--- Scenario 3: Order Exceeding Stock ---");
        try {
            laptop.orderProduct(20); // Will throw OutOfStockException (Only 7 left)
        } catch (OutOfStockException e) {
            // Checked Exception - Our custom error
            System.out.println("Warehouse Warning: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other Error: " + e.getMessage());
        }
    }
}
