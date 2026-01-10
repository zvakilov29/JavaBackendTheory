package lesson14.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Warehouse<Electronics> electronicsWarehouse = new Warehouse<>();
        Electronics tv = new Electronics("TV", 1200.0, "Samsung QN90", 24);
        Electronics laptop = new Electronics("Laptop", 2500.0, "Dell XPS", 12);

        electronicsWarehouse.addProduct(tv);
        electronicsWarehouse.addProduct(laptop);
        System.out.println("Electronics total: " + electronicsWarehouse.calculateTotalValue());

        Warehouse<Clothing> clothingWarehouse = new Warehouse<>();
        Clothing tshirt = new Clothing("T-Shirt", 20.0, "M", "Black");
        Clothing jacket = new Clothing("Jacket", 80.0, "L", "Blue");

        clothingWarehouse.addProduct(tshirt);
        clothingWarehouse.addProduct(jacket);
        System.out.println("Clothing total: " + clothingWarehouse.calculateTotalValue());

        // Remove test
        clothingWarehouse.removeProduct(tshirt);
        System.out.println("Clothing total after removal: " + clothingWarehouse.calculateTotalValue());

        // Food example
        Warehouse<Food> foodWarehouse = new Warehouse<>();
        foodWarehouse.addProduct(new Food("Milk", 2.5, LocalDate.now().plusDays(7)));
        System.out.println("Food total: " + foodWarehouse.calculateTotalValue());
    }
}
