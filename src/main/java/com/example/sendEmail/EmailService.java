package com.example.sendEmail;
// Java Program to Illustrate Creation Of
// Service Interface


// Importing required classes
import com.example.sendEmail.EmailDetails;

// Interface
public interface EmailService {

    // Method
    // To send a simple email
    String sendSimpleMail(EmailDetails details);

    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}
