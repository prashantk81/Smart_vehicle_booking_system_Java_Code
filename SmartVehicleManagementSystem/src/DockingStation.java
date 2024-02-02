import java.util.List;

public class DockingStation {
    private int id;
    private String location;
    private int vehicleCapacity;
    private List<SmartVehicle> currentVehicles;
    private String lastMaintenanceDate;

    // Default constructor
    public DockingStation() {}

    // Parameterized constructor
    public DockingStation(int id, String location, int vehicleCapacity, List<SmartVehicle> currentVehicles, String lastMaintenanceDate) {
        this.id = id;
        this.location = location;
        this.vehicleCapacity = vehicleCapacity;
        this.currentVehicles = currentVehicles;
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }

    // Getter for vehicleCapacity
    public int getVehicleCapacity() {
        return vehicleCapacity;
    }

    // Setter for vehicleCapacity
    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    // Getter for currentVehicles
    public List<SmartVehicle> getCurrentVehicles() {
        return currentVehicles;
    }

    // Setter for currentVehicles
    public void setCurrentVehicles(List<SmartVehicle> currentVehicles) {
        this.currentVehicles = currentVehicles;
    }

    // Getter for lastMaintenanceDate
    public String getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    // Setter for lastMaintenanceDate
    public void setLastMaintenanceDate(String lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }
}
