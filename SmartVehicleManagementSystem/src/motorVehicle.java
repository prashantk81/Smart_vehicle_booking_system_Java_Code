import java.util.List;
public class motorVehicle extends SmartVehicle {
    private String regNumber;
    private double fuelLevel;
    private double distanceTravelled;
    // Default constructor
    public motorVehicle() {
        // Call the constructor of the superclass (SmartVehicle)
        super();
    }

    // Parameterized constructor
    public motorVehicle(int vehicleId, List<List<Integer>>[][] qrCode, boolean occupied, int numberOfTrips, int rating,
                         String supportManualPdf, String type,String regNumber, double fuelLevel, double distanceTravelled) {
        // Call the parameterized constructor of the superclass (SmartVehicle)
        super(vehicleId, qrCode, occupied, numberOfTrips, rating, supportManualPdf,type);
        this.regNumber = regNumber;
        this.fuelLevel = fuelLevel;
        this.distanceTravelled = distanceTravelled;
    }

    // Getter for regNumber
    public String getRegNumber() {
        return regNumber;
    }

    // Setter for regNumber
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    // Getter for fuelLevel
    public double getFuelLevel() {
        return fuelLevel;
    }

    // Setter for fuelLevel
    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    // Getter for distanceTravelled
    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    // Setter for distanceTravelled
    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
}
