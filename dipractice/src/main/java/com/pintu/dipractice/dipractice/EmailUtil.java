package com.pintu.dipractice.dipractice;

import java.io.DataInputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

@Autowired
//private MailSender mailsender;

public void sendMail(ApplicationContext ctx) throws IOException{
	SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
	MailSender mailsender = ctx.getBean(JavaMailSender.class);
	DataInputStream in = new DataInputStream(System.in);
	System.out.println("Enter Email Address : ");
	String toAddress = in.readLine();
	System.out.println("Enter Subject : ");
	String subject = in.readLine();
	System.out.println("Enter Text : ");
	String text = in.readLine();
	simpleMailMessage.setFrom("pintu541796@gmail.com");
	simpleMailMessage.setTo(toAddress);
	simpleMailMessage.setSubject(subject);
	simpleMailMessage.setText(text);
	mailsender.send(simpleMailMessage);
}
	

}
