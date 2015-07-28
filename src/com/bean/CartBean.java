package com.bean;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import com.pojo.ContextMenuView;
import com.service.CartService;
@ManagedBean
@ViewScoped
public class CartBean  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ContextMenuView> carts;
    private ContextMenuView selectedCart;
    private List<ContextMenuView> selectedCarts;
    @ManagedProperty(value="#{cartService}")
    private static CartService service;
    
    
    @PostConstruct
    public void init(){
    	System.out.println("...................");
    	setCarts(service.createCarts(3));
    	
    }


	public List<ContextMenuView> getCarts() {
		return carts;
	}


	public void setCarts(List<ContextMenuView> carts) {
		this.carts = carts;
	}


	public ContextMenuView getSelectedCart() {
		return selectedCart;
	}


	public void setSelectedCart(ContextMenuView selectedCart) {
		this.selectedCart = selectedCart;
	}

	public CartService getService() {
		return service;
	}

	public void setService(CartService service) {
		this.service = service;
	}
	public List<ContextMenuView> getSelectedCarts() {
		return selectedCarts;
	}


	public void setSelectedCarts(List<ContextMenuView> selectedCarts) {
		this.selectedCarts = selectedCarts;
	}
    
}
