package com.dudu.demo.controller;

import com.dudu.demo.common.constant.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /*@Value("${com.dudu.demo.name}")
    private String name;

    @Value("${com.dudu.demo.want}")
    private String want;*/

    @Autowired
    public ConfigBean configBean;


    @RequestMapping("/")
    public String index(){
        return configBean.getYearHope()+configBean.getUuid();
    }
}
