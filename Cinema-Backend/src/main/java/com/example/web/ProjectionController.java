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

import com.example.JPA.ProjectionRepository;
import com.example.JPA.SalleRepository;
import com.example.JPA.VilleRepository;
import com.example.entities.Projection;
import com.example.entities.Salle;
import com.example.entities.Ville;


	@RestController
	@CrossOrigin("*")
	public class ProjectionController {

		@Autowired
		private ProjectionRepository Repository;
		//@RequestMapping


		@GetMapping(path="/projection")
	private List<Projection> data() {
			return Repository.findAll();

			}
		
			@PostMapping(path="/saveprojection")
			private String save(@RequestBody Projection p) throws ParseException {
			Repository.save(p);
			return "bien enregister";

			}
			@GetMapping(path="/deleteprojection/{id}")
			private String delete(@PathVariable Long id) {
				Repository.deleteById(id);
				return "bien supprimer";

			}
			@PostMapping(path="/updateprojection")
			private String update(@RequestBody Projection p) throws ParseException {
				Projection u = Repository.getOne(p.getId());
				u.setDateProjection(p.getDateProjection());
				u.setPrix(p.getPrix());
				Repository.save(u);
				return "bien modifier";


			}

			}

