package com.vargas.store;

public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with PayPal");
        System.out.println("Amount: " + amount);

    }
}
