package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class ContextMenuView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
private String product_family;
private String quantity_added;
private String  cart_add_date_and_time;
private String confirm_order_to_supply_chain;
private String cancel;

public ContextMenuView(int id,String product_family,String quantity_added,String  cart_add_date_and_time,
		String confirm_order_to_supply_chain,String cancel){
	this.id=id;
	this.product_family=product_family;
	this.quantity_added=quantity_added;
	this.cart_add_date_and_time=cart_add_date_and_time;
	this.confirm_order_to_supply_chain=confirm_order_to_supply_chain;
	this.cancel=cancel;
}

public String getProduct_family() {
	return product_family;
}
public void setProduct_family(String product_family) {
	this.product_family = product_family;
}
public String getQuantity_added() {
	return quantity_added;
}
public void setQuantity_added(String quantity_added) {
	this.quantity_added = quantity_added;
}
public String getCart_add_date_and_time() {
	return cart_add_date_and_time;
}
public void setCart_add_date_and_time(String cart_add_date_and_time) {
	this.cart_add_date_and_time = cart_add_date_and_time;
}
public String getConfirm_order_to_supply_chain() {
	return confirm_order_to_supply_chain;
}
public void setConfirm_order_to_supply_chain(
		String confirm_order_to_supply_chain) {
	this.confirm_order_to_supply_chain = confirm_order_to_supply_chain;
}
public String getCancel() {
	return cancel;
}
public void setCancel(String cancel) {
	this.cancel = cancel;
}




}
