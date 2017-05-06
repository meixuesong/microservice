package com.lenovo.agent;

import com.lenovo.controller.response.ProductVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Xuesong Mei on 01/03/2017.
 */
@Service
@FeignClient(name = "${feign.name}", url = "${feign.url}")
public interface ProductClient {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    ProductVo getAllProducts();
}