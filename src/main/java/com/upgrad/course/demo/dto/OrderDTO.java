package com.upgrad.course.demo.dto;

import javax.validation.Valid;
import java.util.List;

public class OrderDTO {

    @Valid
    private List<ItemDTO> items;

    public OrderDTO() {
    }

    public List<ItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "items=" + items +
                '}';
    }
}
