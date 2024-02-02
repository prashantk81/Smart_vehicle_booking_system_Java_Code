public class Wallet {
    private double balance;
    private boolean autoDeductEnabled;

    // Default constructor
    public Wallet() {}

    // Parameterized constructor
    public Wallet(double balance, boolean autoDeductEnabled) {
        this.balance = balance;
        this.autoDeductEnabled = autoDeductEnabled;
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public boolean isAutoDeductEnabled() {
        return autoDeductEnabled;
    }

    // Setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAutoDeductEnabled(boolean autoDeductEnabled) {
        this.autoDeductEnabled = autoDeductEnabled;
    }

    // Method to add money to the wallet
    public void addMoney(String modeOfPayment) {
        // This function will add money to wallet
        // modeOfPayment is available via json

        PaymentMethod paymentMethod;
        if (modeOfPayment == "upi")
            paymentMethod = new UPI();
        else if (modeOfPayment == "card")
            paymentMethod = new Card();
        else if (modeOfPayment == "netbanking")
            paymentMethod = new NetBanking();

    }
}
