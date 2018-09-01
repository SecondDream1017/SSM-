package com.atguigu.ssm.service;

import java.util.List;

import com.atguigu.ssm.model.Orders;

public interface OrdersService {

	List<Orders> getOrdersByUserId(int userId);

	
}
