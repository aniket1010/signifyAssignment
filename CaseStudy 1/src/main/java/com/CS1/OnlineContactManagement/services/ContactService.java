package com.CS1.OnlineContactManagement.services;

import com.CS1.OnlineContactManagement.entity.Contact;

public interface ContactService {
    Contact saveContact(Contact contact);

    Contact getContactById(Long contactId);

    Contact updateContact(Long contactId, Contact contact);

    String deleteContactById(Long contactId);

//    void deleteContactById(Long contactId);
}
