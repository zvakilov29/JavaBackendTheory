package lesson20.homework;

public class WithdrawTask implements Runnable{
    private final BankAccount account;
    private final int amount;
    private final boolean safeMode;

    public WithdrawTask(BankAccount account, int amount, boolean safeMode) {
        this.account = account;
        this.amount = amount;
        this.safeMode = safeMode;
    }

    @Override
    public void run() {
        if (safeMode) {
            account.withdrawSafe(amount);
        } else {
            account.withdrawUnsafe(amount);
        }
    }
}
