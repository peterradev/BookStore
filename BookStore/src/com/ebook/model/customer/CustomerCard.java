package com.ebook.model.customer;

public class CustomerCard {
	
	private int cardNum;
	private int securityNum;
	private int month;
	private int year;
	private String firstNameOnCard;
	private String lastNameOnCard;
	
	
	
	public CustomerCard() {};
	
	
	public void setCardNum(int cardNum) {
		if (cardNum  == 16) {
			this.cardNum = cardNum;
		}
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void setSecurityNum(int securityNum) {
		if(securityNum == 3) {
			this.securityNum = securityNum;
		}
	}
	
	public int getSecurityNum() {
		return securityNum;
	}
	
	public void setMonth(int month) {
		if(month <= 12) {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setFirstName(String firstName) {
		this.firstNameOnCard = firstName;
	}
	
	public String getFirstName(){
		return firstNameOnCard;
	}
	
	public void setLastName(String lastName) {
		this.lastNameOnCard = lastName;
	}
	
	public String getLatName(){
		return lastNameOnCard;
	}
	
	

}
