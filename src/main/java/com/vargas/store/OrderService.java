package com.vargas.store;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {


    private PaymentService paymentService;

    public OrderService() {
    }
    
    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {

        paymentService.processPayment(100.0);
    }



    



}
