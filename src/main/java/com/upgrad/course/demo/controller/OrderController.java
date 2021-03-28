package com.upgrad.course.demo.controller;

import com.upgrad.course.demo.dto.OrderDTO;
import com.upgrad.course.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/orderApi")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/live")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("Order Api is up and running.");
    }

    /**
     * Place an order
     * @param orderDTO
     * @return
     */
    @PostMapping(value = "/v1/order")
    public ResponseEntity<OrderDTO> placeOrder(
            @RequestBody @Valid OrderDTO orderDTO) {
        OrderDTO dtoResponse = orderService.createNewOrder(orderDTO);
        return ResponseEntity.ok(dtoResponse);
    }

    /**
     * Get order details
     * @param orderId
     * @return
     */
    @GetMapping(value = "/v1/order/{orderId}")
    public ResponseEntity<OrderDTO> getCustomerOrders(@PathVariable int orderId) {
        OrderDTO orderDTO = orderService.getCustomerOrderDetails(orderId);
        return ResponseEntity.ok(orderDTO);
    }
}
