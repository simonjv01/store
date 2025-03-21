package com.vargas.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.apple.eawt.Application;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

       ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
       var orderService = context.getBean(OrderService.class);

        //var orderService = new OrderService(new PayPalPaymentService());
        
        orderService.placeOrder();
    }

}
