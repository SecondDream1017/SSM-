package com.atguigu.ssm.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.atguigu.ssm.mapper.OrdersMapper;
import com.atguigu.ssm.model.Orders;

public class myBatisTest {

	@Test
	public void getAllOrders() throws IOException{
		// 核心配置文件
        String resource = "SqlMapConfig.xml";
        // 通过流将核心配置文件加载进来
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 通过配置文件创建会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // 通过会话工厂获取会话
        SqlSession openSession = factory.openSession();
        OrdersMapper mapper = openSession.getMapper(OrdersMapper.class);
        List<Orders> ordersByUserId = mapper.getOrdersByUserId(1);
        for (Orders orders : ordersByUserId) {
			System.out.println(orders);
		}
        // 关闭会话
        openSession.close();
	}
	
}
