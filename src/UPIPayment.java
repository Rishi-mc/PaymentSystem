// UPIPayment.java
// Implements the Payment interface for UPI-based transactions

public class UPIPayment implements Payment {

    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public String payAmount(double amount) {
        // Generate a unique UPI transaction ID
        String transactionId = "UPI-" + System.currentTimeMillis();
        System.out.println("UPI Payment of ₹" + amount + " initiated via " + upiId);
        System.out.println("Transaction ID: " + transactionId);
        return transactionId;
    }

    public String getUpiId() {
        return upiId;
    }
}
