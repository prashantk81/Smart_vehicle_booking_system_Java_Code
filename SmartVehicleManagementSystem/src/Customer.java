import java.util.List;

public class Customer extends User {
    private IDProof idProof;
    private Wallet wallet;
    private List<Trip> tripHistory;
    private double dues;
    private String location;

    // Default constructor
    public Customer() {
        // Call the constructor of the superclass (User)
        super();
    }

    // Parameterized constructor
    public Customer(int id, String name, String password, int phoneNumber, int gender, boolean isLogin,
                    IDProof idProof, Wallet wallet, List<Trip> tripHistory, double dues, String location) {
        // Call the parameterized constructor of the superclass (User)
        super(id, name, password, phoneNumber, gender, isLogin);
        
        this.idProof = idProof;
        this.wallet = wallet;
        this.tripHistory = tripHistory;
        this.dues = dues;
        this.location = location;
    }

    // Getters
    public IDProof getIDProof() {
        return idProof;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public List<Trip> getTripHistory() {
        return tripHistory;
    }

    public double getDues() {
        return dues;
    }

    public String getLocation() {
        return location;
    }

    // Setters
    public void setIDProof(IDProof idProof) {
        this.idProof = idProof;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public void setTripHistory(List<Trip> tripHistory) {
        this.tripHistory = tripHistory;
    }

    public void setDues(double dues) {
        this.dues = dues;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
