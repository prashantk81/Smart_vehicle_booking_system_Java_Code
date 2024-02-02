public abstract class PaymentMethod {
    private String paymentId;

    // Default constructor
    public PaymentMethod() {}

    // Parameterized constructor
    public PaymentMethod(String paymentId) {
        this.paymentId = paymentId;
    }

    // Getter for paymentId
    public String getPaymentId() {
        return paymentId;
    }

    // Setter for paymentId
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    // Abstract method for making payments
    public abstract void makePayment(Customer customer, double amount);
}
