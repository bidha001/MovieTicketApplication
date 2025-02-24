package booking;

public class MovieTicketServer {
    private String movieName;
    private int availableTickets;

    MovieTicketServer(String movieName, int availableTickets) {
        this.movieName = movieName;
        this.availableTickets = availableTickets;
    }

    public synchronized boolean bookTickets(String customerName, int tickets) {
        if (tickets > availableTickets) {
            return false;
        } else {
        availableTickets -= tickets;
        System.out.println("Tickets booked for " + customerName + " for " + movieName + " for " + tickets + " tickets.");
        return true;
    }
}

    public int getAvailableTickets () {
        return availableTickets;
    }
}
