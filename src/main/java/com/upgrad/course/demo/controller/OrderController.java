package com.upgrad.course.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orderApi")
public class OrderController {

    @GetMapping(value = "/live")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("Order Api is up and running.");
    }


}
