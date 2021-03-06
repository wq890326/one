package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
   private DemoService demoService;
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name){
       return demoService.hello(name);
    }
}
