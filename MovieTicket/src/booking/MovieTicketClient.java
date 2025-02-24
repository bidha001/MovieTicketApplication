package booking;

public class MovieTicketClient implements Runnable {
    private String customerName;
    private int ticketsToBook;
    private MovieTicketServer server;

    MovieTicketClient(String customerName, int ticketsToBook, MovieTicketServer server) {
        this.customerName = customerName;
        this.ticketsToBook = ticketsToBook;
        this.server = server;
    }

    @Override
    public void run() {
        server.bookTickets(customerName, ticketsToBook);

    }
}
