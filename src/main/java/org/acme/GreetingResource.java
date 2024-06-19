package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myapi")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello, how are you ?";
    }

    @GET
    @Path("/about")
    public String about() {
        String aboutMessage = "MyAPI version 0.2";
        return aboutMessage;
    }

}