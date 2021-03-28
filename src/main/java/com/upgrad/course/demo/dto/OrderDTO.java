package com.upgrad.course.demo.dto;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class OrderDTO {

    private int orderId;
    @NotNull(message = "Customer Id cannot be null")
    private int customerId;
    private String orderDetails;
    private List<OrderItemsDTO> orderItemsDTOList;

    public OrderDTO() {
    }

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

    public List<OrderItemsDTO> getOrderItemsDTOList() {
        return orderItemsDTOList;
    }

    public void setOrderItemsDTOList(List<OrderItemsDTO> orderItemsDTOList) {
        this.orderItemsDTOList = orderItemsDTOList;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", orderDetails='" + orderDetails + '\'' +
                ", orderItemsDTOList=" + orderItemsDTOList +
                '}';
    }
}
