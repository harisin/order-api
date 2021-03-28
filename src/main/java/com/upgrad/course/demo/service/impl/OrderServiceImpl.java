package com.upgrad.course.demo.service.impl;

import com.upgrad.course.demo.dto.OrderDTO;
import com.upgrad.course.demo.entity.CustomerOrderEntity;
import com.upgrad.course.demo.entity.OrderItemsEntity;
import com.upgrad.course.demo.exception.RecordNotFoundException;
import com.upgrad.course.demo.mapper.CustomerOrderMapper;
import com.upgrad.course.demo.mapper.OrderItemsMapper;
import com.upgrad.course.demo.repository.CustomerOrderRepo;
import com.upgrad.course.demo.repository.OrderItemsRepo;
import com.upgrad.course.demo.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private static Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private CustomerOrderRepo orderRepo;

    @Autowired
    private OrderItemsRepo itemsRepo;

    @Override
    @Transactional
    public OrderDTO createNewOrder(OrderDTO orderDTO) {
        Iterable<OrderItemsEntity> orderDTOIterable = null;
        CustomerOrderEntity orderEntity = CustomerOrderMapper.convertDTOToEntity(orderDTO);
        orderEntity = orderRepo.save(orderEntity);
        LOGGER.info(orderEntity.toString());
        if(orderEntity.getOrderId() != 0) {
            orderDTO.setOrderId(orderEntity.getOrderId());
            orderDTOIterable = saveItems(orderDTO);
        }
        return CustomerOrderMapper.convertEntityToDTO(orderEntity, orderDTOIterable);
    }

    @Override
    public OrderDTO getCustomerOrderDetails(int orderId) {
        CustomerOrderEntity orderEntity = orderRepo.findById(orderId)
                .orElseThrow(() -> new RecordNotFoundException("Order details not found for order["+orderId+"]"));
        Iterable<OrderItemsEntity> orderItemsEntity = itemsRepo.findByOrderId(orderId);

        return CustomerOrderMapper.convertEntityToDTO(orderEntity, orderItemsEntity);
    }

    private Iterable<OrderItemsEntity> saveItems(OrderDTO orderDTO) {
        return itemsRepo.saveAll(OrderItemsMapper.convertOrderDTOToItemsEntity(orderDTO));
    }
}
