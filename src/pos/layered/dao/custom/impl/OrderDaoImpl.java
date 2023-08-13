/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao.custom.impl;

import java.util.ArrayList;
import pos.layered.dao.CrudUtil;
import pos.layered.dao.custom.OrderDao;
import pos.layered.entity.OrderEntity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderDaoImpl implements OrderDao {

    @Override
    public boolean add(OrderEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Orders VALUES (?,?,?)", t.getOrderId(),t.getOrderDate(),t.getCustomerId());
    }

    @Override
    public boolean update(OrderEntity t) throws Exception {
       return false;
    }

    @Override
    public boolean delete(String ID) throws Exception {
        return false;
    }

    @Override
    public OrderEntity get(String ID) throws Exception {
       return null;
    }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
        return null;
    }

   
    

}
