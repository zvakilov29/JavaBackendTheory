package lesson04;

import java.util.Scanner;

public class Task1_V2 {
    public static void main(String[] args) {
        String realPin = "2942";
        int maxAttempts = 3;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= maxAttempts; i++){
            System.out.print("Please enter your pin number: ");
            String enteredPin = input.nextLine();

            if (enteredPin.equals(realPin)) {
                System.out.println("Access granted!");
                break;
            } else {
                if(i == maxAttempts){
                    System.out.println("Too many failed attempts, your account has been blocked!");
                } else {
                    System.out.println("Wrong input! Attempts remaining: " + (maxAttempts - i));
                }
            }
        }
    }
}
