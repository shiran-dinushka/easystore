package com.easybytes.easystore.repository;

import com.easybytes.easystore.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}