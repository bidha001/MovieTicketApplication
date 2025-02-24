package booking;

public class MovieTicketClient extends Thread {
    private String customerName;
    private int ticketsToBook;
    private MovieTicketServer server;

    public MovieTicketClient(MovieTicketServer server, String customerName, int ticketsToBook) {
        this.customerName = customerName;
        this.ticketsToBook = ticketsToBook;
        this.server = server;
    }

    @Override
    public void run() {
        server.bookTickets(customerName, ticketsToBook);

    }
}
