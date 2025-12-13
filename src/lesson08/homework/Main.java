package lesson08.homework;

public class Main {
    public static void main(String[] args) {
        // Test Case 1: Convert 100 USD
        Currency myDollars = new USD();
        double amountInUsd = 100.0;

        double resultInAzn = myDollars.convertToAZN(amountInUsd);

        System.out.println("--- Transaction 1 (USD) ---");
        System.out.println("Input: " + amountInUsd + " USD");
        System.out.println("Commission Rate: " + (CurrencyConverter.getCommissionRate() * 100) + "%");
        System.out.printf("You receive: %.2f AZN\n", resultInAzn);


        System.out.println("\n--- System Update: Changing Commission to 2% ---");
        CurrencyConverter.setCommissionRate(0.02);


        // Test Case 2: Convert 100 EUR
        Currency myEuros = new EUR();
        double amountInEur = 100.0;

        double resultEurInAzn = myEuros.convertToAZN(amountInEur);

        System.out.println("--- Transaction 2 (EUR) ---");
        System.out.println("Input: " + amountInEur + " EUR");
        System.out.println("Commission Rate: " + (CurrencyConverter.getCommissionRate() * 100) + "%");
        System.out.printf("You receive: %.2f AZN\n", resultEurInAzn);
    }
}
