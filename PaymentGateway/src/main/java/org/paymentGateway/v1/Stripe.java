package org.paymentGateway.v1;

public class Stripe {
    public void createTransactionUsingStripe(double amount) {
        System.out.println("Paid Rs " + amount + " via Stripe.");
    }
}
