package com.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.pojo.MrpView;

import com.service.MrpService;

@ManagedBean
@ViewScoped
public class MrpBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<MrpView> views;
    private MrpView selectedViews;
    private List<MrpView> selectedView;
    @ManagedProperty(value="#{mrpService}")
    private static MrpService service;
    
    
    @PostConstruct
    public void init(){
    	System.out.println("...................");
    	views = service.selectedConfiguration(10);
    	
    }


	public List<MrpView> getViews() {
		return views;
	}


	public void setViews(List<MrpView> views) {
		this.views = views;
	}


	public MrpView getSelectedViews() {
		return selectedViews;
	}


	public void setSelectedViews(MrpView selectedViews) {
		this.selectedViews = selectedViews;
	}

	public void setService(MrpService service) {
		this.service = service;
	}
	public List<MrpView> getSelectedView() {
		return selectedView;
	}


	public void setSelectedView(List<MrpView> selectedView) {
		this.selectedView = selectedView;
	}
}
