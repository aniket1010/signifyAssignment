package com.CS1.OnlineContactManagement.repository;

import com.CS1.OnlineContactManagement.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
