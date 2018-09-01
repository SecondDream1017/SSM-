package com.atguigu.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.ssm.model.Orders;
import com.atguigu.ssm.service.OrdersService;

@Controller
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
	
	@RequestMapping("/getOrdersByUserId")
	public String getOrdersByUserId(int userId){
		
		List<Orders> ordersList = ordersService.getOrdersByUserId(userId);
		for (Orders orders : ordersList) {
			System.out.println(orders);
		}
		return "success";
	}
}
