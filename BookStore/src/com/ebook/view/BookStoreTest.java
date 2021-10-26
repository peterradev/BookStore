package com.ebook.view;

import com.ebook.model.customer.Customer;
import com.ebook.model.customer.CustomerCard;
import com.ebook.model.partner.Partner;

public class BookStoreTest {

	public static void main(String[] args) {
	
				System.out.println("Hello");
				
				Partner p1 = new Partner();
				p1.setPartnerID("XY111");
				p1.setFirstName("John");
				p1.setLastName("Doe");
				
				System.out.println(p1);
				
				CustomerCard card = new CustomerCard();
				
				Customer cust = new Customer();
				cust.setFirstName("Jane");
				cust.setLastName("Doe");
				
				card.setFirstName(cust.getFirstName());
				card.setLastName(cust.getLastName());
				card.setCardNum("4833985477794465");
				card.setMonth(7);
				card.setYear(27);
				card.setSecurityNum(649);
				card.setZipCode(60596);
				
				System.out.println(card);
				
				cust.addCard(card);
				System.out.println(cust.getCard().getCardNum());
				
	}

}
