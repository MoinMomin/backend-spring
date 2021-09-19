package com.api.register.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.register.Entity.User;
@Component
public class Response {
	@Autowired
	public User user;
	private boolean flag=false;
	private List list=new ArrayList();

	 public boolean adding( User user){
		 list.add(user);
		 flag=true;
		 System.out.print("in th e adding");
		 return flag;
	 }
	 
}
