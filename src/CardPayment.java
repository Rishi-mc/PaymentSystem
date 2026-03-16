// CardPayment.java
// Implements the Payment interface for card-based transactions

public class CardPayment implements Payment {

    private String cardNumber;
    private String cardHolder;

    public CardPayment(String cardNumber, String cardHolder) {
        // Store only last 4 digits for security
        this.cardNumber = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        this.cardHolder = cardHolder;
    }

    @Override
    public String payAmount(double amount) {
        // Generate a unique Card transaction ID
        String transactionId = "CARD-" + System.currentTimeMillis();
        System.out.println("Card Payment of ₹" + amount + " charged to " + cardNumber + " (" + cardHolder + ")");
        System.out.println("Transaction ID: " + transactionId);
        return transactionId;
    }

    public String getCardHolder() {
        return cardHolder;
    }
}
