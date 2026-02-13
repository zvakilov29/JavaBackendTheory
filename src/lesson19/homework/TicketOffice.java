package lesson19.homework;

public class TicketOffice {
    private int remainingTickets;
    private int nextTicketId = 1;

    public TicketOffice(int totalTickets) {
        this.remainingTickets = totalTickets;
    }

    // synchronized ensures:
    //  - no two threads sell at the same time
    //  - remainingTickets never goes negative
    //  - ticket ids are never duplicated

    public synchronized boolean trySellTicket(String cashierName){
        if(remainingTickets <= 0){
            return false; // sold out
        }

        int soldTicketId = nextTicketId;
        nextTicketId++;

        remainingTickets--;

        System.out.printf("%s sold ticket #%d | Remaining: %d%n",
                cashierName, soldTicketId, remainingTickets);

        return true;
    }
}
