package com.rocs.self.checkout.application.data.dao;

import com.rocs.self.checkout.application.model.item.Item;

import java.util.List;

public interface ItemDao {

    Item findItemById(String id);
    List<Item> findAll();
}
