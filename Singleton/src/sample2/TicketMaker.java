package sample2;

public class TicketMaker {

    private int ticket = 1000;

    private static TicketMaker instance = new TicketMaker();

    private TicketMaker() {

    }

    public static TicketMaker getInstance() {
        return instance;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

}
