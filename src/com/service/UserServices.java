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
	private final static String[] available;
	private final static String[] weeks;
	private final static String[] description;
	private final static String[] price;
	private final static String[] comments;
	
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
		
		
		available=new String[7];
		available[0]="1";
		available[1]="2";
		available[2]="3";
		available[3]="4";
		available[4]="5";
		available[5]="6";
		available[6]="7";
		
		
		weeks=new String[7];
		weeks[0]="1";
		weeks[1]="2";
		weeks[2]="3";
		weeks[3]="4";
		weeks[4]="5";
		weeks[5]="6";
		weeks[6]="7";
		
		description=new String[7];
		description[0]="HDD 500GB 5400RPM Fixed";
		description[1]="RAM 8GB 1600 DDR3L 1DM BRZL";
		description[2]="LCD 14 LED HD SVA AG flat BLK";
		description[3]="ACADPT 65 Watt Smart nPFC";
		description[4]="BATT 4C 41 WHr";
		description[5]="LOC W8.1EM64 STD BRZL";
		description[6]="KBD BLK ISK STD TP BRZL";
		
		price=new String[7];
		price[0]="2,500 USD";
		price[1]="1,500 USD";
		price[2]="2,500 USD";
		price[3]="1,500 USD";
		price[4]="1,500 US";
		price[5]="2,500 USD";
		price[6]="1,500 USD";
		
		comments=new String[7];
		comments[0]="Sample Comment";
		comments[1]="Sample Comment";
		comments[2]="Sample Comment";
		comments[3]="Sample Comment";
		comments[4]="Sample Comment";
		comments[5]="Sample Comment";
		comments[6]="Sample Comment";
		
		
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
    	String com;
    	for(int i=0;i<component.length;i++){
    		System.out.println("length"+component.length+"-------"+i);
    		com=component[i];
    	list.add(new UserSelectedView(i+1,com,getselections(),getavailable(),getdescription(),getweeks()
    			,getprice(),getcomments()));
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
            list.add(new UserSelectedView(i++,getcomponent(),getavailable(),getdescription(),
            		getselections(),getweeks(),getprice(),getcomments()));  
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
	private String getavailable(){
		return available[(int) (Math.random()*7)];
	}
	
	private String getweeks(){
		return weeks[(int) (Math.random()*7)];
	}
	
	private String getdescription(){
		return description[(int) (Math.random()*7)];
	}
	private String getprice(){
		return price[(int) (Math.random()*7)];
	}
	private String getcomments(){
		return comments[(int) (Math.random()*7)];
	}
	
}
