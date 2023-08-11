/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service;

import pos.layered.service.custom.impl.CustomerSeriviceImpl;
import pos.layered.service.custom.impl.ItemServiceImpl;

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
            default:
                throw new AssertionError();
        }
    }

    public enum ServiceType {
        CUSTOMER, ITEM
    }
}
