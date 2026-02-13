package lesson20.homework;

public class BonusWaitNotifyDemo {
    public static void run() throws InterruptedException {
        BankAccountWaitNotify account = new BankAccountWaitNotify(1000);

        Thread husband = new Thread(() -> account.withdraw(1200), "Husband");
        Thread wife    = new Thread(() -> account.withdraw(300), "Wife");

        Thread bank = new Thread(new DepositTask(account, 500, 500), "Bank");

        husband.start();
        wife.start();
        bank.start();

        husband.join();
        wife.join();
        bank.join();

        System.out.println("BONUS DONE.");
    }
}
