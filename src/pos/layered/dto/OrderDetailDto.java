/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dto;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderDetailDto {
    private String itemCode;
    private Integer orderQuantity;
    private Double discount;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String itemCode, Integer orderQuantity, Double discount) {
        this.itemCode = itemCode;
        this.orderQuantity = orderQuantity;
        this.discount = discount;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the orderQuantity
     */
    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * @param orderQuantity the orderQuantity to set
     */
    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
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
        return "OrderDetailDto{" + "itemCode=" + itemCode + ", orderQuantity=" + orderQuantity + ", discount=" + discount + '}';
    }
    
    
}
