package com.atguigu.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.ssm.model.User;
import com.atguigu.ssm.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("saveUser")
	public ModelAndView saveUser(@RequestBody User user){
		
		System.out.println(user);
		System.out.println("======");
		//userService.saveUser(user);
		return null;
		
	}
	
}
