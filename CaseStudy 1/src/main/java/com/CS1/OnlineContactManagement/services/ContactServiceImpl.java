package com.CS1.OnlineContactManagement.services;

import com.CS1.OnlineContactManagement.entity.Contact;
import com.CS1.OnlineContactManagement.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact saveContact(Contact contact){
        return contactRepository.save(contact);
    }

    @Override
    public Contact getContactById(Long contactId) {
        return contactRepository.findById(contactId).get();
    }

    @Override
    public Contact updateContact(Long contactId, Contact contact) {
        Contact contactDB = contactRepository.findById(contactId).get();

        if(Objects.nonNull(contact.getContactName()) && !"".equalsIgnoreCase(contact.getContactName())){
            contactDB.setContactName((contact.getContactName()));
        }

        if(Objects.nonNull(contact.getContactNumber()) && !"".equalsIgnoreCase(contact.getContactNumber())){
            contactDB.setContactNumber((contact.getContactNumber()));
        }

        if(Objects.nonNull(contact.getContactEmail()) && !"".equalsIgnoreCase(contact.getContactEmail())){
            contactDB.setContactEmail((contact.getContactEmail()));
        }

        return contactRepository.save(contactDB);

    }

    @Override
    public String deleteContactById(Long contactId) {
        contactRepository.deleteById(contactId);
//        logger.info("\n\n\nLog: User Details deleted"\n\n\n");
        return("Success!");
    }

//    @Override
//    public void deleteContactById(Long contactId) {
//
//    }

}
