package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.service.ItemService;

@ManagedBean
@ViewScoped
public class ItemBean {
	private String item;
	private List<String> items;
	
	@ManagedProperty("#{itemService}")
	private ItemService itemService;
	
	public ItemService getItemService() {
		return itemService;
	}

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	@PostConstruct
	public void init(){
		System.out.println("called");
		items=itemService.createItems();
	}
	
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	} 
	
}
