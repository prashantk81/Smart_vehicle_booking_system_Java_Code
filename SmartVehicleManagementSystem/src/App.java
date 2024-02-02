import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) {
        // Create instances
        Admin admin = new Admin();
        admin.setId(1);
        admin.setName("AdminName");
        admin.setPassword("adminPass");
        admin.setPhoneNumber(123456789);
        admin.setGender(1);
        admin.setLogin(true);
        admin.setPrivileges("AdminPrivileges");

        Customer customer = new Customer();
        customer.setId(2);
        customer.setName("CustomerName");
        customer.setPassword("customerPass");
        customer.setPhoneNumber(987654321);
        customer.setGender(2);
        customer.setLogin(true);

        IDProof idProof = new IDProof();
        idProof.setIdNum(123);
        idProof.setIdType("IDCard");
        customer.setIDProof(idProof);

        Wallet wallet = new Wallet();
        wallet.setBalance(100.0);
        wallet.setAutoDeductEnabled(true);
        customer.setWallet(wallet);

        // Create and set other instances as needed

        // Example usage
        UserAccountManager userManager = new UserAccountManager();
        userManager.createAccount();

        PaymentManager paymentManager = new PaymentManager();

        List<DockingStation> dockingStations = new ArrayList<>();
        DockingStation dockingStation = new DockingStation();
        dockingStation.setId(1);
        dockingStation.setLocation("Station1");
        dockingStation.setVehicleCapacity(10);
        dockingStations.add(dockingStation);

        DockingStationManager dockingStationManager = new DockingStationManager();
        TripFareCalculator fareCalculator = new TripFareCalculator();
        TripManager tripManager = new TripManager(dockingStationManager);
    }
}
