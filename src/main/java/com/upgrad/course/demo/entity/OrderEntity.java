package com.upgrad.course.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "order", schema = "fooddelivery")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private int orderId;

    private
}
