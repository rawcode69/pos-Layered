/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.service.custom;

import java.util.ArrayList;
import pos.layered.dto.CustomerDto;
import pos.layered.service.SuperSerivce;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public interface CustomerService extends SuperSerivce {

    public String addCustomer(CustomerDto customerDto) throws Exception;

    public String UpdateCustomer(CustomerDto customerDto) throws Exception;

    public String DeleteCustomer(String id) throws Exception;

    public CustomerDto getCustomer(String id) throws Exception;

    public ArrayList<CustomerDto> getAllCustoemrs() throws Exception;

}
