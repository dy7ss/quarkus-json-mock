package org.acme;

import java.io.IOException;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/sampleB")
public class SampleBResource {
    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() throws IOException {
        return Common.read("../../../resources/main/foo.json");
    }

    @GET
    @Path("world")
    @Produces(MediaType.APPLICATION_JSON)
    public String world() throws IOException {
        return Common.read("../../../resources/main/fuga.json");
    }
}
