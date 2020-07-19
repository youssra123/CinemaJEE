package com.example.web;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.TicketRepository;
import com.example.entities.Ticket;

import lombok.Data;
@RestController
@CrossOrigin("*")
public class TicketController {
	@Autowired
	private TicketRepository Repository;
	//@RequestMapping


	@GetMapping(path="/ticket")
private List<Ticket> data() {
		return Repository.findAll();

		}
	
		@PostMapping(path="/saveticket")
		private String save(@RequestBody Ticket p) throws ParseException {
		Repository.save(p);
		return "bien enregister";

		}
		@GetMapping(path="/deleteticket/{id}")
		private String delete(@PathVariable Long id) {
			Repository.deleteById(id);
			return "bien supprimer";

		}
		@PostMapping(path="/updateticket")
		private String update(@RequestBody Ticket p) throws ParseException {
			Ticket u = Repository.getOne(p.getId());
			u.setCodePayement(p.getCodePayement());
			u.setNomClient(p.getNomClient());
			u.setReserve(p.isReserve());
			u.setPrix(p.getPrix());
			Repository.save(u);
			return "bien modifier";


		}

		@PostMapping(path="/payerTickets")
		private List<Ticket> payerTickets(@RequestBody TicketForm ticketForm) throws ParseException {
			List<Ticket>list=new ArrayList<Ticket>();
		ticketForm.getTickets().forEach(id->{
			Ticket t=Repository.findById(id).get();
			t.setNomClient(ticketForm.getNomClient());
			t.setReserve(true);
			t.setCodePayement(ticketForm.getCodePayement());
			Repository.save(t);
			list.add(t);
			
		});
			return list;


		}
		}
@Data
class TicketForm{
	private String nomClient;
	private List<Long> tickets=new ArrayList<Long>();
	private Integer CodePayement;
	
}


