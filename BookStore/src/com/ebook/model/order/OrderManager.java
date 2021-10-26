package com.ebook.model.order;

import com.ebook.dal.OrderDAO;

public class OrderManager {

	OrderDAO orderDAO = new OrderDAO();

	public Order getOrder(String orderId) {

		Order order = findOrderById(orderId);
		return order;

	}

	public Order findOrderById(String orderId) {
		try {
			Order order = orderDAO.getOrder(orderId);
			return order;
		} catch (Exception se) {
			System.err.println("OrderManager: Threw an Exception retreiving order");
			System.err.println(se.getMessage());
		}
		return null;
	}

	public void addOrder(Order order) {

		try {
			orderDAO.addOrder(order);
		} catch (Exception se) {
			System.err.println("OrderManager: Threw an Exception retreiving order");
			System.err.println(se.getMessage());
		}

	}

}
