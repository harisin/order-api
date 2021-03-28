package com.upgrad.course.demo.mapper;

import com.upgrad.course.demo.dto.OrderDTO;
import com.upgrad.course.demo.dto.OrderItemsDTO;
import com.upgrad.course.demo.entity.CustomerOrderEntity;
import com.upgrad.course.demo.entity.OrderItemsEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CustomerOrderMapper {

    public static CustomerOrderEntity convertDTOToEntity(OrderDTO orderDTO) {
        CustomerOrderEntity customerOrderEntity = new CustomerOrderEntity();
        customerOrderEntity.setCustomerId(orderDTO.getCustomerId());
        customerOrderEntity.setOrderDetails(orderDTO.getOrderDetails());

        return customerOrderEntity;
    }

    public static OrderDTO convertEntityToDTO(
            CustomerOrderEntity orderEntity, Iterable<OrderItemsEntity> itemsEntityIterable) {
        OrderDTO dto = new OrderDTO();
        dto.setOrderId(orderEntity.getOrderId());
        dto.setCustomerId(orderEntity.getCustomerId());
        dto.setOrderDetails(orderEntity.getOrderDetails());

        dto.setOrderItemsDTOList(StreamSupport.stream(itemsEntityIterable.spliterator(), false)
                .map(orderItemsEntity -> OrderItemsMapper.convertEntityToDTO(orderItemsEntity))
                .collect(Collectors.toList()));

        return dto;
    }

}
