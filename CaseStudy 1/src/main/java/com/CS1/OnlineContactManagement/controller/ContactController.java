package com.CS1.OnlineContactManagement.controller;

import com.CS1.OnlineContactManagement.entity.Contact;
import com.CS1.OnlineContactManagement.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping("/api/v1/contacts")
    public Contact saveContacts(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }

    @GetMapping("/contacts/{id}")
    public Contact getContactById(@PathVariable("id") Long contactId) {
        return contactService.getContactById(contactId);
    }

    @PutMapping("/contacts/{id}")
    public Contact updateContacts(@PathVariable("id") Long contactId,@RequestBody Contact contact) {
        return contactService.updateContact(contactId, contact);
    }

    @DeleteMapping("/contacts/{id}")
    public String deleteContactById(@PathVariable("id") Long contactId) {
        contactService.deleteContactById(contactId);
        return "Contact deleted Successfullly";
//
    }
}
