package com.example.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
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
	public class Ticket implements Serializable{
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomClient;
	private double prix;
	@Column(unique = false,nullable=true)
	private Integer codePayement;
	private boolean reserve;
	@ManyToOne
	private Place place;
	@ManyToOne
	private Projection projection;
	}
