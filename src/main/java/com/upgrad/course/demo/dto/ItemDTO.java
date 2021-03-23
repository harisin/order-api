package com.upgrad.course.demo.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ItemDTO {

    @NotNull(message = "Item Id cannot be null")
    private int itemId;
    @NotBlank(message = "Item Name cannot be blank")
    private String itemName;
    @NotNull
    @Size(min = 1, max = 5, message = "Please order minimum 1 and maximum 5 nos")
    private int quantity;

    public ItemDTO() {
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
