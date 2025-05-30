package org.aayora.service;

import java.util.List;

import org.aayora.model.Item;

public interface ItemService {
    Item save(Item item);

    boolean delete(Integer itemId);

    List<Item> all();

    Item findById(Integer itemId);
}

// package org.aayora.service;

// import java.util.List;

// import org.aayora.model.Item;

// public interface ItemService {
// Item save(Item item);

// boolean delete(int itemId);

// List<Item> all();

// Item findById(int itemId);
// }
