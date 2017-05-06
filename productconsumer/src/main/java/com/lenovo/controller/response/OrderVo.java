package com.lenovo.controller.response;

import org.apache.commons.math.stat.descriptive.summary.Product;

import java.util.List;

/**
 * Created by Xuesong Mei on 28/02/2017.
 */
public class OrderVo {
    private String orderNo;
    private List<ProductVo> products;

    public OrderVo(String orderNo, List<ProductVo> products) {
        this.orderNo = orderNo;
        this.products = products;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public List<ProductVo> getProducts() {
        return products;
    }
}
