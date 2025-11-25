package lesson03;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Order Amount: ");
        double orderAmount = input.nextDouble();
        double deliveryFee = 0;
        boolean isServiceAvailable = true;

        System.out.print("Enter City:\n" +
                "1 ---> Baku,\n" +
                "2 ---> Sumgayit,\n" +
                "3 ---> Xirdalan: ");
        int locationCityChoice = input.nextInt();
        String locationCity;

        switch(locationCityChoice){
            case 1:
                deliveryFee = 5;
                locationCity = "Baku";
                break;
            case 2:
                deliveryFee = 7;
                locationCity = "Sumgayit";
                break;
            case 3:
                deliveryFee = 6;
                locationCity = "Xirdalan";
                break;
            default:
                isServiceAvailable = false;
                locationCity = "Unknown";
                System.out.println("Error: Wrong Input");
        }

        if (isServiceAvailable) {
            if (orderAmount > 50) {
                deliveryFee = 0;
                System.out.println("Note: Free delivery applied!");
            }

            System.out.println("--- Receipt ---");
            System.out.println("City: " + locationCity);
            System.out.printf("Order Amount: %.2f AZN\n", orderAmount);
            System.out.printf("Delivery Fee: %.2f AZN\n", deliveryFee);
            System.out.printf("Total Amount: %.2f AZN\n", (orderAmount + deliveryFee));
        }
    }
}
