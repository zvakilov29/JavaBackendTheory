package lesson22.homework;

public class Main {
    public static void main(String[] args) {
        processPayment(null, PaymentStatus.PENDING);        // amount is null
        processPayment(100.0, PaymentStatus.PENDING);       // pending
        processPayment(100.0, PaymentStatus.COMPLETED);     // completed + VAT
        processPayment(100.0, PaymentStatus.FAILED);        // failed
        processPayment(100.0, PaymentStatus.REFUNDED);      // refunded
    }

    public static void processPayment(Double amount, PaymentStatus status) {
        // If amount is null, we cannot process (avoid NullPointerException during unboxing)
        if (amount == null) {
            System.out.println("Error: Amount was not provided");
            return;
        }

        // Optional safety check: status should not be null
        if (status == null) {
            System.out.println("Error: Payment status was not provided");
            return;
        }

        switch(status){
            case PENDING:
                System.out.println("Payment is pending: " + amount);
                break;

            case COMPLETED:
                // Unboxing: Double -> double
                double baseAmount = amount;

                // Add 18% VAT (multiply by 1.18)
                double finalPrimitive = baseAmount * 1.18;

                // Autoboxing: double -> Double
                Double finalAmount = finalPrimitive;

                System.out.println("Payment successful. Final: " + finalAmount);
                break;

            case FAILED:
                System.out.println("Payment failed: " + amount);
                break;

            case REFUNDED:
                System.out.println("Payment refunded: " + amount);
                break;

            default:
                System.out.println("Unknown payment status");
        }
    }
}
