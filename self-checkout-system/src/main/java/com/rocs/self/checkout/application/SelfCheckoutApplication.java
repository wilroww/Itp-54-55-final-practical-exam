package com.rocs.self.checkout.application;

import com.rocs.self.checkout.application.data.dao.ItemDao;
import com.rocs.self.checkout.application.data.dao.item.impl.ItemDaoImpl;
import com.rocs.self.checkout.application.model.item.Item;

import java.util.List;

public class SelfCheckoutApplication {

        public static void main(String[] args) {

            System.out.println("Self-Checkout-System");
            ItemDao item = new ItemDaoImpl();
            List<Item> itemDaoList = item.findAll();
            for (Item item1 : itemDaoList) {
                System.out.println(item1);
            }
//            Connection connection = null;
//            try {
//                connection = ConnectionHelper.getConnection();
//                System.out.println("Successfully connected to the database!");
//                // Perform database operations here using the 'connection' object
//            } catch (RuntimeException e) {
//                System.err.println("Failed to connect to the database: " + e.getMessage());
//                e.printStackTrace();
//            } finally {
//                if (connection != null) {
//                    try {
//                        connection.close();
//                        System.out.println("Connection closed.");
//                    } catch (SQLException e) {
//                        System.err.println("Error closing connection: " + e.getMessage());
//                    }
//                }
//            }
        }
    }