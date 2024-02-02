import java.util.List;
public class DockingStationManager {
    private List<DockingStation> dockingStations;
    public List<DockingStation> getDockingStationsList()
    {
        return dockingStations;
    }
    public void addDockingStation(DockingStation dockingStation){
        dockingStations.add(dockingStation);
    }
    public void removeDockingStation(DockingStation dockingStation){
        dockingStations.remove(dockingStation);
    }
    public void updateDockingStation(DockingStation dockingStation, SmartVehicle smartVehicle) {
        if (dockingStation.getCurrentVehicles().contains(smartVehicle))
            dockingStation.getCurrentVehicles().remove(smartVehicle);
        else{
            dockingStation.getCurrentVehicles().add(smartVehicle);
            smartVehicle.setStation(dockingStation);
        }
    }
}
