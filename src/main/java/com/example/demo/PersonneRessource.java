package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

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

   /* @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/one/{id}")
    public Optional<Personne> searchOnePersonne(@PathVariable int id) {
        return personneRepository.findById(id);
    }*/

    public Optional <Personne> findById(Long id) {
        return personneRepository.findById(id);
    }
}
