package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.JPA.ICinemaInitService;
import com.example.entities.Film;
import com.example.entities.Salle;
import com.example.entities.Ticket;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class CinemaApplication implements CommandLineRunner{
@Autowired private ICinemaInitService cinemaInitService;
@Autowired private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Film.class,Salle.class,Ticket.class);
		cinemaInitService.initVilles();
		cinemaInitService.initCategories();
		cinemaInitService.initCinemas();
		cinemaInitService.initFilms();
		cinemaInitService.initSalles();
		cinemaInitService.initPlaces();
		cinemaInitService.initSeances();
		cinemaInitService.initProjections();
		cinemaInitService.initTickets();
	}

}
