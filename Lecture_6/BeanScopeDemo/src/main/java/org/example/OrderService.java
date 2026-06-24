package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("singleton") // ek hi object , eager initialization
@Scope("prototype") //multiple object ,lazy initialization
public class OrderService {

    public OrderService(){
        System.out.println("OrderService Created");
    }
    public void placeOrder(){
        System.out.println("Order Placed");
    }
}
