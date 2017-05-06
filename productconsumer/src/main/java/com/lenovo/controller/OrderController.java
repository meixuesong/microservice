package com.lenovo.controller;

import com.lenovo.agent.ProductClient;
import com.lenovo.controller.response.OrderVo;
import com.lenovo.controller.response.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by Xuesong Mei on 28/02/2017.
 */
@RestController
public class OrderController {
    @Autowired
    private ProductClient client;

    @RequestMapping("/")
    public OrderVo getOrders() {
        ProductVo product = client.getAllProducts();

        OrderVo order = new OrderVo("order-0001", Arrays.asList(product));

        return order;
    }
}
