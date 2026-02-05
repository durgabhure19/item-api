package com.db.itemapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.db.itemapi.model.Item;

@Service
public class ItemService {

	private final List<Item> items = new ArrayList<>();
	private Long idCounter = 1L;

	public Item addItem(Item item) {
		item.setId(idCounter++);
		items.add(item);
		return item;
	}

	public Item getItemByID(Long id) {
		return items.stream().filter(item -> item.getId().equals(id)).findFirst()
				.orElseThrow(() -> new RuntimeException("Item not found with id: " + id));
	}

	public List<Item> getAllItems() {
		return items;
	}
}
