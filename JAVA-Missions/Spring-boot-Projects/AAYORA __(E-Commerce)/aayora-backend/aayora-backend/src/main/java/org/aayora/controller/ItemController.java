package org.aayora.controller;

import org.aayora.dto.ItemDto;
import org.aayora.model.Item;
import org.aayora.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.all();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Integer id) {
        return itemService.findById(id);
    }

    @PostMapping
    public Item createItem(@RequestBody ItemDto itemDto) {
        Item item = new Item();
        item.setName(itemDto.getName());
        item.setDescription(itemDto.getDescription());
        item.setImageUrl(itemDto.getImageUrl());
        item.setPrice(itemDto.getPrice());
        item.setStock(itemDto.getStock());
        return itemService.save(item);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Integer id, @RequestBody ItemDto itemDto) {
        Item existingItem = itemService.findById(id);
        if (existingItem != null) {
            existingItem.setName(itemDto.getName());
            existingItem.setDescription(itemDto.getDescription());
            existingItem.setImageUrl(itemDto.getImageUrl());
            existingItem.setPrice(itemDto.getPrice());
            existingItem.setStock(itemDto.getStock());
            return itemService.save(existingItem);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public boolean deleteItem(@PathVariable Integer id) {
        return itemService.delete(id);
    }
}