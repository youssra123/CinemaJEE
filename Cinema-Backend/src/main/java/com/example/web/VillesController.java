package com.example.web;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.VilleRepository;
import com.example.entities.Ville;



@RestController
@CrossOrigin("*")
public class VillesController {
	@Autowired
	private VilleRepository Repository;
	//@RequestMapping


	@GetMapping(path="/ville")
private List<Ville> data() {
		return Repository.findAll();

		}
	
		@PostMapping(path="/saveville")
		private String save(@RequestBody Ville p) throws ParseException {
		Repository.save(p);
		return "bien enregister";

		}
		@GetMapping(path="/deleteville/{id}")
		private String delete(@PathVariable Long id) {
			Repository.deleteById(id);
			return "bien supprimer";

		}
		@PostMapping(path="/updateville")
		private String update(@RequestBody Ville p) throws ParseException {
			Ville u = Repository.getOne(p.getId());
			u.setAltitude(p.getAltitude());
			u.setLatitude(p.getLatitude());
			u.setLongitude(p.getLongitude());
			u.setName(p.getName());
			Repository.save(u);
			return "bien modifier";


		}

		}


