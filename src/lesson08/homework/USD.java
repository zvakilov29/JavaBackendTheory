package lesson08.homework;

public class USD extends Currency {
    private double exchangeRate = 1.7; // 1 USD = 1.7 AZN

    @Override
    public double convertToAZN(double amount) {
        double commission = amount * CurrencyConverter.getCommissionRate();

        double netAmount = amount - commission;

        return netAmount * exchangeRate;
    }
}
