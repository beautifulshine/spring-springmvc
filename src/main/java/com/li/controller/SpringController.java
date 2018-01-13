package com.li.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.li.dao.IUser;

@Controller
public class SpringController {
	//这样代替了再xml中配置属性的过程  
    @Resource(name="userManager")  
    private IUser springManager;//注入springManager  
      
      
    @RequestMapping("/spring/get")  
    public String get(){  
        System.out.println(springManager.get());  
        return "/success";  
    }  
}
