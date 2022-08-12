package com.contact.contact_service;

import com.contact.contact_service.enitity.Contact;
import com.contact.contact_service.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactServiceApplication implements CommandLineRunner {

	@Autowired
	ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(ContactServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Contact contact1 = new Contact(1,"abc@gmail.com","abc",1);
		Contact contact2 = new Contact(2,"abc2@gmail.com","abc2",2);
		Contact contact3 = new Contact(3,"abc3@gmail.com","abcd3",1);
		contactRepository.save(contact1);
		contactRepository.save(contact2);
		contactRepository.save(contact3);
	}
}
