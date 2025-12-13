package lesson08.homework;

public class EUR extends Currency {
    private double exchangeRate = 1.8; // 1 EUR = 1.8 AZN

    @Override
    public double convertToAZN(double amount) {
        double commission = amount * CurrencyConverter.getCommissionRate();
        double netAmount = amount - commission;

        return netAmount * exchangeRate;
    }
}