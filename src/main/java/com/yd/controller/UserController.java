package com.yd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yd.entity.User;
import com.yd.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private   UserService  userService;
	
	@ResponseBody
	@RequestMapping("getUserById/{id}")
	public  User   getUserById(@PathVariable Integer  id){
		return  userService.findUserById(id);
	}
	
}
