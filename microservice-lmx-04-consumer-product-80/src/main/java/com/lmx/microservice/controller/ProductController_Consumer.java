package com.lmx.microservice.controller;

import com.lmx.microservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProductController_Consumer {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     * 服务名就相当于IP+端口号
     * microservice-product = localhost:8001 = 127.0.0.1:8001
     */
    private static final String REST_URL_PREFIX = "http://microservice-product";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add", product, Boolean.class);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/get/" + id, Product.class);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/list", List.class);
    }

}
