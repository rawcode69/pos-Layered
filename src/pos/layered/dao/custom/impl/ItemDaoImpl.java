/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao.custom.impl;

import java.util.ArrayList;
import pos.layered.dao.CrudUtil;
import pos.layered.dao.custom.ItemDao;
import pos.layered.entity.ItemEntity;
import java.sql.ResultSet;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class ItemDaoImpl implements ItemDao {

    @Override
    public boolean add(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO item VALUES (?,?,?,?,?  )", t.getItemCode(), t.getDescripitoin(), t.getPackSize(), t.getUnitPrice(), t.getQoh());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE item SET Description = ?, PackSize = ?, UnitPrice = ?, QtyOnHand = ? WHERE ItemCode=?",  t.getDescripitoin(), t.getPackSize(), t.getUnitPrice(), t.getQoh(),t.getItemCode());

    }

    @Override
    public boolean delete(String ID) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM item WHERE ItemCode=?", ID);
    }

    @Override
    public ItemEntity get(String ID) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item WHERE ItemCode = ?", ID);

        while (rst.next()) {
            ItemEntity item = new ItemEntity(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));

            return item;
        }
        return null;
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item ");

        ArrayList<ItemEntity> entitys = new ArrayList<>();

        while (rst.next()) {
            ItemEntity item = new ItemEntity(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));

            entitys.add(item);
        }
        return entitys;
    }

}
