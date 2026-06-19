package org.example;

import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    @Bean
    public User createUser(){
        return new User("Aditya",28);
    }

    @Bean
    public PaymentService createCardPayment(){
        return new CardPayment();
    }

    @Bean
    public OrderService createOrderService(PaymentService paymentService){
        return new OrderService(paymentService);
    }

}
