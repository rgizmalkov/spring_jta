package com.gmail.rgizmalkov.mains;

import com.gmail.rgizmalkov.orm.Contact;
import com.gmail.rgizmalkov.services.ContactService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by Рома on 27.09.2016.
 */
public class FindAllMain {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:META-INF/tx-annotation-context.xml");
        ContactService cs = ctx.getBean("contactService", ContactService.class);
        List<Contact> contacts = cs.findAll();
        for (Contact contact : contacts) {
            System.out.println(contact);
        }

    }

}
