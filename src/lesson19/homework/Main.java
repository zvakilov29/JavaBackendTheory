package lesson19.homework;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TicketOffice office = new TicketOffice(10);

        Thread cashier1 = new Thread(new Cashier(office), "Cashier-1");
        Thread cashier2 = new Thread(new Cashier(office), "Cashier-2");
        Thread cashier3 = new Thread(new Cashier(office), "Cashier-3");

        cashier1.start();
        cashier2.start();
        cashier3.start();

        cashier1.join();
        cashier2.join();
        cashier3.join();

        System.out.println("All tickets sold. Simulation finished.");
    }
}
