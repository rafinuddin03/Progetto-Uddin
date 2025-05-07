/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author pc
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class ContactController {

    @Autowired
    private ContactRepository repository;

    @GetMapping
    public List<Contact> getContacts() {
        return repository.findAll();
    }

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return repository.save(contact);
    }
}

