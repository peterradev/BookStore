package com.ebook.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ebook.model.item.Product;


public class ProductDAO{

	public ProductDAO() {}
	
	public Product getProduct(String productID) {
		
		try {
			Statement st = DBHelper.getConnection().createStatement();
			String selectProductQuery = "SELECT id, title, price FROM Product WHERE id = '" + productID + "'";
			
			ResultSet productRS = st.executeQuery(selectProductQuery);
			System.out.println("ItemSearch: *********** Query "+ selectProductQuery);
			
			Product product = new Product();
			while(productRS.next()) {
				product.setId(productRS.getString("id"));
				product.setTitle(productRS.getString("title"));
				product.setPrice(productRS.getDouble("price"));
			}
			
			productRS.close();
			
			return product;
			
		}
		catch(SQLException se) {
			System.err.println("ItemSearch: Threw a SQLException retrieving the product object.");
		    System.err.println(se.getMessage());
		    se.printStackTrace();
		}
		
		return null;
	}
	
	public void addItem(Product product) {
		Connection con = DBHelper.getConnection();
        PreparedStatement itemPst = null;
        
        try {
        	String itemStm =  "INSERT INTO Product(id, title, price) VALUES(?, ?, ?)";
        	itemPst = con.prepareStatement(itemStm);
        	itemPst.setString(1, product.getId());
        	itemPst.setString(2, product.getTitle());
        	itemPst.setDouble(3, product.getPrice());
        	itemPst.executeUpdate();
        } catch(SQLException ex) {
        	
        } finally {
        	try {
        		 if (con != null) {
                     con.close();
                 }
        	} catch(SQLException ex) {
        		System.err.println("ItemSearch: Threw a SQLException saving the product object.");
        		System.err.println(ex.getMessage());
        	}
        }
	}
	
	
}
