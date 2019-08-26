package com.ibm.controller;

import com.ibm.model.EmailRequest;
import com.ibm.service.MessageBuilder;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class RestController {

    @POST
    @Path("/send")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public EmailRequest sendEmail(EmailRequest request){

        System.out.println("Inside send Method");

        try {
            Message message = MessageBuilder.createNewMimeMsg(request);
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return request;
    }
}
