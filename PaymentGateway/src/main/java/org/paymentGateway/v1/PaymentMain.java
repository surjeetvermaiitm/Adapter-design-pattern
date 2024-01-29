package org.paymentGateway.v1;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentGateway razorpayGateway=new RazorpayAdapter(new Razorpay());
        PaymentGateway stripeGateway = new StripeAdapter(new Stripe());

        double amount=330;

        razorpayGateway.processTransaction(amount);
        stripeGateway.processTransaction(amount);
    }
}
