package com.example.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entities.Categorie;
import com.example.entities.Film;
@RepositoryRestResource
@CrossOrigin("*")
public interface FilmsRepository extends JpaRepository<Film, Long> {

}
