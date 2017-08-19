package com.github.binodnme.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/** This just a sample controller
 *
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 8/19/17.
 */
@Path("/")
public class HelloRs {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "hello auth";
    }
}
