public class PaymentManager {
    public void deductAmount(double fare, Customer customer,String modeOfPayment) {
        if (modeOfPayment == "wallet"){
            if (customer.getWallet().isAutoDeductEnabled() && checkSufficientBalance(fare, customer))
                autoDeduct(fare,customer);
            else
                manualPayViaWallet();
        }
        else if(modeOfPayment == "payLater")
            settleDues();
        else
            payViaOtherPaymentMethod(modeOfPayment);
    }
    public boolean checkSufficientBalance(double fare, Customer customer) {
        return fare <= customer.getWallet().getBalance();
    }
    public void autoDeduct(double fare, Customer customer) {
        customer.getWallet().setBalance(customer.getWallet().getBalance()-fare);
    }
    public void manualPayViaWallet() {
        // payment will be made by wallet;
    }
    public void payViaOtherPaymentMethod(String modeOfPayment) {
        // payment will be made by other payment method;
    }
    public void settleDues() {
        // we use appropriate institute API for fetching administrative data, 
        // to update the dues of customer
    }
}
