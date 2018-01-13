package com.li.dao.impl;

import com.li.dao.IUser;

public class User implements IUser{

	public String get() {
		
		//判定是否调用了  
        System.out.println("------I am springManager----");  
          
        return "I am getMethod";  
	}

}
