package com.api.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.register.Entity.User;
import com.api.register.response.Response;

@RestController
@CrossOrigin("*")
public class Controllers {
	@Autowired
    public Response resp;
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		System.out.println("programStart"+user);
		boolean f=resp.adding(user);
		if(f==true) {
			System.out.println(user);
		return user;
		}
		else {return user;}
		
	}

}
