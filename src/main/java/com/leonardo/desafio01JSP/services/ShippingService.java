package com.leonardo.desafio01JSP.services;

import com.leonardo.desafio01JSP.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    /***
     * Responsible to calculate the shipping tax according to the conditional.
     * @param order obj
     * @return double value of the tax
     */
    public double shipment(Order order){
        if(order.getBasic() >= 200.00){
            return 0.00;
        }else if(order.getBasic() >= 100.00 && order.getBasic() < 200.00){
            return 12.00;
        }else{
            return 20.0;
        }
    }

}
