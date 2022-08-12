package com.contact.contact_service.enitity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Contact{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cID;
    private String email;
    private String contactName;
    private int userID;

    //@ManyToOne
    //@JsonProperty
    //User user;


    public Contact() {
    }

    public Contact(int cID, String email, String contactName, int userID) {
        this.cID = cID;
        this.email = email;
        this.contactName = contactName;
        this.userID = userID;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
