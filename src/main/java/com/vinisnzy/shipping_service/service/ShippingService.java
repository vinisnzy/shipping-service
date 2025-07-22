package com.vinisnzy.shipping_service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    @KafkaListener(topics = "payments.success", groupId = "shipping-service-group")
    public void processShipping(String orderId) {
        System.out.println("Processing shipping for order ID: " + orderId);
    }
}
