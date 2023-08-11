/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import java.util.ArrayList;
import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.ItemDao;
import pos.layered.dto.ItemDto;
import pos.layered.entity.ItemEntity;
import pos.layered.service.custom.ItemService;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class ItemServiceImpl implements ItemService {

    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override

    public String addItem(ItemDto itemDto) throws Exception {

        if (itemDao.add(new ItemEntity(
                itemDto.getItemCode(),
                itemDto.getDescripitoin(),
                itemDto.getPackSize(),
                itemDto.getUnitPrice(),
                itemDto.getQoh()))) {

            return "Succesfully Saved";
        } else {
            return "Failed";
        }
    }

    @Override
    public String UpdaItem(ItemDto itemDto) throws Exception {
        if (itemDao.update(new ItemEntity(
                itemDto.getItemCode(),
                itemDto.getDescripitoin(),
                itemDto.getPackSize(),
                itemDto.getUnitPrice(),
                itemDto.getQoh()))) {

            return "Succesfully Updated";
        } else {
            return "Failed";
        }
    }

    @Override
    public String DeleteItem(String id) throws Exception {

        if (itemDao.delete(id)) {
            return "Succesfully Deleted";
        } else {
            return "Failed";
        }
    }

    @Override
    public ItemDto getItem(String id) throws Exception {

        ItemEntity item = itemDao.get(id);
        return new ItemDto(
                item.getItemCode(),
                item.getDescripitoin(),
                item.getPackSize(),
                item.getUnitPrice(),
                item.getQoh());

    }

    @Override
    public ArrayList<ItemDto> getAllItems() throws Exception {

        ArrayList<ItemDto> items = new ArrayList<>();
        ArrayList<ItemEntity> entitys = itemDao.getAll();

        for (ItemEntity item : entitys) {
            ItemDto itemDto = new ItemDto(
                item.getItemCode(),
                item.getDescripitoin(),
                item.getPackSize(),
                item.getUnitPrice(),
                item.getQoh());
            
            items.add(itemDto);
        }
        return items;
    }

}
