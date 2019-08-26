package com.ibm.client;

import com.ibm.model.EmailRequest;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class EmailClient {

    public static void main(String[] args) {

        try {
            EmailRequest request = new EmailRequest();
            request.setToEmail("diptamsarkar@gmail.com");
            request.setFromEmail("jax-rs@jersey.com");
            request.setSubject("Test Email");
            request.setBody("This is a Test Message");

            Client client = ClientBuilder.newClient();
            WebTarget target = client.target("http://localhost:9090/emailsvc/send");
            Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
            Response response = builder.post(Entity.entity(request, MediaType.APPLICATION_JSON));

            System.out.println(response.getStatus());
            System.out.println(response.readEntity(EmailRequest.class));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
