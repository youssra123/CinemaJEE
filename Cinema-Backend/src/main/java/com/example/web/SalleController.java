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

import com.example.JPA.SalleRepository;

import com.example.entities.Salle;


@RestController
@CrossOrigin("*")
public class SalleController {
	@Autowired
	private SalleRepository Repository;
	//@RequestMapping


	@GetMapping(path="/salle")
private List<Salle> data() {
		return Repository.findAll();

		}
	
		@PostMapping(path="/savesalle")
		private String save(@RequestBody Salle p) throws ParseException {
		Repository.save(p);
		return "bien enregister";

		}
		@GetMapping(path="/deletesalle/{id}")
		private String delete(@PathVariable Long id) {
			Repository.deleteById(id);
			return "bien supprimer";

		}
		@PostMapping(path="/updatesalle")
		private String update(@RequestBody Salle p) throws ParseException {
			Salle u = Repository.getOne(p.getId());
			u.setName(p.getName());
			u.setNombrePlace(p.getNombrePlace());
			Repository.save(u);
			return "bien modifier";


		}

		}



