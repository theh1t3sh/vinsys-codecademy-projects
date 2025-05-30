package org.aayora.service;

import org.aayora.model.Item;
import org.aayora.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceMySQL implements ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceMySQL(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public boolean delete(Integer itemId) {
        if (itemRepository.existsById(itemId)) {
            itemRepository.deleteById(itemId);
            return true;
        }
        return false;
    }

    @Override
    public List<Item> all() {
        return (List<Item>) itemRepository.findAll();
    }

    @Override
    public Item findById(Integer itemId) {
        Optional<Item> item = itemRepository.findById(itemId);
        return item.orElse(null);
    }
}