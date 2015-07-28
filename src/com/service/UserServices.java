package com.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


import com.pojo.UserSelectedView;
@ManagedBean
@ApplicationScoped
public class UserServices implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String[] selected_configuration;
	private final static String[] avaliable_to_promise;
	private final static String[] total_weeks_in_order_completion;
	private final static String[] component;
	private final static String[] selections;
	private final static String[] availabel;
	private final static String[] weeks;
	
	static{
		selected_configuration=new String[1];
		selected_configuration[0]="XYZ";
		
		avaliable_to_promise=new String[1];
		avaliable_to_promise[0]="XXX";
		
		total_weeks_in_order_completion=new String[1];
		total_weeks_in_order_completion[0]="YY";
		
		component=new String[11];
		component[0]="HDD";
		component[1]="Memory";
		component[2]="Processor";
		component[3]="SSD";
		component[4]="Battery";
		component[5]="AC Adaptor";
		component[6]="Keyboard";
		component[7]="Graphic Card";
		component[8]="Panel";
		component[9]="Operating System";
		component[10]="Miscellaneous";
		
		
		selections=new String[7];
		selections[0]="SELECTED CONFIG";
		selections[1]="SELECTED CONFIG";
		selections[2]="SELECTED CONFIG";
		selections[3]="SELECTED CONFIG";
		selections[4]="SELECTED CONFIG";
		selections[5]="SELECTED CONFIG";
		selections[6]="SELECTED CONFIG";
		
		
		availabel=new String[7];
		availabel[0]="#AVBL";
		availabel[1]="#AVBL";
		availabel[2]="#AVBL";
		availabel[3]="#AVBL";
		availabel[4]="#AVBL";
		availabel[5]="#AVBL";
		availabel[6]="#AVBL";
		
		
		weeks=new String[7];
		weeks[0]="#WEEKS";
		weeks[1]="#WEEKS";
		weeks[2]="#WEEKS";
		weeks[3]="#WEEKS";
		weeks[4]="#WEEKS";
		weeks[5]="#WEEKS";
		weeks[6]="#WEEKS";
}
	private List<UserSelectedView> Views;
	private UserSelectedView SelectedViews;
	
	public List<UserSelectedView> selectedConfiguration(int size){
    	List<UserSelectedView> list=new ArrayList<UserSelectedView>();
    	for(int i=0;i<size;i++){
    	list.add(new UserSelectedView(i++,getselected_configuration(),getavaliable_to_promise(),
    			gettotal_weeks_in_order_completion()));
    	}
    	return list;
    }
	
	public List<UserSelectedView> configurationDetails(int size){
    	List<UserSelectedView> list=new ArrayList<UserSelectedView>();
    	for(int i=0;i<size;i++){
    	list.add(new UserSelectedView(i++,getcomponent(),getselections(),getavailabel(),getweeks()));
    	}
    	System.out.println(list.size());
    	return list;
    }
	
	public UserServices() {  
		Views = new ArrayList<UserSelectedView>();  
          
        populateRandomConfigurationDetails(Views, 13);  
        populateRandomSelectedConfiguration(Views, 1);
	}  
	
	
	public List<UserSelectedView> getViews() {
		return Views;
	}
	public void setViews(List<UserSelectedView> views) {
		Views = views;
	}
	public UserSelectedView getSelectedViews() {
		return SelectedViews;
	}
	public void setSelectedViews(UserSelectedView selectedViews) {
		SelectedViews = selectedViews;
	}
	
	private void populateRandomConfigurationDetails(List<UserSelectedView> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new UserSelectedView(i++,getcomponent(),getavailabel(),
            		getselections(),getweeks()));  
    } 
	private void populateRandomSelectedConfiguration(List<UserSelectedView> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new UserSelectedView(i++,getselected_configuration(),getavaliable_to_promise(),
            		gettotal_weeks_in_order_completion()));  
    } 
	private String getselected_configuration(){
		 return selected_configuration[(int) (Math.random() * 1)];
		 
	}
	
	private String getavaliable_to_promise(){
		 return avaliable_to_promise[(int) (Math.random() * 1)];
		 
	}
	private String gettotal_weeks_in_order_completion(){
		return total_weeks_in_order_completion[(int) (Math.random()*1)];
		
	}
	private String getcomponent(){
		return component[(int) (Math.random()*7)];
	}
	
	private String getselections(){
		return selections[(int) (Math.random()*7)];
	}
	private String getavailabel(){
		return availabel[(int) (Math.random()*7)];
	}
	
	private String getweeks(){
		return weeks[(int) (Math.random()*7)];
	}
	
	
}
