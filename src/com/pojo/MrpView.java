package com.pojo;

import java.io.Serializable;

public class MrpView implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String part_family;
	private String part_number;
	private String plan_generation_date;
	private String safety_stock_wos;
	private String on_hand_inventory;
	private String on_hand_orders;
	/*private String net_requirement_plan;*/
	private String w_0;
	private String w_2;
	private String w_3;
	private String w_4;
	private String w_5;
	private String w_6;
	private String w_7;
	private String w_8;
	
	public MrpView(int id,String part_family,String part_number,String plan_generation_date,String safety_stock_wos,
			String on_hand_inventory,String on_hand_orders,String w_0,String w_2,String w_3,String w_4,String w_5,
			String w_6,String w_7,String w_8){
		   
		this.id=id;
		this.part_family=part_family;
		this.part_number=part_number;
		this.setPlan_generation_date(plan_generation_date);
		this.safety_stock_wos=safety_stock_wos;
		this.on_hand_inventory=on_hand_inventory;
		this.on_hand_orders=on_hand_orders;
		/*this.net_requirement_plan=net_requirement_plan;*/
		this.w_0=w_0;
		this.w_2=w_2;
		this.w_3=w_3;
		this.w_4=w_4;
		this.w_5=w_5;
		this.w_6=w_6;
		this.w_7=w_7;
		this.w_8=w_8;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPart_family() {
		return part_family;
	}
	public void setPart_family(String part_family) {
		this.part_family = part_family;
	}
	public String getPart_number() {
		return part_number;
	}
	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}
	
	public String getSafety_stock_wos() {
		return safety_stock_wos;
	}
	public void setSafety_stock_wos(String safety_stock_wos) {
		this.safety_stock_wos = safety_stock_wos;
	}
	public String getOn_hand_orders() {
		return on_hand_orders;
	}
	public void setOn_hand_orders(String on_hand_orders) {
		this.on_hand_orders = on_hand_orders;
	}
	/*public String getNet_requirement_plan() {
		return net_requirement_plan;
	}
	public void setNet_requirement_plan(String net_requirement_plan) {
		this.net_requirement_plan = net_requirement_plan;
	}*/
	public String getW_0() {
		return w_0;
	}
	public void setW_0(String w_0) {
		this.w_0 = w_0;
	}
	public String getW_2() {
		return w_2;
	}
	public void setW_2(String w_2) {
		this.w_2 = w_2;
	}
	
	public String getW_3() {
		return w_3;
	}

	public void setW_3(String w_3) {
		this.w_3 = w_3;
	}

	public String getW_4() {
		return w_4;
	}

	public void setW_4(String w_4) {
		this.w_4 = w_4;
	}

	public String getW_5() {
		return w_5;
	}

	public void setW_5(String w_5) {
		this.w_5 = w_5;
	}

	public String getW_6() {
		return w_6;
	}

	public void setW_6(String w_6) {
		this.w_6 = w_6;
	}

	public String getW_7() {
		return w_7;
	}

	public void setW_7(String w_7) {
		this.w_7 = w_7;
	}

	

	public String getW_8() {
		return w_8;
	}

	public void setW_8(String w_8) {
		this.w_8 = w_8;
	}

	public String getOn_hand_inventory() {
		return on_hand_inventory;
	}

	public void setOn_hand_inventory(String on_hand_inventory) {
		this.on_hand_inventory = on_hand_inventory;
	}

	public String getPlan_generation_date() {
		return plan_generation_date;
	}

	public void setPlan_generation_date(String plan_generation_date) {
		this.plan_generation_date = plan_generation_date;
	}
	
	
	
}
