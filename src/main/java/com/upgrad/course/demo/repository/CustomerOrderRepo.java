package com.upgrad.course.demo.repository;

import com.upgrad.course.demo.entity.CustomerOrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerOrderRepo extends CrudRepository<CustomerOrderEntity, Integer> {
    List<CustomerOrderEntity> findByOrderId(int orderId);
}
