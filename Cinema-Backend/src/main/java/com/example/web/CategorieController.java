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

import com.example.JPA.CategorieRepository;
import com.example.JPA.CinemaRepository;
import com.example.JPA.VilleRepository;
import com.example.entities.Categorie;
import com.example.entities.Cinema;
import com.example.entities.Ville;

	@RestController
	@CrossOrigin("*")
	public class CategorieController {
		@Autowired
		private CategorieRepository Repository;
		//@RequestMapping


		@GetMapping(path="/categorie")
	private List<Categorie> data() {
			return Repository.findAll();

			}
		
			@PostMapping(path="/savecategorie")
			private String save(@RequestBody Categorie p) throws ParseException {
			Repository.save(p);
			return "bien enregister";

			}
			@GetMapping(path="/deletecategorie/{id}")
			private String delete(@PathVariable Long id) {
				Repository.deleteById(id);
				return "bien supprimer";

			}
			@PostMapping(path="/updatecategorie")
			private String update(@RequestBody Categorie p) throws ParseException {
				Categorie u = Repository.getOne(p.getId());
			
				u.setName(p.getName());
			
				
				Repository.save(u);
				return "bien modifier";


			}

			}


