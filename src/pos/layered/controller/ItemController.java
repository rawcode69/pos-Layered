/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controller;

import java.util.ArrayList;
import pos.layered.dto.ItemDto;
import pos.layered.service.ServiceFactory;
import pos.layered.service.custom.ItemService;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class ItemController {

    ItemService itemService = (ItemService) ServiceFactory.getInstance().getSerivce(ServiceFactory.ServiceType.ITEM);

    public String addItem(ItemDto itemDto) throws Exception {
        return itemService.addItem(itemDto);
    }

    public ArrayList<ItemDto> getAllItem() throws Exception {
        return itemService.getAllItems();
    }

    public String updateItem(ItemDto itemDto) throws Exception {
        return itemService.UpdaItem(itemDto);
    }

    public String deleteItem(String id) throws Exception {
        return itemService.DeleteItem(id);
    }

    public ItemDto getItem(String custId) throws Exception {
        return itemService.getItem(custId);
    }
}
