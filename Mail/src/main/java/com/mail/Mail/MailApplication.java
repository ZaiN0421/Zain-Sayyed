package com.mail.Mail;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailApplication {

	
		@Autowired
		private EmailSenderService senderService;
		public static void main(String[] args) {
			SpringApplication.run(MailApplication.class, args);
		}
		@EventListener(ApplicationReadyEvent.class)
		public void triggerMail() throws MessagingException {
			senderService.sendSimpleEmail("sayyedmohdzain@gmail.com",
					"This is for HTML",
					"This is email body",
					"This is email subject");

		}
	}


