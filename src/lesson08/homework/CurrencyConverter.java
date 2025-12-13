package lesson08.homework;

public class CurrencyConverter {
    private static double commissionRate = 0.01;

    public static void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public static double getCommissionRate() {
        return commissionRate;
    }
}