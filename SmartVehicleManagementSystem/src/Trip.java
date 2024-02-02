public class Trip {
    private double distance;
    private int duration;
    private Customer customer;
    private SmartVehicle vehicle;
    private String feedback;
    private Integer rating;
    private DockingStation srcDockingStation;
    private DockingStation dstDockingStation;

    // Default constructor
    public Trip() {}

    // Parameterized constructor
    public Trip(double distance, int duration, Customer customer, SmartVehicle vehicle, Integer rating, String feedback,
                DockingStation srcDockingStation) {
        this.distance = distance;
        this.duration = duration;
        this.customer = customer;
        this.vehicle = vehicle;
        this.feedback = feedback;
        this.rating = rating;
        this.srcDockingStation = srcDockingStation;
        this.dstDockingStation = null;
    }

    // Getter for distance
    public double getDistance() {
        return distance;
    }

    // Setter for distance
    public void setDistance(double distance) {
        this.distance = distance;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Setter for duration
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Getter for customer
    public Customer getCustomer() {
        return customer;
    }

    // Setter for customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Getter for vehicle
    public SmartVehicle getVehicle() {
        return vehicle;
    }

    // Setter for vehicle
    public void setVehicle(SmartVehicle vehicle) {
        this.vehicle = vehicle;
    }

    // Getter for feedback
    public String getFeedback() {
        return feedback;
    }

    // Setter for feedback
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    // Getter for rating
    public int getRating() {
        return rating;
    }

    // Setter for rating
    public void setRating(int rating) {
        this.rating = rating;
    }

    // Getter for srcDockingStation
    public DockingStation getSrcDockingStation() {
        return srcDockingStation;
    }

    // Setter for srcDockingStation
    public void setSrcDockingStation(DockingStation srcDockingStation) {
        this.srcDockingStation = srcDockingStation;
    }

    // Getter for dstDockingStation
    public DockingStation getDstDockingStation() {
        return dstDockingStation;
    }

    // Setter for dstDockingStation
    public void setDstDockingStation(DockingStation dstDockingStation) {
        this.dstDockingStation = dstDockingStation;
    }
}
