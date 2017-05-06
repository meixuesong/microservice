package com.lenovo.product.controller;

import com.lenovo.product.controller.response.ProductVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by Xuesong Mei on 28/02/2017.
 */
@RestController
public class ProductController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ProductVo getAllProducts() {

//        Random r = new Random();
//        int multiplier = r.nextInt(5) * 1000;
//        try {
//            Thread.sleep(multiplier);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return new ProductVo("003", "disk");
    }

}
