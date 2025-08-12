// src/main/java/com/ubr/service/MailService.java
package com.ubr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendContactNotification(String name, String email, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("ubrengwork@gmail.com"); // 👈 replace later with real company email
        mailMessage.setSubject("New Contact Form Submission");
        mailMessage.setText(
            "📩 New contact form submitted:\n\n" +
            "Name: " + name + "\n" +
            "Email: " + email + "\n" +
            "Message:\n" + message + "\n\n" +
            "-- UBR Engineering Website"
        );
        mailSender.send(mailMessage);
    }
}
