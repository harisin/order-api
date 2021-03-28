package com.upgrad.course.demo.service;

import com.upgrad.course.demo.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    /**
     * Create a customer order.
     * @param orderDTO
     * @return
     */
    public OrderDTO createNewOrder(OrderDTO orderDTO);

    /**
     * Get a customer order details.
     * @param orderId
     * @return
     */
    public OrderDTO getCustomerOrderDetails(int orderId);
}
