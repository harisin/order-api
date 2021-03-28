package com.upgrad.course.demo.repository;

import com.upgrad.course.demo.entity.OrderItemsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemsRepo extends CrudRepository<OrderItemsEntity, Integer> {

    Iterable<OrderItemsEntity> findByOrderId(int orderId);
}
