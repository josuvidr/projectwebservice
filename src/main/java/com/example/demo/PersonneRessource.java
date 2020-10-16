package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

//Pour le lien en localhost
@Path("personnes")
public class PersonneRessource{

    @Autowired
    private PersonneRepository personneRepository;
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/create")
    public Personne createPersonne(Personne p) {
        return personneRepository.save(p);
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/search")
    public Iterable<Personne> searchPersonne() {
        return personneRepository.findAll();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/delete")
    public void deletePersonne(Personne p) {
        personneRepository.delete(p);
    }
}
