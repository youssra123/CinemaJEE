package com.example.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Ville implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private double longitude,latitude,altitude;
@OneToMany(mappedBy = "ville")
private Collection<Cinema>cinemas;

}
