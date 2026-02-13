package lesson20.homework;

public class DepositTask implements Runnable{
    private final BankAccountWaitNotify account;
    private final int amount;
    private final long delayMs;

    public DepositTask(BankAccountWaitNotify account, int amount, long delayMs) {
        this.account = account;
        this.amount = amount;
        this.delayMs = delayMs;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delayMs);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        account.deposit(amount);
    }
}
