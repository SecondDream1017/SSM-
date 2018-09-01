package com.atguigu.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.ssm.mapper.OrdersMapper;
import com.atguigu.ssm.model.Orders;
import com.atguigu.ssm.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Resource
	private OrdersMapper ordersMapper;
	
	@Override
	public List<Orders> getOrdersByUserId(int userId) {
		// TODO Auto-generated method stub
		List<Orders> ordersList = ordersMapper.getOrdersByUserId(userId);
		return ordersList;
	}

}
