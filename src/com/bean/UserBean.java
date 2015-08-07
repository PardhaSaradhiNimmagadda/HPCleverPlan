package com.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;


import com.pojo.UserSelectedView;

import com.service.UserServices;

@ManagedBean
@ViewScoped
public class UserBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<UserSelectedView> views;
    private UserSelectedView selectedView;
    private List<UserSelectedView> selectedViews;
    private List<UserSelectedView> views1;
    private UserSelectedView selectedView1;
    private List<UserSelectedView> selectedViews1;
    @ManagedProperty(value="#{userServices}")
    private static UserServices service;
    
    
    @PostConstruct
    public void init(){
    	System.out.println("...................");
    	views = service.selectedConfiguration(1);
    	views1=service.configurationDetails(18);
    	
    	
    	
    }


	public List<UserSelectedView> getViews() {
		return views;
	}


	public void setViews(List<UserSelectedView> views) {
		this.views = views;
	}


	public UserSelectedView getSelectedView() {
		return selectedView;
	}


	public void setSelectedView(UserSelectedView selectedView) {
		this.selectedView = selectedView;
	}
	
	public UserServices getService() {
		return service;
	}

	public void setService(UserServices service) {
		this.service = service;
	}

	public List<UserSelectedView> getSelectedViews() {
		return selectedViews;
	}


	public void setSelectedViews(List<UserSelectedView> selectedViews) {
		this.selectedViews = selectedViews;
	}


	public List<UserSelectedView> getViews1() {
		return views1;
	}


	public void setViews1(List<UserSelectedView> views1) {
		this.views1 = views1;
	}


	public UserSelectedView getSelectedView1() {
		return selectedView1;
	}


	public void setSelectedView1(UserSelectedView selectedView1) {
		this.selectedView1 = selectedView1;
	}


	public List<UserSelectedView> getSelectedViews1() {
		return selectedViews1;
	}


	public void setSelectedViews1(List<UserSelectedView> selectedViews1) {
		this.selectedViews1 = selectedViews1;
	}

}
