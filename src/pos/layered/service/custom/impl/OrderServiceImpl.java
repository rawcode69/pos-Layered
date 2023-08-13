/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import pos.layered.dao.custom.OrderDao;
import pos.layered.service.custom.OrderSrevice;
import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.ItemDao;
import pos.layered.dto.OrderDto;
import pos.layered.entity.OrderEntity;
import pos.layered.dao.custom.OrderDetailDao;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import pos.layered.db.DBConnection;
import pos.layered.dto.OrderDetailDto;
import pos.layered.entity.ItemEntity;
import pos.layered.entity.OrderDetailEntity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderServiceImpl implements OrderSrevice {

    private OrderDao orderDao = (OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER);
    private OrderDetailDao orderDetailDao = (OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDERDETAIL);
    private ItemDao ItemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String placeOrder(OrderDto orderDto) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (orderDao.add(new OrderEntity(
                    orderDto.getOrderId(),
                    sdf.format(new Date()),
                    orderDto.getCustomerId()))) {

                boolean isOrderDetialSaved = true;

                for (OrderDetailDto orderDetailDto : orderDto.getOrderDetailDtos()) {

                    if (!orderDetailDao.add(new OrderDetailEntity(
                            orderDto.getOrderId(),
                            orderDetailDto.getItemCode(),
                            orderDetailDto.getOrderQuantity(),
                            orderDetailDto.getDiscount()))) {
                        isOrderDetialSaved = false;
                    }

                }

                if (isOrderDetialSaved) {

                    boolean isItemUpdated = true;

                    for (OrderDetailDto orderDetailDto : orderDto.getOrderDetailDtos()) {

                        ItemEntity entity = ItemDao.get(orderDetailDto.getItemCode());
                        entity.setQoh(entity.getQoh() - orderDetailDto.getOrderQuantity());

                        if (!ItemDao.update(entity)) {
                            isItemUpdated = false;
                        }
                    }

                    if (isItemUpdated) {
                        connection.commit();
                        return "Succes";
                    } else {
                        connection.rollback();
                        return "Item Update Error";
                    }
                } else {
                    connection.rollback();
                    return "OrderDetail Save Error";
                }
            } else {
                connection.rollback();
                return "Order Save Error";
            }
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }

    }

}
