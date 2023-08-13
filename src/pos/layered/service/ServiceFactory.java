/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service;

import pos.layered.service.custom.impl.CustomerSeriviceImpl;
import pos.layered.service.custom.impl.ItemServiceImpl;
import pos.layered.service.custom.impl.OrderServiceImpl;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperSerivce getSerivce(ServiceType type) {
        switch (type) {
            case CUSTOMER:
                return new CustomerSeriviceImpl();

            case ITEM:
                return new ItemServiceImpl();

            case ORDER:
                return new OrderServiceImpl();

            default:
                return null;
        }
    }

    public enum ServiceType {
        CUSTOMER, ITEM, ORDER
    }
}
