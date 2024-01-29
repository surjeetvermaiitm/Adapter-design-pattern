package org.paymentGateway.v1;

public class RazorpayAdapter implements PaymentGateway{
    private Razorpay paymentGateway;

    public RazorpayAdapter(Razorpay paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void processTransaction(double amount) {
        paymentGateway.createTransactionUsingRazorpay(amount);
    }
}
