package com.example.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Salle implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private int nombrePlace;
@ManyToOne
private Cinema cinema;
@OneToMany(mappedBy = "salle")
private Collection<Place>places;
@OneToMany(mappedBy = "salle")
private Collection<Projection>projections;

}
