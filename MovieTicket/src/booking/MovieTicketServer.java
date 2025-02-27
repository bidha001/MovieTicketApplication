package booking;

public class MovieTicketServer {
    private String movieName;
    private int availableTickets;

    public MovieTicketServer(String movieName, int availableTickets) {
        this.movieName = movieName;
        this.availableTickets = availableTickets;
    }

    public synchronized boolean bookTickets(String customerName, int tickets) {
        if (tickets > availableTickets) {
            System.out.println("Sorry, " + customerName + ". Not enough tickets available for " + movieName + ".");
            return false;
        } else {
        availableTickets -= tickets;
        System.out.println(customerName + " successfully booked " + tickets + " tickets for " + movieName + ".");
            System.out.printf("Available tickets for %s: %d\n", movieName, availableTickets);
        return true;
    }
}

    public int getAvailableTickets () {
        return availableTickets;
    }
}
