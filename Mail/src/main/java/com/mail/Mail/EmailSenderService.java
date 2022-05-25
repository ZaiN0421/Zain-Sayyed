package com.mail.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	@Autowired
    private JavaMailSender mailSender;

    public void sendSimpleEmail(String EmailId, String Html,String subject,String body)
    
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("zain481.sayyed@gmail.com");
        message.setTo(EmailId);
        message.setText(body);
        message.setSubject(subject);
        mailSender.send(message);
        System.out.println("Mail Sent");     //testing


    }

    
}


