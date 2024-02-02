import java.util.List;

public abstract class SmartVehicle {
    private int vehicleId;
    private List<List<Integer>>[][] qrCode;
    private boolean occupied;
    private int numberOfTrips;
    private int rating;
    private String supportManualPdf;
    private String type;
    private DockingStation station;
    // Default constructor
    public SmartVehicle() {}

    // Parameterized constructor
    public SmartVehicle(int vehicleId, List<List<Integer>>[][] qrCode, boolean occupied, int numberOfTrips, int rating, String supportManualPdf,String type) {
        this.vehicleId = vehicleId;
        this.qrCode = qrCode;
        this.occupied = occupied;
        this.numberOfTrips = numberOfTrips;
        this.rating = rating;
        this.supportManualPdf = supportManualPdf;
        this.type=type;
        this.station=null;
    }

    // Getters
    public int getVehicleId() {
        return vehicleId;
    }

    public List<List<Integer>>[][] getQrCode() {
        return qrCode;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public int getNumberOfTrips() {
        return numberOfTrips;
    }

    public int getRating() {
        return rating;
    }

    public String getSupportManualPdf() {
        return supportManualPdf;
    }

    public String getType() {
        return type;
    }
    public DockingStation getCurrentDockingStation()
    {
        return station;
    }
    
    // Setters
    public void setType(String type) {
    this.type = type;
}
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setQrCode(List<List<Integer>>[][] qrCode) {
        this.qrCode = qrCode;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setNumberOfTrips(int numberOfTrips) {
        this.numberOfTrips = numberOfTrips;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setSupportManualPdf(String supportManualPdf) {
        this.supportManualPdf = supportManualPdf;
    }
    public void setStation(DockingStation station)
    {
        this.station=station;
    }
}
