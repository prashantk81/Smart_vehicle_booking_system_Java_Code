
public class NetBanking extends PaymentMethod {
    private String transId;

    // Default constructor
    public NetBanking() {
        // Call the constructor of the superclass (PaymentMethod)
        super();
    }

    // Parameterized constructor
    public NetBanking(String paymentId, String transId) {
        // Call the parameterized constructor of the superclass (PaymentMethod)
        super(paymentId);
        this.transId = transId;
    }

    // Getter for transId
    public String getTransId() {
        return transId;
    }

    // Setter for transId
    public void setTransId(String transId) {
        this.transId = transId;
    }
    @Override 
    public void makePayment(Customer customer, double amount){
        // This function calls the appropriate API in order to make payment
    };
}
