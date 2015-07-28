package com.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.pojo.ContextMenuView;


@ManagedBean
@ApplicationScoped
public class CartService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String[] product_family;
	private final static String[] quantity_added;
	private final static String[] cart_add_date_and_time;
	private final static String[] confirm_order_to_supply_chain;
	private final static String[] cancel;
	
	static {
		product_family=new String[2]; 
		product_family[0]="XXX";
		product_family[1]="YYYY";
		
		quantity_added=new String[2];
		quantity_added[0]="###";
		quantity_added[1]="###";
		
		cart_add_date_and_time=new String[2];
		cart_add_date_and_time[0]="xx-xx-xxx xx:xx";
		cart_add_date_and_time[1]="xx-xx-xxx xx:xx";
		
		confirm_order_to_supply_chain=new String[2];
		confirm_order_to_supply_chain[0]="Confirm";
		confirm_order_to_supply_chain[1]="Confirm";
		
		cancel=new String[2];
		cancel[0]="Cancel";
		cancel[1]="Cancel";
		
	}
	
	private List<ContextMenuView> Carts;  
    
    private ContextMenuView selectedCart;  
//    private ContextMenuView[] selectedCarts;
    
    public List<ContextMenuView> createCarts(int size){
    	List<ContextMenuView> list=new ArrayList<ContextMenuView>();
    	for(int i=0;i<size;i++){
    	list.add(new ContextMenuView(i++,getproduct_family(),getquantity_added(),
    	getcart_add_date_and_time(),getconfirm_order_to_supply_chain(),getcancel()));
    	}
    	return list;
    }
    public CartService() {  
    	Carts = new ArrayList<ContextMenuView>();  
          
        populateRandomCarts(Carts, 5);  
    }  
    
    
	public List<ContextMenuView> getCarts() {
		return Carts;
	}
	public void setCarts(List<ContextMenuView> carts) {
		Carts = carts;
	}
	public ContextMenuView getSelectedCart() {
		return selectedCart;
	}
	public void setSelectedCart(ContextMenuView selectedCart) {
		this.selectedCart = selectedCart;
	}
	/*public ContextMenuView[] getSelectedCarts() {
	return selectedCarts;
	}
	public void setSelectedCarts(ContextMenuView[] selectedCarts) {
		this.selectedCarts = selectedCarts;
	}
    */
	private void populateRandomCarts(List<ContextMenuView> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new ContextMenuView(i++,getproduct_family(),getquantity_added(),
            		getcart_add_date_and_time(),getconfirm_order_to_supply_chain(),getcancel()));  
    } 
	private String getproduct_family(){
		 return product_family[(int) (Math.random() * 2)];
	}
	private String getquantity_added(){
		 return quantity_added[(int) (Math.random() * 2)];
	}
	private String getcart_add_date_and_time(){
		 return cart_add_date_and_time[(int) (Math.random() * 2)];
	}
	private String getconfirm_order_to_supply_chain(){
		 return confirm_order_to_supply_chain[(int) (Math.random() * 2)];
	}
	private String getcancel(){
		 return cancel[(int) (Math.random() * 2)];
	}
	
	
}
