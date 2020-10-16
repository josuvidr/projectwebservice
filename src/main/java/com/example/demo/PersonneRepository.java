package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonneRepository  extends CrudRepository<Personne, Integer>{
     void deletePersonne(Personne p);
     Iterable<Personne> searchPersonne();
     Personne createPersonne(Personne p);
    Optional< Personne > findById(Long id);



}
