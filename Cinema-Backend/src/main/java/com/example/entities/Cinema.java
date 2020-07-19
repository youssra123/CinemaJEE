package com.example.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Cinema implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private double longitude,latitude,altitude;
private int nombreSalles;
@OneToMany(mappedBy = "cinema")

private Collection<Salle>salles;
@ManyToOne
private Ville ville;
}

