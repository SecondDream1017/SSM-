package com.atguigu.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.ssm.mapper.ItemsMapper;
import com.atguigu.ssm.model.Items;
import com.atguigu.ssm.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsMapper itemsMapper;
	
	@Override
	public List<Items> getAllItems() {
		List<Items> itemsList = itemsMapper.getAllItems();
		
		return itemsList;
	}

	@Override
	public Items getItemById(int itemId) {
		// TODO Auto-generated method stub
		Items item = itemsMapper.getItemById(itemId);
		return item;
	}

	@Override
	public void updateItem(Items item) {
		// TODO Auto-generated method stub
		itemsMapper.updateItem(item);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		itemsMapper.deleteById(id);
	}

}
