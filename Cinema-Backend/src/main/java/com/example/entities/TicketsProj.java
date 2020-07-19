package com.example.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.rest.core.config.Projection;

	@Projection(name="t1",types= {com.example.entities.Ticket.class})
	public interface TicketsProj {
		public Long getId();
		public String getNomClient();
		public double getPrix();
		public Integer getCodePayement();
		public boolean getReserve();
		public Place getPlace();

	}

