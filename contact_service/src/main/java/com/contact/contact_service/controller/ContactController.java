package com.contact.contact_service.controller;


import com.contact.contact_service.enitity.Contact;
import com.contact.contact_service.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contacts")
    public List<Contact> getAllContacts()
    {
        return contactRepository.findAll();
    }
    @GetMapping("/contacts/{id}")
    public List<Contact> getContactsbyUserID(@PathVariable int id)
    {
        //return contactRepository.findAll();
        List<Contact> contacts = contactRepository.findAll();
        List<Contact> newcontacts = new ArrayList<>();
        long n = contactRepository.count();
        for(int i=0;i<contacts.size();i++)
        {
            Contact contact= contacts.get(i);
            if(contact.getUserID()==id)
            {
                newcontacts.add(contact);
            }
        }
        return newcontacts;
    }
}
