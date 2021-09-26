package com.ebook.dal;


import com.ebook.model.item.Book;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ItemSearch {
	
	public ItemSearch() {}
	
	public Book getBook(String isbn) {
		try {
			Statement st = DBHelper.getConnection().createStatement();
			String selectBookQuery = "SELECT isbn, author FROM Book WHERE isbn = '" + isbn + "'";
			
			ResultSet bookRS = st.executeQuery(selectBookQuery);
			System.out.println("Book: ************* Query " +  selectBookQuery);
			
			Book book = new Book();
			while(bookRS.next()) {
				book.setISBN(bookRS.getString("isbn"));
				book.setAuthor(bookRS.getString("author"));
			}
			bookRS.close();
			
			return book;
		}
		catch(SQLException se) {
			System.err.println("Book: Threw a SQLException retrieving the book object");
			System.err.println(se.getMessage());
		     se.printStackTrace();
		}
		
		return null;
	}
	
}
