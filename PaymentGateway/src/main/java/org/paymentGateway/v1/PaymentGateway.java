package org.paymentGateway.v1;

public interface PaymentGateway {
    void processTransaction(double amount);
}
