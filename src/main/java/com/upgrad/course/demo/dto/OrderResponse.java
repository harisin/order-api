package com.upgrad.course.demo.dto;

import java.util.List;

public class OrderResponse {

    private int orderId;
    private List<ItemDTO> items;

    public OrderResponse() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<ItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrderResponse{" +
                "orderId=" + orderId +
                ", items=" + items +
                '}';
    }
}
