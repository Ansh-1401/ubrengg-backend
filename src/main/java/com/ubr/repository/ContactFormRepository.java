// src/main/java/com/ubr/repository/ContactFormRepository.java
package com.ubr.repository;

import com.ubr.model.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {
}
