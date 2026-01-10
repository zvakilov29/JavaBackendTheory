package lesson10.homework;

public class Main {

    public static void main(String[] args) {
        Product myProduct = new Product(100);
        int myDiscount = 50;

        System.out.println("--- Before Method Call ---");
        System.out.println("Product Price: " + myProduct.price);
        System.out.println("Discount Value: " + myDiscount);

        updatePrice(myProduct, myDiscount);

        System.out.println("\n--- After Method Call ---");
        System.out.println("Product Price: " + myProduct.price);
        System.out.println("Discount Value: " + myDiscount);
    }

    public static void updatePrice(Product product, int discount) {
        product.price = 200;
        discount = 100;

        System.out.println("Inside Method (updatePrice):");
        System.out.println("Product Price: " + product.price);
        System.out.println("Discount Value: " + discount);
    }
}
