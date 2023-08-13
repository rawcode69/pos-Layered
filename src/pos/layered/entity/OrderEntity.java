/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.entity;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderEntity {
    private String OrderId;
    private String OrderDate;
    private String customerId;

    public OrderEntity() {
    }

    public OrderEntity(String OrderId, String OrderDate, String customerId) {
        this.OrderId = OrderId;
        this.OrderDate = OrderDate;
        this.customerId = customerId;
    }

    /**
     * @return the OrderId
     */
    public String getOrderId() {
        return OrderId;
    }

    /**
     * @param OrderId the OrderId to set
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * @return the OrderDate
     */
    public String getOrderDate() {
        return OrderDate;
    }

    /**
     * @param OrderDate the OrderDate to set
     */
    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "OrderEntity{" + "OrderId=" + OrderId + ", OrderDate=" + OrderDate + ", customerId=" + customerId + '}';
    }
    
    
}
