package lesson20.homework;

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    // UNSAFE: race condition possible
    public boolean withdrawUnsafe(int amount) {
        String who = Thread.currentThread().getName();

        if (balance >= amount) {
            System.out.printf("%s checked OK (balance=%d). Trying to withdraw %d...\n",
                    who, balance, amount);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            }

            balance -= amount;

            System.out.printf("%s withdrew %d. New balance=%d\n", who, amount, balance);
            return true;
        } else {
            System.out.printf("%s cannot withdraw %d (balance=%d)\n", who, amount, balance);
            return false;
        }
    }

    // SAFE: synchronized method (fix)
    public synchronized boolean withdrawSafe(int amount) {
        String who = Thread.currentThread().getName();

        if (balance >= amount) {
            System.out.printf("%s checked OK (balance=%d). Trying to withdraw %d...\n",
                    who, balance, amount);

            try {
                Thread.sleep(100); // still present, but now protected by lock
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            }
            balance -= amount;

            System.out.printf("%s withdrew %d. New balance=%d\n", who, amount, balance);
            return true;
        } else {
            System.out.printf("%s cannot withdraw %d (balance=%d)\n", who, amount, balance);
            return false;
        }
    }
}
