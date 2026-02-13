package lesson20.homework;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("\n========== UNSAFE RUN (expect possible negative balance) ==========");
        runScenario(false);

        System.out.println("\n========== SAFE RUN (synchronized) ==========");
        runScenario(true);

        System.out.println("\n========== BONUS (wait/notify) ==========");
        BonusWaitNotifyDemo.run();

    }

    private static void runScenario(boolean safeMode) throws InterruptedException {
        BankAccount account = new BankAccount(1000);

        int amount = 700;

        Thread husband = new Thread(new WithdrawTask(account, amount, safeMode), "Husband");
        Thread wife    = new Thread(new WithdrawTask(account, amount, safeMode), "Wife");

        husband.start();
        wife.start();

        husband.join();
        wife.join();

        System.out.println("FINAL BALANCE = " + account.getBalance());
    }
}
