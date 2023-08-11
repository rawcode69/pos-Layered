/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.service.custom;

import java.util.ArrayList;
import pos.layered.service.SuperSerivce;
import pos.layered.dto.ItemDto;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public interface ItemService extends SuperSerivce {

    public String addItem(ItemDto itemDto) throws Exception;

    public String UpdaItem(ItemDto itemDto) throws Exception;

    public String DeleteItem(String id) throws Exception;

    public ItemDto getItem(String id) throws Exception;

    public ArrayList<ItemDto> getAllItems() throws Exception;
}
