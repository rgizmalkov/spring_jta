package com.gmail.rgizmalkov.services;

import com.gmail.rgizmalkov.orm.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Рома on 27.09.2016.
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
