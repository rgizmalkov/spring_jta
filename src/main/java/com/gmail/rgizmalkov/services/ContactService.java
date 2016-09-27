package com.gmail.rgizmalkov.services;

import com.gmail.rgizmalkov.orm.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    Contact save(Contact contact);
    long countAll();
}
