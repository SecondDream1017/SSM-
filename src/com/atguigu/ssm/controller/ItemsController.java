package com.atguigu.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.ssm.model.Items;
import com.atguigu.ssm.service.ItemsService;

@Controller
@RequestMapping("items")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;
	
	//得到所有的商品
	@RequestMapping("getAllItems")
	public String getAllItems(Model model){
		List<Items> itemsList = itemsService.getAllItems();
		model.addAttribute("itemsList", itemsList);
		return "itemsList";
	}
	
	//调到编辑页面
	@RequestMapping("editItem")
	public String editItem(Model model,@RequestParam("id") int itemId){
		//根据itemId得到商品
		Items item = itemsService.getItemById(itemId);
		model.addAttribute("item", item);
		return "editItem";
	}
	
	@RequestMapping("saveOrUpdate")
	public String saveOrUpdate(Items item){
		itemsService.updateItem(item);
		System.out.println("-------");
		return "redirect:/items/getAllItems.do";
		
	}
	
	@RequestMapping("deleteById")
	public String deleteById(int id){
		itemsService.deleteById(id);
		return "redirect:/items/getAllItems.do";
	}
	
	@RequestMapping("deleteByIds")
	public String deleteByIds(int[] id){
		for (int i : id) {
			itemsService.deleteById(i);
		}
		return "redirect:/items/getAllItems.do";
	}
}














