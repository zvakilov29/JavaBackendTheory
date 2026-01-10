package lesson09.homework;

class Product {
    private String productName;
    private int stockQuantity;

    public Product(String productName, int stockQuantity) {
        this.productName = productName;
        this.stockQuantity = stockQuantity;
    }

    // Order Method
    // throws: Indicates that this method is risky and might throw an exception.
    public void orderProduct(int quantity) throws OutOfStockException {

        // Condition 1: Negative or zero order (Unchecked Exception)
        if (quantity <= 0) {
            throw new IllegalArgumentException("Order quantity must be positive!");
        }

        // Condition 2: Insufficient stock (Checked Exception - Created by us)
        if (quantity > stockQuantity) {
            throw new OutOfStockException("Not enough stock available! (Current: " + stockQuantity + ")");
        }

        // Successful operation
        stockQuantity -= quantity;
        System.out.println("Order accepted! Remaining stock: " + stockQuantity);
    }
}

