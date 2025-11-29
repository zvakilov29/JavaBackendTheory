package lesson04;

import java.util.Scanner;

public class Task1_V1 {
    public static void main(String[] args) {
        String realPin = "2942";
        int attemptCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!");

        while(true){
            System.out.print("Please enter your pin number: ");
            String enteredPin = input.nextLine();
            attemptCount++;

            if(enteredPin.equals(realPin)){
                System.out.println("Access granted!");
                break;
            } else{
                System.out.println("Wrong input!");
            }

            if(attemptCount == 3) {
                System.out.println("Too many failed attempts, your account has been blocked!");
                break;
            }
        }
    }
}
