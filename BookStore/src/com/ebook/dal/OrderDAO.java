package com.ebook.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ebook.model.order.Order;

public class OrderDAO {

  public OrderDAO() {
  }

  public Order getOrder(String orderId) {
    try {

      Statement st = DBHelper.getConnection().createStatement();
      String selectQueryString = "SELECT orderID, orderState FROM Order WHERE orderID = '" + orderId + "'";

      ResultSet orderRS = st.executeQuery(selectQueryString);
      System.out.println("OrderDAO: **************** Query " + selectQueryString);

      Order order = new Order();
      while (orderRS.next()) {
        order.setOrderId(orderRS.getString("orderID"));
        order.setOrderState(orderRS.getString("orderState"));
      }
      orderRS.close();

      return order;
    } catch (SQLException se) {
      System.err.println("OrderDAO: Threw a SQLException retreiving the order object.");
      System.err.println(se.getMessage());
      se.printStackTrace();
    }
    return null;
  }

  public void addOrder(Order order) {
    Connection con = DBHelper.getConnection();
    PreparedStatement orderPst = null;

    try {
      String orderStm = "INSERT INTO Order (orderID, orderState) VALUES(?, ?)";
      orderPst = con.prepareStatement(orderStm);
      orderPst.setString(1, order.getOrderId());
      orderPst.setString(2, order.getOrderState());
      orderPst.executeUpdate();
    } catch (SQLException ex) {

    } finally {

      try {
        if (con != null) {
          con.close();
        }
      } catch (SQLException se) {
        System.err.println("OrderDAO: threw a SQLException saving the order object");
        System.err.println(se.getMessage());
      }

    }
  }

}
