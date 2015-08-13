package com.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.pojo.NewReportView;
import com.service.NewReportService;

@ManagedBean
@ViewScoped
public class ReportBean {

	private List<NewReportView> reports;
	
	@ManagedProperty(value="#{newReportService}")
    private NewReportService service;

	@PostConstruct
	public void init(){
		System.out.println("init");
		reports=service.crateList(5);
	}
	
	public NewReportService getService() {
		return service;
	}
	public void setService(NewReportService service) {
		this.service = service;
	}
	
	public List<NewReportView> getReports() {
		return reports;
	}
	
}
