package com.example.demo.service;

import org.springframework.stereotype.Service;
/*
  无状态的类，数据从数据库中传递过来
  终于尝试一次成功了。
 */
@Service
public class DemoService {
    public String hello(String name){
        System.out.println("8002");
         return name+"世界那么大，我真的想去看看！+8002" ;
    }
}
