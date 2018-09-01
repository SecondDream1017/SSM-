package com.atguigu.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.ssm.mapper.UserMapper;
import com.atguigu.ssm.model.User;
import com.atguigu.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userMapper.saveUser(user);
	}

}
