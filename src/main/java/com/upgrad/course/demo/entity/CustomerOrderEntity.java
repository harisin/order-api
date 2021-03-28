package com.upgrad.course.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer_order", schema = "fooddelivery")
public class CustomerOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id", unique = true, nullable = false)
    private int orderId;
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "order_details")
    private String orderDetails;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "CustomerOrderEntity{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", orderDetails='" + orderDetails + '\'' +
                '}';
    }
}
