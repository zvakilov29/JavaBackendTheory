package lesson20.homework;

public class BankAccountWaitNotify {
    private int balance;

    public BankAccountWaitNotify(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.printf("BANK deposited %d. Balance=%d -> notifyAll()\n", amount, balance);
        notifyAll();
    }

    public synchronized void withdraw(int amount) {
        String who = Thread.currentThread().getName();

        while (balance < amount) {
            System.out.printf("%s wants %d but balance=%d. Waiting...\n", who, amount, balance);
            try {
                wait(); // releases lock, waits
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.printf("%s sees enough money (balance=%d). Withdrawing %d...\n", who, balance, amount);
        balance -= amount;
        System.out.printf("%s withdrew %d. New balance=%d\n", who, amount, balance);
    }
}
