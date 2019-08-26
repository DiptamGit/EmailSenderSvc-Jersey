package com.ibm.service;

import com.ibm.model.EmailRequest;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MessageBuilder {

    public static Message createNewMimeMsg(EmailRequest request) {

        Message message = new MimeMessage(SessionBuilder.getInstance());
        try {
            message.setFrom(new InternetAddress(request.getToEmail()));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(request.getToEmail()));
            message.setSubject(request.getBody());
            message.setText(request.getBody());
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return message;
    }
}
