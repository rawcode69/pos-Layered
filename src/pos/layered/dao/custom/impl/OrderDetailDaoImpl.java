/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao.custom.impl;

import java.util.ArrayList;
import pos.layered.dao.CrudUtil;
import pos.layered.dao.custom.OrderDetailDao;
import pos.layered.entity.OrderDetailEntity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderDetailDaoImpl implements OrderDetailDao {

    @Override
    public boolean add(OrderDetailEntity t) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO orderdetail VALUES (?,?,?,?)", t.getOrderId(),t.getItemID(),t.getItemQty(),t.getDiscount());
    }

    @Override
    public boolean update(OrderDetailEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String ID) throws Exception {
        return false;
    }

    @Override
    public OrderDetailEntity get(String ID) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderDetailEntity> getAll() throws Exception {
        return null;
    }

}
