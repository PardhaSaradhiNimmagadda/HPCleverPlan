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
	private String availabel;
	private String weeks;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

	public UserSelectedView(int id, String component, String selections,
			String availabel, String weeks) {
		this.id = id;
		this.component = component;
		this.selections = selections;
		this.availabel = availabel;
		this.weeks = weeks;
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

	public String getAvailabel() {
		return availabel;
	}

	public void setAvailabel(String availabel) {
		this.availabel = availabel;
	}

	public String getWeeks() {
		return weeks;
	}

	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}

	

	

	
	
	

	
	
}
