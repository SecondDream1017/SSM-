package com.atguigu.ssm.mapper;

import java.util.List;

import com.atguigu.ssm.model.Orders;

public interface OrdersMapper {

	List<Orders> getOrdersByUserId(int userId);

}
