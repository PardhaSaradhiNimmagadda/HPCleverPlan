package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ItemService {
	private List<String> items;
	private static String[] item;
	static
	{
		item=new String[6];
		item[0]="HDD";
		item[1]="SSD";
		item[2]="Memory";
		item[3]="Processor";
		item[4]="Ac Adaptor";
		item[5]="Battery";
		
	}
	public List<String> createItems(){
		items=new ArrayList<String>();
		for(int i=0;i<item.length;i++){
			items.add(item[i]);
		}
		return items;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	} 
	
}
