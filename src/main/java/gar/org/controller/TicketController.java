
package gar.org.controller;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gar.org.entites.Codebar;
import gar.org.entites.Colis;
import gar.org.entites.Ticket;
import gar.org.repository.TicketRepository;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class TicketController {
	
	@Autowired
	private TicketRepository tr;
	

	@Autowired
	private EntityManager em;
	
	@GetMapping("/tickets")
	public List <Ticket> getTicketsList() {	
		
		return tr.findByOrderByTidDesc();
		  
	}
	
	/* -----------------------------------------------------------------------\*
						Somme des Codebar Chargé d'un Ticket 
	\*------------------------------------------------------------------------ */
	
	
	@GetMapping("/tickets/charge/somme/{ticketid}")
	public Long getTicketCodebarStcokSommeQuantite(@PathVariable Long ticketid) {	
		
		Long sommestock =  null;
		return sommestock = (Long) em
		.createQuery("select SUM(ccharge) from Codebar c where c.ticket.tid=?1")
		.setParameter(1, ticketid)
		.getSingleResult();   
	}
	
	/* <!------  |    FIN Somme des Codebar Chargé d'un Ticket |   ---------> */
	
	
	/* -----------------------------------------------------------------------\*
					Somme des Codebar Décharge d'un Ticket
	\*------------------------------------------------------------------------ */
	
	@GetMapping("/tickets/decharge/somme/{ticketid}")
	public Long getTicketCodebarDechargeSommeQuantite(@PathVariable Long ticketid) {	
		
		Long sommestock =  null;
		return sommestock = (Long) em
		.createQuery("select SUM(cdecharge) from Codebar c where c.ticket.tid=?1")
		.setParameter(1, ticketid)
		.getSingleResult();   
	}
	
	/* <!------  |    FIN Somme des Codebar Décharge d'un Ticket |   ---------> */
	
	
	
	/* -----------------------------------------------------------------------\*
						Somme des Codebar Recupere d'un Ticket
	\*------------------------------------------------------------------------ */
	
	@GetMapping("/tickets/recupere/somme/{ticketid}")
	public Long getTicketCodebarRecupereSommeQuantite(@PathVariable Long ticketid) {	
		
		Long sommestock =  null;
		return sommestock = (Long) em
		.createQuery("select SUM(crecupere) from Codebar c where c.ticket.tid=?1")
		.setParameter(1, ticketid)
		.getSingleResult();   
	}
	
	/* <!------  |    FIN Somme des Codebar Recupere d'un Ticket |   ---------> */
	
	
	

}
