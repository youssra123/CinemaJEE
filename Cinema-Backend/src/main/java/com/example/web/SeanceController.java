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

import com.example.JPA.SeanceRepository;
import com.example.entities.Seance;

@RestController
@CrossOrigin("*")
public class SeanceController {
	@Autowired
	private SeanceRepository Repository;
	//@RequestMapping


	@GetMapping(path="/seance")
private List<Seance> data() {
		return Repository.findAll();

		}
	
		@PostMapping(path="/saveseance")
		private String save(@RequestBody Seance p) throws ParseException {
		Repository.save(p);
		return "bien enregister";

		}
		@GetMapping(path="/deleteseance/{id}")
		private String delete(@PathVariable Long id) {
			Repository.deleteById(id);
			return "bien supprimer";

		}
		@PostMapping(path="/updateseance")
		private String update(@RequestBody Seance p) throws ParseException {
			Seance u = Repository.getOne(p.getId());
			u.setHeureDebut(p.getHeureDebut());
			Repository.save(u);
			return "bien modifier";


		}

		}



