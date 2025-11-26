//fahad abdullah aljabri-451008323 
public class Bus {

    private int busId;
    private int driverId;
    private String busNumber;
    private int capacity;
    private String areaList = ""; 

    public Bus(int busId, int driverId, String busNumber, int capacity) {
        this.busId = busId;
        this.driverId = driverId;
        this.busNumber = busNumber;
        this.capacity = capacity;
    }
    public void addArea(String area) {
        areaList += area + " ";
    }
    public void busDetails() {
        System.out.println("Bus ID: " + busId);
        System.out.println("Driver ID: " + driverId);
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Capacity: " + capacity);
        System.out.println("Areas: " + areaList);
    }
    public void showSeats() {
        System.out.println("Available Seats: " + capacity);
    }
}
