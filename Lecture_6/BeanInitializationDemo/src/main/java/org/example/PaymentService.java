package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
//@Scope("prototype")
public class PaymentService {
    public PaymentService() {
        System.out.println("paymentService Created");
    }

    public void pay(){
        System.out.println("Payment Successful");
    }
}
