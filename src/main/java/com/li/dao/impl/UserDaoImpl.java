package com.li.dao.impl;


import org.springframework.stereotype.Service;

import com.li.dao.IUserDao;
@Service
public class UserDaoImpl implements IUserDao{

	public String get() {
		
		//鍒ゅ畾鏄惁璋冪敤浜� 
        System.out.println("------I am springManager----");  
          
        return "I am getMethod";  
	}

}
