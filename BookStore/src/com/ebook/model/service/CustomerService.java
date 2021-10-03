package com.ebook.model.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.cxf.jaxrs.ext.PATCH;

import com.ebook.dal.CustomerDAO;
import com.ebook.model.customer.Customer;


@Path("/customerservice/")
public class CustomerService {
	
	
	private CustomerDAO custDAO = new CustomerDAO();
	
	@GET
	@Produces({"applicatoin/xlm", "appliction/json"})
	@Path("/customers/{customerID}/")
	public Customer getCustomer(@PathParam("customerID") String id) {
		Customer customer = findCustomerById(id);
		return customer;
	}
	
	//search customer by ID from the DB
	public Customer findCustomerById(String customerId) {
			
		try {
			Customer customer = custDAO.getCustomer(customerId);
	    	return customer;
	    } catch (Exception se) {
	      System.err.println("CustomerService: Threw a Exception retrieving customer.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	
	//Insert a new customer in the DB
	public void addCustomer(Customer customer) {
		
		try {
			custDAO.addCustomer(customer);
	    } catch (Exception se) {
	      System.err.println("CustomerService: Threw a Exception retrieving customer.");
	      System.err.println(se.getMessage());
	    }
	}
	
}
