import java.util.List;
public class TripManager {
    // Default constructor
    private DockingStationManager dockingStationManager;
    public TripManager(DockingStationManager dockingStationManager) {
        this.dockingStationManager = dockingStationManager;
    }

    // Method to locate vehicles for a customer
    public List<SmartVehicle> locateVehicle(Customer customer) {
        List<DockingStation> dockingStations = dockingStationManager.getDockingStationsList();
        List<SmartVehicle> availableVehicles=null;
        // we fetch all the available vehicle and return their list sorted in order of distance.
        return availableVehicles;
    }

    // Method to start a trip for a customer with a specific vehicle
    public void startTrip(Customer customer, SmartVehicle vehicle) {
        Trip trip = new Trip(0,0,customer, vehicle, null, "",  vehicle.getCurrentDockingStation());
        // add this trip to Database
        requestDSMToUpdate(vehicle.getCurrentDockingStation(), vehicle);
    }

    // Method to request updating a docking station and smart vehicle information
    public void requestDSMToUpdate(DockingStation dockingStation, SmartVehicle vehicle) {
        // asks Docking Station to update the list of current vehicles, either add or remove the vehicle as per need
    }

    // Method to end a trip
    public void endTrip(Trip trip) {
        Customer customer = trip.getCustomer();
        SmartVehicle vehicle = trip.getVehicle();
        // dest. docking station is fetched from the customer's current location

        // requestDSMToUpdate(destDockingStation, vehicle);
        // fare = requestFareCalculation(trip);
        // informPaymentManager(fare, customer);
        // requestFeedback(trip);
        // receiveFeedback(trip, null, null);
        // updateTripHistory(trip);
        // updateVehicleRating(trip);
        // update trip in database
    }

    // Method to request fare calculation for a trip
    public void requestFareCalculation(Trip trip) {
        // asks TripFareCalculator to compute the total fare to be paid by the customer
    }

    // Method to inform the payment manager about the fare and customer
    public void informPaymentManager(double fare, Customer customer) {
        // asks PaymentManager to get user to make the payment for the trip
    }

    // Method to update the trip history
    public void updateTripHistory(Trip trip) {
        Customer customer = trip.getCustomer();
        customer.getTripHistory().add(trip);
    }

    // Method to request feedback for a trip
    public void requestFeedback(Trip trip) {
        // ask feedback from user
    }

    // Method to receive and process feedback for a trip
    public void receiveFeedback(Trip trip, String feedback, int rating) {
        trip.setFeedback(feedback);
        trip.setRating(rating);
    }

    // Method to update the rating of a vehicle based on a trip
    public void updateVehicleRating(Trip trip) {
        SmartVehicle vehicle = trip.getVehicle();
        int numTrips = vehicle.getNumberOfTrips();
        int rating = trip.getRating();

        vehicle.setRating((rating + numTrips*vehicle.getRating()) / (numTrips+1));
    }
}
