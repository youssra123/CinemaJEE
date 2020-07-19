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

import com.example.JPA.PlaceRepository;
import com.example.JPA.SalleRepository;
import com.example.JPA.VilleRepository;
import com.example.entities.Place;
import com.example.entities.Salle;
import com.example.entities.Ville;




@RestController
@CrossOrigin("*")
public class PlaceController {
	@Autowired
	private PlaceRepository Repository;
	//@RequestMapping


	@GetMapping(path="/place")
private List<Place> data() {
		return Repository.findAll();

		}
	
		@PostMapping(path="/saveplace")
		private String save(@RequestBody Place p) throws ParseException {
		Repository.save(p);
		return "bien enregister";

		}
		@GetMapping(path="/deleteplace/{id}")
		private String delete(@PathVariable Long id) {
			Repository.deleteById(id);
			return "bien supprimer";

		}
		@PostMapping(path="/updateplace")
		private String update(@RequestBody Place p) throws ParseException {
			Place u = Repository.getOne(p.getId());
			u.setAltitude(p.getAltitude());
			u.setLatitude(p.getLatitude());
			u.setLongitude(p.getLongitude());
			u.setNumero(p.getNumero());
			Repository.save(u);
			return "bien modifier";


		}

		}







