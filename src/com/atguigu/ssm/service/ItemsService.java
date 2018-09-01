package com.atguigu.ssm.service;

import java.util.List;
import com.atguigu.ssm.model.Items;


public interface ItemsService {

	List<Items> getAllItems();

	Items getItemById(int itemId);

	void updateItem(Items item);

	void deleteById(int id);

	
}
