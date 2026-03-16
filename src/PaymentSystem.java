// PaymentSystem.java
// Driver class — demonstrates interface polymorphism and stores transaction IDs

import java.util.ArrayList;

public class PaymentSystem {

    public static void main(String[] args) {

        // ArrayList to store all transaction IDs
        ArrayList<String> transactionIds = new ArrayList<>();

        // Polymorphism: both objects referenced via the Payment interface
        Payment upi  = new UPIPayment("rishi@upi");
        Payment card = new CardPayment("1234567812345678", "Rishi Kumar");

        System.out.println("===== Payment System =====\n");

        // Process UPI payment
        System.out.println("--- UPI Payment ---");
        String upiTxn = upi.payAmount(499.00);
        transactionIds.add(upiTxn);

        System.out.println();

        // Process Card payment
        System.out.println("--- Card Payment ---");
        String cardTxn = card.payAmount(1299.00);
        transactionIds.add(cardTxn);

        System.out.println();

        // Display all recorded transaction IDs
        System.out.println("===== Transaction History =====");
        for (int i = 0; i < transactionIds.size(); i++) {
            System.out.println((i + 1) + ". " + transactionIds.get(i));
        }

        System.out.println("\nTotal transactions: " + transactionIds.size());
    }
}
