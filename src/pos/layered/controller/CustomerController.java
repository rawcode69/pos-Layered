/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import java.util.ArrayList;
import pos.layered.dto.CustomerDto;
import pos.layered.service.custom.CustomerService;
import pos.layered.service.ServiceFactory;
import static pos.layered.service.ServiceFactory.ServiceType.CUSTOMER;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class CustomerController {

    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getSerivce(CUSTOMER);

    public String addCustomer(CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
    }

    public ArrayList<CustomerDto> getAllCustomers() throws Exception{
        return customerService.getAllCustoemrs();
    }

    public String updateCustomer(CustomerDto customerDto) throws  Exception{
       return customerService.UpdateCustomer(customerDto);
    }

    public String deleteCutsomer(String id) throws  Exception{
       return customerService.DeleteCustomer(id);
    }

    public CustomerDto getCustomer(String custId) throws  Exception{
       return customerService.getCustomer(custId);
    }

}
