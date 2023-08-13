/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import pos.layered.dto.OrderDto;
import pos.layered.service.custom.OrderSrevice;
import pos.layered.service.ServiceFactory;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderController {

    OrderSrevice orderSrevice = (OrderSrevice) ServiceFactory.getInstance().getSerivce(ServiceFactory.ServiceType.ORDER);

    public String placeOrder(OrderDto orderDto) throws Exception {

        return orderSrevice.placeOrder(orderDto);

    }

}
