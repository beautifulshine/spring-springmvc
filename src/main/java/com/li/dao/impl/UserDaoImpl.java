package com.li.dao.impl;


import com.li.dao.IUserDao;

public class UserDaoImpl implements IUserDao{

	public String get() {
		
		//鍒ゅ畾鏄惁璋冪敤浜� 
        System.out.println("------I am springManager----");  
          
        return "I am getMethod";  
	}

}
