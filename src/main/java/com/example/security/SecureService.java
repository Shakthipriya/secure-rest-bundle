package com.example.security;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

@Path("/secure-service/")
public class SecureService {
    private Logger logger = Logger.getLogger(SecureService.class);

    @GET
    @Path("/sayHello/")
    @Produces(MediaType.APPLICATION_XML)
    public Response sayHello() {
        logger.debug("Invoking sayHello");
        Response response = new Response("Hello!");
        return response;
    }

    @GET
    @Path("/sayHelloSecured/")
    @Produces(MediaType.APPLICATION_XML)
    public Response sayHelloSecured() {
        logger.debug("Invoking sayHelloSecured");
        Response response = new Response("Secured Hello!");
        return response;
    }

}
