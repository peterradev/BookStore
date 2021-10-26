package com.ebook.model.item;

import com.ebook.dal.ProductDAO;

public class ProductManager {
	
	
	private ProductDAO itemSearch = new ProductDAO();
	
	public Product getProduct(String productID) {
		Product product = findProductByID(productID);
		return product;
	}
	
	
	public Product findProductByID(String productID) {
		
		try {
			Product product = itemSearch.getProduct(productID);
			return product;
		} catch (Exception se) {
			System.err.println("ProductManager: Threw an Exception retrieving product.");
			System.err.print(se.getMessage());
		}
		
		return null;
		
	}
	
	
	

}
