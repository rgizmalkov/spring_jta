package com.gmail.rgizmalkov.mains;

import com.gmail.rgizmalkov.orm.Contact;
import com.gmail.rgizmalkov.services.ContactService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by Рома on 27.09.2016.
 */
public class FindSaveOneMain {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:META-INF/tx-annotation-context.xml");
        ContactService cs = ctx.getBean("contactService", ContactService.class);
        List<Contact> contacts = cs.findAll();
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
        Contact contact = cs.findById(1l);
        System.out.println(contact);
        contact.setFirstName("Peter");
        Contact contact_one = cs.findById(1l);
        System.out.println("Changed contact: " + contact_one);
    }

}
