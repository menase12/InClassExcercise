package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor,Long> {
   Iterable <Actor> findAllByrealNameContainingIgnoreCase(String s);
   Iterable <Actor> findAllByMoviesNotContaining(Movie thisMovie);
}

