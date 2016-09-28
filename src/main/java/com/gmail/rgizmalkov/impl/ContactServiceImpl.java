package com.gmail.rgizmalkov.impl;

import com.gmail.rgizmalkov.orm.Contact;
import com.gmail.rgizmalkov.services.ContactRepository;
import com.gmail.rgizmalkov.services.ContactService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Рома on 27.09.2016.
 */
@Service("contactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    public List<Contact> findAll() {
        return Lists.newArrayList(contactRepository.findAll());
    }

    @Transactional(readOnly = true)
    public Contact findById(Long id) {
        return contactRepository.findOne(id);
    }

    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }

    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    public long countAll() {
        // not-created transactions
        return contactRepository.countAllContacts();//em.createNamedQuery("Contact.countAll", Contact.class).getSingleResult();
    }

    public ContactRepository getContactRepository() {
        return contactRepository;
    }

    public void setContactRepository(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

}
