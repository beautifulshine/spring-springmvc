package com.li.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class SpringController {
 @Autowired
 private com.li.dao.impl.UserDaoImpl UserDaoImpl ;
	
    @RequestMapping("/spring/get")  
    public String get(){
        System.out.println(UserDaoImpl.get());  
        return "success";  
    }  
    
    @RequestMapping("/user")  
    public String get2(){
        
        return "success";  
    }  
}
