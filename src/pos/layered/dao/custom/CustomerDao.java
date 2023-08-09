/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.dao.custom;

import pos.layered.dao.SuperDao;
import pos.layered.entity.CustomerEntity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public interface CustomerDao extends SuperDao{
    
    public String addCustomer(CustomerEntity customerEntity) throws  Exception;
}
