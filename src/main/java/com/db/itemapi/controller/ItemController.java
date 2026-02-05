package com.db.itemapi.controller;

import com.db.itemapi.model.Item;
import com.db.itemapi.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Item> addItem(@Valid @RequestBody Item item) {
        return new ResponseEntity<>(service.addItem(item), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Long id) {
        return ResponseEntity.ok(service.getItemByID(id));
    }

 
    @GetMapping
    public ResponseEntity<?> getAllItems() {
        return ResponseEntity.ok(service.getAllItems());
    }
    @GetMapping("/")
    public String home() {
        return "Item API is LIVE 🚀";
    }

}
