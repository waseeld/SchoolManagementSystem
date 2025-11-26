 //fahad abdullah aljabri-451008323 
public class Auditorium {

    private int totalSeats;
    private int seatsOccupied;
    private String eventName;
    private String eventDate;
    private String eventTime;

    public Auditorium(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seatsOccupied = 0;
    }

    public void bookAuditorium(String eventName, String eventDate, String eventTime, int participants) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.seatsOccupied = participants;
    }

    public void eventDetails() {
        System.out.println("Event: " + eventName);
        System.out.println("Date: " + eventDate);
        System.out.println("Time: " + eventTime);
    }

    public void displaySeats() {
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Occupied: " + seatsOccupied);
    }
}
