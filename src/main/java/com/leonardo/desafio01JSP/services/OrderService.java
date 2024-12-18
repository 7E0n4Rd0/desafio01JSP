package com.leonardo.desafio01JSP.services;

import com.leonardo.desafio01JSP.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    /**
     * Method responsible to calculate the total of the order, with discount and shipping tax.
     * @param order obj
     * @return result of the calculation
     */
    public double total(Order order){
        return order.getBasic() - (order.getDiscount()/100 * order.getBasic()) + shippingService.shipment(order);
    }
}
