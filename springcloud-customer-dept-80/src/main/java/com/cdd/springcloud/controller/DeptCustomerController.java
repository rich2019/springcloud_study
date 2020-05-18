package com.cdd.springcloud.controller;

import com.cdd.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptCustomerController {

    @Autowired
    private RestTemplate restTemplate;

    private final String REST_URL_PREFIX = "http://localhost:8001/";

    @RequestMapping("/customer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/queryById/"+id,Dept.class);
    }

    @RequestMapping("/getAll")
    public List<Dept> getAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/queryAll",List.class);
    }

}
