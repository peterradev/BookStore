package com.ebook.model.partner;

import java.util.ArrayList;
import java.util.List;

import com.ebook.model.customer.Customer;
import com.ebook.model.item.Product;

public class Partner extends Customer{
	private List<Product> products = new ArrayList<Product>();
	private int partnerID;
	
	public List<Product> getProducts(){
		return products;
	}
	
	public void setProduct(List<Product> products) {
		this.products = products;
	}
	
	public int getPartnerID() {
		return  partnerID;
	}
	
	public void setPartnerID();

}





