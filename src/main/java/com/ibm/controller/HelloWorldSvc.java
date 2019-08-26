package com.ibm.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloWorldSvc {

    @GET
    @Path("/hello")
    @Produces(value = MediaType.TEXT_PLAIN)
    public String sayHello(){
        return "Hello";
    }
}
