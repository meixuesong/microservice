package com.lenovo.product.controller.response;

/**
 * Created by Xuesong Mei on 28/02/2017.
 */
public class ProductVo {
    private String code;
    private String name;

    public ProductVo(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
