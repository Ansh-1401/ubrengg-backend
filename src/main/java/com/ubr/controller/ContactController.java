// src/main/java/com/ubr/controller/ContactController.java
package com.ubr.controller;

import com.ubr.model.ContactForm;
import com.ubr.repository.ContactFormRepository;
import com.ubr.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    @Autowired
    private ContactFormRepository contactFormRepository;

    @Autowired
    private MailService mailService;

    @PostMapping
    public ResponseEntity<?> saveContact(@RequestBody ContactForm form) {
        // Save form data to database
        contactFormRepository.save(form);

        // Send email notification
        mailService.sendContactNotification(
                form.getName(),
                form.getEmail(),
                form.getMessage()
        );

        return ResponseEntity.ok("Message saved and email notification sent.");
    }
}
