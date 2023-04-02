package com.example;

import javax.transaction.Transactional;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {

    private final MyEntityRepository repository;

    public ExampleResource(MyEntityRepository repository) {
        this.repository = repository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MyEntity> hello() {
        return repository.findAll().list();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response createUser(MyEntity entity) {
        repository.persist(entity);
        return Response.status(Response.Status.CREATED).build();
    }
}