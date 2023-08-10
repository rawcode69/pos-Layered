/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import java.util.ArrayList;
import pos.layered.dao.custom.CustomerDao;
import pos.layered.dto.CustomerDto;
import pos.layered.entity.CustomerEntity;
import pos.layered.service.custom.CustomerService;
import pos.layered.dao.DaoFactory;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class CustomerSeriviceImpl implements CustomerService {

    CustomerDao CustomerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                customerDto.getId(),
                customerDto.getTitle(),
                customerDto.getName(),
                customerDto.getDob(),
                customerDto.getSalary(),
                customerDto.getAddress(),
                customerDto.getCity(),
                customerDto.getProvince(),
                customerDto.getZip());

        if (CustomerDao.add(customerEntity)) {
            return "Succesfully Added";
        } else {
            return "Fail";
        }

    }

    @Override
    public String UpdateCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(
                customerDto.getId(),
                customerDto.getTitle(),
                customerDto.getName(),
                customerDto.getDob(),
                customerDto.getSalary(),
                customerDto.getAddress(),
                customerDto.getCity(),
                customerDto.getProvince(),
                customerDto.getZip());

        if (CustomerDao.update(customerEntity)) {
            return "Succesfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String DeleteCustomer(String id) throws Exception {

        if (CustomerDao.delete(id)) {
            return "Succesfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity customerEntity = CustomerDao.get(id);
        return new CustomerDto(
                customerEntity.getId(),
                customerEntity.getTitle(),
                customerEntity.getName(),
                customerEntity.getDob(),
                customerEntity.getSalary(),
                customerEntity.getAddress(),
                customerEntity.getCity(),
                customerEntity.getProvince(),
                customerEntity.getZip());
    }

    @Override
    public ArrayList<CustomerDto> getAllCustoemrs() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntitys = CustomerDao.getAll();

        for (CustomerEntity customerEntity : customerEntitys) {
            CustomerDto customerDto = new CustomerDto(
                    customerEntity.getId(),
                    customerEntity.getTitle(),
                    customerEntity.getName(),
                    customerEntity.getDob(),
                    customerEntity.getSalary(),
                    customerEntity.getAddress(),
                    customerEntity.getCity(),
                    customerEntity.getProvince(),
                    customerEntity.getZip());

            customerDtos.add(customerDto);
        }
        return customerDtos;
    }

}
