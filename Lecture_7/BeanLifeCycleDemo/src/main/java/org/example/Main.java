package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);  // metadata , jo ki refelction ke through application context leliya

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

//        UserService userService = context.getBean(UserService.class);
//        userService.setBeanName("userBean2");

        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(1));

        context.close();

    }


}

//1.IOC Container start
//2.Read configuration
//3.IOC container AppConfig ko bhi manage krta hai
//4.Read Bean definition->bean name : orderService,bean class: OrderService,scope:singleton, lazy: false, dependency: paymentService
//5.Instantiate Object ->
//6.Dependencies are injected
//7.Aware Interfaces are called
//8.Initalization callbacks
//        initilizationBean
//        inti Method
//        Post Construct

//9.Bean is ready to use
//10.Destruction callbacks
//        DisposableBean
//        destroyMethod
//        PreDestroy
//11. Bean is destroyed



