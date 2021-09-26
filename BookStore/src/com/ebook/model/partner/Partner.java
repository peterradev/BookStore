package com.ebook.model.partner;

import java.util.ArrayList;
import java.util.List;

import com.ebook.model.customer.Customer;
import com.ebook.model.item.Product;

public class Partner extends Customer{
	private List<Product> inventory = new ArrayList<Product>();
	private int partnerID;
	
	public List<Product> getInventory(){
		return inventory;
	}
	
	public void setProduct(List<Product> products) {
		this.inventory = products;
	}
	
	public int getPartnerID() {
		return  partnerID;
	}
	
	public void setPartnerID(int partnerID) {
		this.partnerID = partnerID;
	}

}





