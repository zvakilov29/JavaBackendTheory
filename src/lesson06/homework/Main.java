package lesson06.homework;

public class Main {
    public static void main(String[] args) {
        EWallet myWallet = new EWallet(400);

        System.out.println("--- Welcome to E-Wallet ---");

        // Check initial balance
        System.out.println("Current Balance: " + myWallet.getBalance());

        System.out.println("-----");

        // Test 1: Deposit money
        myWallet.deposit(150.0);
        System.out.println("Current Balance: " + myWallet.getBalance());

        System.out.println("-----");

        // Test 2: Withdraw valid amount
        myWallet.withdraw(50.0);
        System.out.println("Current Balance: " + myWallet.getBalance());

        System.out.println("-----");

        // Test 3: Withdraw too much (insufficient funds)
        myWallet.withdraw(1000.0);

        System.out.println("-----");

        // Test 4: Negative input
        myWallet.deposit(-20);

        System.out.println("-----");

    }
}
