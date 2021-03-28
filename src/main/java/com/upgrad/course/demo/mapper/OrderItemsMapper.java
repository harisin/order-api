package com.upgrad.course.demo.mapper;

import com.upgrad.course.demo.dto.OrderDTO;
import com.upgrad.course.demo.dto.OrderItemsDTO;
import com.upgrad.course.demo.entity.OrderItemsEntity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class OrderItemsMapper {

    public static OrderItemsDTO convertEntityToDTO(OrderItemsEntity entity) {
        OrderItemsDTO itemsDTO = new OrderItemsDTO();
        itemsDTO.setOrderId(entity.getOrderId());
        itemsDTO.setOrderItemId(entity.getOrderItemId());
        itemsDTO.setProductId(entity.getProductId());
        itemsDTO.setQuantity(entity.getQuantity());
        return itemsDTO;
    }

    public static OrderItemsEntity convertDTOToEntity(OrderItemsDTO itemsDTO) {
        OrderItemsEntity itemsEntity = new OrderItemsEntity();
        itemsEntity.setOrderId(itemsDTO.getOrderId());
        itemsEntity.setProductId(itemsDTO.getProductId());
        itemsEntity.setQuantity(itemsDTO.getQuantity());

        return itemsEntity;
    }

    public static Iterable<OrderItemsEntity> convertOrderDTOToItemsEntity(OrderDTO orderDTO) {
        Iterable<OrderItemsEntity> entityIterable =
            StreamSupport.stream(orderDTO.getOrderItemsDTOList().spliterator(), false)
                .map(orderItemsDTO -> convertDTOToEntity(orderItemsDTO))
                .collect(Collectors.toSet());

        return entityIterable;
    }
}
