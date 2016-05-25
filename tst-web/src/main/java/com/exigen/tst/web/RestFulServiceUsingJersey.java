package com.exigen.tst.web;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("greetings")
public class RestFulServiceUsingJersey {


    @GET
    @Path("abc")
    @Produces("text/plain")
    public String welcome() {
        return "Hello!";
    }
}