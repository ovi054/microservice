package com.contact.contact_service.repository;

import com.contact.contact_service.enitity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
