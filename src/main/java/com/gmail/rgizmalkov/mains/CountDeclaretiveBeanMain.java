package com.gmail.rgizmalkov.mains;

import com.gmail.rgizmalkov.orm.Contact;
import com.gmail.rgizmalkov.services.ContactService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by Рома on 27.09.2016.
 */
public class CountDeclaretiveBeanMain {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:META-INF/tx-arm-declaretive-annotation-context.xml");
        ContactService cs = ctx.getBean("contactServiceArmTx", ContactService.class);
        System.out.println(cs.countAll());

    }

}
