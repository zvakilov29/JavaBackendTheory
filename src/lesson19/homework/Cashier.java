package lesson19.homework;

import java.util.concurrent.ThreadLocalRandom;

public class Cashier implements Runnable {
    private final TicketOffice office;

    public Cashier(TicketOffice office) {
        this.office = office;
    }

    @Override
    public void run() {
        String cashierName = Thread.currentThread().getName();

        while(true){
            boolean sold = office.trySellTicket(cashierName);
            if (!sold) break;

            // small random delay to make thread interleaving more likely
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(5, 30));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }

    }
}
