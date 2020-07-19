package com.example.web;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.CinemaRepository;
import com.example.JPA.FilmsRepository;
import com.example.JPA.VilleRepository;
import com.example.entities.Cinema;
import com.example.entities.Film;
import com.example.entities.Ville;

	@RestController
	@CrossOrigin("*")
	public class CinemaController {
		@Autowired
		private CinemaRepository Repository;
		//@RequestMapping


		@GetMapping(path="/cinema")
	private List<Cinema> data() {
			return Repository.findAll();

			}
		
			@PostMapping(path="/savecinema")
			private String save(@RequestBody Cinema p) throws ParseException {
			Repository.save(p);
			return "bien enregister";

			}
			@GetMapping(path="/deletecinema/{id}")
			private String delete(@PathVariable Long id) {
				Repository.deleteById(id);
				return "bien supprimer";

			}
			@PostMapping(path="/updatecinema")
			private String update(@RequestBody Cinema p) throws ParseException {
				Cinema u = Repository.getOne(p.getId());
				u.setAltitude(p.getAltitude());
				u.setLatitude(p.getLatitude());
				u.setLongitude(p.getLongitude());;
				u.setName(p.getName());
				u.setNombreSalles(p.getNombreSalles());
				
				Repository.save(u);
				return "bien modifier";


			}

			}



