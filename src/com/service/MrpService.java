package com.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.pojo.MrpView;

@ManagedBean
@ApplicationScoped
public class MrpService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String[] part_family;
	private final static String[] part_number;
	private final static String[] plan_generation_date;
	private final static String[] safety_stock_wos;
	private final static String[] on_hand_inventory;
	private final static String[] on_hand_orders;
	private final static String[] w_0;
	private final static String[] w_2;
	private final static String[] w_3;
	private final static String[] w_4;
	private final static String[] w_5;
	private final static String[] w_6;
	private final static String[] w_7;
	private final static String[] w_8;
	
	
	static{
		part_family=new String[6];
		part_family[0]="XXX";
		part_family[1]="XXX";
		part_family[2]="XXX";
		part_family[3]="XXX";
		part_family[4]="XXX";
		part_family[5]="XXX";
		
		part_number=new String[6];
		part_number[0]="1";
		part_number[1]="2";
		part_number[2]="3";
		part_number[3]="4";
		part_number[4]="5";
		part_number[5]="6";
		
		plan_generation_date=new String[6];
		plan_generation_date[0]="XX-XX-XXXX";
		plan_generation_date[1]="XX-XX-XXXX";
		plan_generation_date[2]="XX-XX-XXXX";
		plan_generation_date[3]="XX-XX-XXXX";
		plan_generation_date[4]="XX-XX-XXXX";
		plan_generation_date[5]="XX-XX-XXXX";
		
		safety_stock_wos=new String[6];
		safety_stock_wos[0]="material";
		safety_stock_wos[1]="material";
		safety_stock_wos[2]="material";
		safety_stock_wos[3]="material";
		safety_stock_wos[4]="material";
		safety_stock_wos[5]="material";
		
		on_hand_orders=new String[6];
		on_hand_orders[0]="2";
		on_hand_orders[1]="8";
		on_hand_orders[2]="3";
		on_hand_orders[3]="5";
		on_hand_orders[4]="7";
		on_hand_orders[5]="6";

		w_0=new String[6];
		w_0[0]="1";
		w_0[1]="2";
		w_0[2]="3";
		w_0[3]="3";
		w_0[4]="4";
		w_0[5]="5";
		
		w_2=new String[6];
		w_2[0]="2";
		w_2[1]="9";
		w_2[2]="8";
		w_2[3]="6";
		w_2[4]="5";
		w_2[5]="1";
		
		w_3=new String[6];
		w_3[0]="10";
		w_3[1]="9";
		w_3[2]="8";
		w_3[3]="7";
		w_3[4]="5";
		w_3[5]="3";
		
		w_4=new String[6];
		w_4[0]="7";
		w_4[1]="10";
		w_4[2]="11";
		w_4[3]="5";
		w_4[4]="4";
		w_4[5]="3";
		
		w_5=new String[6];
		w_5[0]="7";
		w_5[1]="10";
		w_5[2]="11";
		w_5[3]="5";
		w_5[4]="4";
		w_5[5]="3";
		
		w_6=new String[6];
		w_6[0]="7";
		w_6[1]="10";
		w_6[2]="11";
		w_6[3]="5";
		w_6[4]="4";
		w_6[5]="3";
		
		w_7=new String[6];
		w_7[0]="7";
		w_7[1]="10";
		w_7[2]="11";
		w_7[3]="5";
		w_7[4]="4";
		w_7[5]="3";
		
		w_8=new String[6];
		w_8[0]="7";
		w_8[1]="10";
		w_8[2]="11";
		w_8[3]="5";
		w_8[4]="4";
		w_8[5]="3";
		
		on_hand_inventory=new String[6];
		on_hand_inventory[0]="inventory";
		on_hand_inventory[1]="inventory";
		on_hand_inventory[2]="inventory";
		on_hand_inventory[3]="inventory";
		on_hand_inventory[4]="inventory";
		on_hand_inventory[5]="inventory";
	}
	
	private List<MrpView> Views;
	private MrpView SelectedViews;
	
	public List<MrpView> selectedConfiguration(int size){
    	List<MrpView> list=new ArrayList<MrpView>();
    	for(int i=0;i<size;i++){
    	list.add(new MrpView(i++,getpart_family(),getpart_number(),getplan_generation_date(),
    			getsafety_stock_wos(),geton_hand_inventory(),geton_hand_orders(),getw_0(),getw_2(),getw_3(),getw_4(),
    			getw_5(),getw_6(),getw_7(),getw_8()));
    	}
    	return list;
    }
	public MrpService() {  
		Views = new ArrayList<MrpView>();  
          
        populateRandomViews(Views, 5);  
    }
	public List<MrpView> getViews() {
		return Views;
	}
	public void setViews(List<MrpView> views) {
		Views = views;
	}
	public MrpView getSelectedViews() {
		return SelectedViews;
	}
	public void setSelectedViews(MrpView selectedViews) {
		SelectedViews = selectedViews;
	} 
	private void populateRandomViews(List<MrpView> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new MrpView(i++,getpart_family(),getpart_number(),getplan_generation_date(),
            		getsafety_stock_wos(),geton_hand_inventory(),geton_hand_orders(),getw_0(),getw_2(),getw_3(),getw_4(),getw_5()
            		,getw_6(),getw_7(),getw_8()));  
    } 
	private String getpart_family(){
		 return part_family[(int) (Math.random() * 5)];
	}
	private String getpart_number(){
		 return part_number[(int) (Math.random() * 5)];
	}
	private String getplan_generation_date(){
		 return plan_generation_date[(int) (Math.random() * 5)];
	}
	private String getsafety_stock_wos(){
		 return safety_stock_wos[(int) (Math.random() * 5)];
	}
	private String geton_hand_orders(){
		 return on_hand_orders[(int) (Math.random() * 5)];
	}
	private String getw_0(){
		 return w_0[(int) (Math.random() * 5)];
	}

	private String getw_2(){
		 return w_2[(int) (Math.random() * 5)];
	}
	private String getw_3(){
		 return w_3[(int) (Math.random() * 5)];
	}
	private String getw_4(){
		 return w_4[(int) (Math.random() * 5)];
	}
	private String getw_5(){
		 return w_5[(int) (Math.random() * 5)];
	}
	private String getw_6(){
		 return w_6[(int) (Math.random() * 5)];
	}
	private String getw_7(){
		 return w_7[(int) (Math.random() * 5)];
	}
	private String getw_8(){
		 return w_8[(int) (Math.random() * 5)];
	}
	private String geton_hand_inventory(){
		 return on_hand_inventory[(int) (Math.random() * 5)];
	}
}
