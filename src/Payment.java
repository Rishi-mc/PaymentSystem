// Payment.java
// Interface defining the contract for all payment types

public interface Payment {

    /**
     * Processes the payment and returns a transaction ID.
     *
     * @param amount the amount to be paid
     * @return a unique transaction ID string
     */
    String payAmount(double amount);
}
