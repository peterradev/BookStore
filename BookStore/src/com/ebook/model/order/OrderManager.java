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

	public void confirmOrder(Order order) {
		Order order2 = order;
		order2.confirmOrder();
		try {
			orderDAO.confirmOrder(order2);
		} catch (Exception se) {
			System.out.println("OrderManager: Threw an Exception confirming order");
			System.err.print(se.getMessage());
		}
	}

	public void cancelOrder(Order order) {
		order.cancelOrder();
		try {
			orderDAO.cancelOrder(order);
		} catch (Exception se) {
			System.out.println("OrderManager: Threw an Exception cancelling order");
			System.err.print(se.getMessage());
		}
	}

}
