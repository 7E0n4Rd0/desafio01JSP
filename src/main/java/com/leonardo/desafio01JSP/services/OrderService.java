package com.leonardo.desafio01JSP.services;

import com.leonardo.desafio01JSP.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        return 0.0;
    }
}
