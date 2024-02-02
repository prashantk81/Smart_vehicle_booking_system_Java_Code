import java.util.List;
import java.lang.Double;
public class TripFareCalculator {
    private double fine=100;
    private final double bicycleRate=50; //default values (per hours)
    private final double motorRate=20; //default values (per km)

    private List<Double> baseFares;
    // bicycle : baseFares[0]
    // bike : baseFares[1]
    // moped : baseFares[2]

    // Default constructor
    public TripFareCalculator() {}

    // Parameterized constructor
    public TripFareCalculator(double fine, List<Double> baseFares) {
        this.fine = fine;
        this.baseFares = baseFares;
    }

    // Getter for fine
    public double getFine() {
        return fine;
    }

    // Setter for fine
    public void setFine(double fine) {
        this.fine = fine;
    }

    // Getter for baseFares
    public List<Double> getBaseFare() {
        return baseFares;
    }

    // Setter for baseFares
    public void setBaseFare(List<Double> baseFares) {
        this.baseFares = baseFares;
    }

    // Method to calculate trip fare
    public double calculateTripFare(Trip trip) {
        double baseFare;
        double totalFare=0.0;
       
        double time=trip.getDuration()/3600;
        if(trip.getVehicle().getType()=="bicycle"){
            baseFare = baseFares.get(0);
            
            totalFare = baseFare  +  time*bicycleRate;
        }
        else if(trip.getVehicle().getType()=="bike"){
            baseFare=baseFares.get(1);
            totalFare = baseFare  +  time*motorRate;
        }
        else if(trip.getVehicle().getType()=="moped"){
            baseFare=baseFares.get(2);
            totalFare = baseFare  +  time*motorRate;
        }
        return totalFare;
    }
}
