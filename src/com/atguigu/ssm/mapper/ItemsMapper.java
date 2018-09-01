package com.atguigu.ssm.mapper;

import java.util.List;

import com.atguigu.ssm.model.Items;


public interface ItemsMapper {

	List<Items> getAllItems();

	Items getItemById(int itemId);

	void updateItem(Items item);

	void deleteById(int id);


}
