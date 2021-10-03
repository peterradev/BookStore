package com.ebook.view;

import com.ebook.model.customer.Customer;
import com.ebook.model.customer.CustomerCard;
import com.ebook.model.item.Product;
import com.ebook.model.partner.Partner;

public class BookStoreTests {

	public static void main(String[] args) {
		
		
		 Customer customer = new Customer();;
		customer.setFirstName("Jon");
	    customer.setLastName("Wheatland");
	    customer.setCustomerId("XY8888");
		
		// Creating a Partner, setting the name, and printing it out
		Partner partner = new Partner();
		partner.setFirstName("John");
		System.out.println(partner.getFirstName());
		
		// Creating a Product
		
		Product p1 = new Product();
		p1.setTitle("Hello");
		Product p2 = new Product();
		p2.setTitle("World");
		
		
		partner.addProduct(p1);
		partner.addProduct(p2);
		
		System.out.println(partner.getInventory());
		
		// Creating a card that is attached to 
		CustomerCard customerCard = new CustomerCard();
		
		

	}

}
