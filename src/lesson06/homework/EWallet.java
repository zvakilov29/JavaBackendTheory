package lesson06.homework;

public class EWallet {
    private double balance;

    public EWallet() {
        this.balance = 0;
    }

    public EWallet(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
            return;
        }

        this.balance += amount;
        System.out.println("Success: Deposited " + amount + " AZN.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return;
        }

        if (amount > this.balance) {
            System.out.println("Error: Insufficient funds! You only have " + this.balance + " AZN.");
            return;
        }

        this.balance -= amount;
        System.out.println("Success: Withdrew " + amount + " AZN.");
    }
}
