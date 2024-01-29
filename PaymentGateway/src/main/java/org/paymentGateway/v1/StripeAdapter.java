package org.paymentGateway.v1;



public class StripeAdapter implements PaymentGateway{
    private Stripe paymentGateway;

    public StripeAdapter (Stripe paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void processTransaction(double amount) {
        paymentGateway.createTransactionUsingStripe(amount);
    }
}

