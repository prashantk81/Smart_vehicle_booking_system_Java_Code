public class UPI extends PaymentMethod {
    private String upiId;

    // Default constructor
    public UPI() {
        // Call the constructor of the superclass (PaymentMethod)
        super();
    }

    // Parameterized constructor
    public UPI(String paymentId, String upiId) {
        // Call the parameterized constructor of the superclass (PaymentMethod)
        super(paymentId);
        this.upiId = upiId;
    }

    // Getter for upiId
    public String getUpiId() {
        return upiId;
    }

    // Setter for upiId
    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    @Override 
    public void makePayment(Customer customer, double amount){
        // This function calls the appropriate API in order to make payment
    };

}
