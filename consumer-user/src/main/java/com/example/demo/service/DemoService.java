package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {
    @Autowired
    RestTemplate restTemplate;
    public String hello(String name){
//        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://provider-ticker/hello/" + name, String.class);
        String forObject = restTemplate.getForObject("http://provider-ticker/hello/" + name, String.class);
        return  forObject;
    }
}
