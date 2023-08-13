/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.entity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderDetailEntity {
    private String orderId;
    private String itemID;
    private Integer itemQty;
    private Double discount;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(String orderId, String itemID, Integer itemQty, Double discount) {
        this.orderId = orderId;
        this.itemID = itemID;
        this.itemQty = itemQty;
        this.discount = discount;
    }
    
    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the itemID
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the itemQty
     */
    public Integer getItemQty() {
        return itemQty;
    }

    /**
     * @param itemQty the itemQty to set
     */
    public void setItemQty(Integer itemQty) {
        this.itemQty = itemQty;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" + "orderId=" + orderId + ", itemID=" + itemID + ", itemQty=" + itemQty + ", discount=" + discount + '}';
    }
    
    
}







