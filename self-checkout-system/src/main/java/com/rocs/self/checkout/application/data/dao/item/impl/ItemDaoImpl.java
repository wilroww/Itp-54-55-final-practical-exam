package com.rocs.self.checkout.application.data.dao.item.impl;
import com.rocs.self.checkout.application.data.dao.ItemDao;
import com.rocs.self.checkout.application.model.item.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ItemDaoImpl implements ItemDao {
    @Override
    public Item findItemById(String id) {
        Item item = null;

        try (Connection con = ConnectionHelper.getConnection()){

            PreparedStatement stmt = con.prepareStatement("SELECT * FROM ITEM WHERE ID = ?");
            stmt.setString(1, id);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()) {
                item = new Item();
                item.setId(rs.getString("Id"));
                item.setItemDesc(rs.getString("ItemDescription"));
                item.setUnitPrice(rs.getString("UnitPrice"));
            }

        } catch (SQLException e) {
            System.out.println("An SQL Exception occurred." + e.getMessage());
        }

        return item;
    }
    @Override
    public List<Item> findAll() {
        List<Item> itemList = new ArrayList<>();

        try (Connection con = ConnectionHelper.getConnection()) {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM ITEM");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                Item item = new Item();
                item.setId(rs.getString("id"));
                item.setTitle(rs.getString("title"));
                item.setGenre(rs.getString("genre"));
                item.setCopies(rs.getInt("copies"));
                itemList.add(item);
            }

        } catch (SQLException e) {
            System.out.println("An SQL Exception occurred." + e.getMessage());
        }
        return itemList;
    }
}