public class Card extends PaymentMethod {
    private String cardType;
    private String cardProviderId;

    // Default constructor
    public Card() {
        // Call the constructor of the superclass (PaymentMethod)
        super();
    }

    // Parameterized constructor
    public Card(String paymentId, String cardType, String cardProviderId) {
        // Call the parameterized constructor of the superclass (PaymentMethod)
        super(paymentId);
        this.cardType = cardType;
        this.cardProviderId = cardProviderId;
    }

    // Getter for cardType
    public String getCardType() {
        return cardType;
    }

    // Setter for cardType
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    // Getter for cardProviderId
    public String getCardProviderId() {
        return cardProviderId;
    }

    // Setter for cardProviderId
    public void setCardProviderId(String cardProviderId) {
        this.cardProviderId = cardProviderId;
    }
    
    @Override 
    public void makePayment(Customer customer, double amount){
        // This function calls the appropriate API in order to make payment
    };
}
