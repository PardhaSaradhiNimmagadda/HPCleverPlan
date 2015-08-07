package com.pojo;

import java.io.Serializable;

public class UserSelectedView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String selected_configuration;
	private String avaliable_to_promise;
	private String total_weeks_in_order_completion;
	private String component;
	private String selections;
	private String available;
	private String weeks;
	private String description;
	private String price;
	private String comments;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

	public UserSelectedView(int id, String component, String selections,
			String available,String description,String weeks,String price,String comments) {
		this.id = id;
		this.component = component;
		this.selections = selections;
		this.available = available;
		this.weeks = weeks;
		this.description=description;
		this.price=price;
		this.comments=comments;
	}

	public UserSelectedView(int id, String selected_configuration,
			String avaliable_to_promise, String total_weeks_in_order_completion) {
		this.id = id;
		this.selected_configuration = selected_configuration;
		this.avaliable_to_promise = avaliable_to_promise;
		this.total_weeks_in_order_completion = total_weeks_in_order_completion;
	}

	public String getSelected_configuration() {
		return selected_configuration;
	}

	public void setSelected_configuration(String selected_configuration) {
		this.selected_configuration = selected_configuration;
	}

	public String getAvaliable_to_promise() {
		return avaliable_to_promise;
	}

	public void setAvaliable_to_promise(String avaliable_to_promise) {
		this.avaliable_to_promise = avaliable_to_promise;
	}

	public String getTotal_weeks_in_order_completion() {
		return total_weeks_in_order_completion;
	}

	public void setTotal_weeks_in_order_completion(
			String total_weeks_in_order_completion) {
		this.total_weeks_in_order_completion = total_weeks_in_order_completion;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}
	
	public String getSelections() {
		return selections;
	}

	public void setSelections(String selections) {
		this.selections = selections;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getWeeks() {
		return weeks;
	}

	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	

	

	
	
	

	
	
}
