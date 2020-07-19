package com.example.web;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.FilmsRepository;
import com.example.JPA.PlaceRepository;
import com.example.JPA.VilleRepository;
import com.example.entities.Film;
import com.example.entities.Place;
import com.example.entities.Ville;

import lombok.Data;

@RestController
@CrossOrigin("*")
public class FilmController {
	@Autowired
	private FilmsRepository Repository;
	//@RequestMapping


	@GetMapping(path="/film")
private List<Film> data() {
		return Repository.findAll();

		}
	@GetMapping(path="/imageFilm/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
	private byte[] image(@PathVariable (name="id")Long id) throws IOException {
		Film f=Repository.findById(id).get();
		String photoname=f.getPhoto();
		File file=new File(System.getProperty("user.home")+"/cinema-project/images/"+photoname);
		Path path=Paths.get(file.toURI());
			return Files.readAllBytes(path);

			}
		@PostMapping(path="/savefilm")
		private String save(@RequestBody Film p) throws ParseException {
		Repository.save(p);
		return "bien enregister";

		}
		@GetMapping(path="/deletefilm/{id}")
		private String delete(@PathVariable Long id) {
			Repository.deleteById(id);
			return "bien supprimer";

		}
		@PostMapping(path="/updatefilm")
		private String update(@RequestBody Film p) throws ParseException {
			Film u = Repository.getOne(p.getId());
			u.setTitre(p.getTitre());
			u.setCategorie(p.getCategorie());
			u.setDateSortie(p.getDateSortie());
			u.setDescription(p.getDescription());
			u.setDuree(p.getDuree());
			u.setPhoto(p.getPhoto());
			u.setRealisateur(p.getRealisateur());
			Repository.save(u);
			return "bien modifier";


		}

		}

