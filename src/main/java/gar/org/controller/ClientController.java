package gar.org.controller;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gar.org.entites.Client;
import gar.org.entites.Codebar;
import gar.org.entites.Colis;
import gar.org.entites.Ticket;
import gar.org.repository.ClientRepository;
import gar.org.repository.CodebarRepository;
import gar.org.repository.ColisRepository;
import gar.org.repository.TicketRepository;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class ClientController {
	
	@Autowired
	private ClientRepository clr;
	
	@Autowired
	private TicketRepository tr;
	

	@Autowired
	private EntityManager em;
	
	private String formattedDate;
	private String formattedDateTime;
	private String client_user_name = "ADMIN";
	
	
	/* ------------------------------------------------------------\*
							Ajout D'un Client 
	\*------------------------------------------------------------ */	

	@PostMapping("/clients")
	public Client ajouterClient(@RequestBody Client client) {
	
	
		LocalDateTime myObj = LocalDateTime.now();
		LocalDate myObjc = LocalDate.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter myFormatObjb = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		formattedDate = myObj.format(myFormatObj);
		formattedDateTime = myObj.format(myFormatObjb);
		
		String rb_clnom = client.getClnom();
		String rb_clprenom = client.getClprenom();
		String rb_cltel = client.getCltel();
		String rb_clcode = client.getClcode();
		String rb_clautre = client.getClautre();
		
		
		Client myclientb = new Client();
		myclientb.setClautre(rb_clautre);
		myclientb.setClcode(rb_clcode);
		myclientb.setCldate(formattedDate);
		myclientb.setCldateb(myObjc);
		myclientb.setCldtcreation(formattedDateTime);
		myclientb.setClnom(rb_clnom);
		myclientb.setClprenom(rb_clprenom);
		myclientb.setCltel(rb_cltel);
		myclientb.setClusercree(client_user_name);
		clr.save(myclientb);
	
	
		return myclientb;   
	
	
	}

	/* <!------  |    FIN Ajout D'un Client |   ---------> */

	
	
	
	/* ----------------------------------------------------------------\*
							Nombre de Client 
	\*----------------------------------------------------------------- */
	
		@GetMapping("/clients/nbre")
		public BigInteger getClientsNbre() {	
			
			BigInteger result = null;
			return result = (BigInteger) em
			.createNativeQuery("select count(*) from clients")
			.getSingleResult();   
		}
	
	/* <!------  |    FIN Nombre de Client  |   ---------> */
	
	
	
	
	/* -----------------------------------------------------------------------\*
							Nombre de Colis  d'un Client 
	\*------------------------------------------------------------------------ */
	
		@GetMapping("/clients/colis/nbre/{clientid}")
		public BigInteger getColisNbre(@PathVariable Long clientid) {	
			
			BigInteger result = null;
			return result = (BigInteger) em
			.createNativeQuery("select count(*) from colises where client_clid=?")
			.setParameter(1, clientid)
			.getSingleResult();   
		}
	
	/* <!------  |    FIN Nombre de Colis  d'un Client  |   ---------> */
	
	
		
		
	
	/* -----------------------------------------------------------------------\*
	   					Somme des Colis  d'un Client 
	\*------------------------------------------------------------------------ */
	
		@GetMapping("/clients/colis/somme/{clientid}")
		public Long getClientColisSommeQuantite(@PathVariable Long clientid) {	
			
			Long nombreColis =  null;
			return nombreColis = (Long) em
			.createQuery("select SUM(conombre) from Colis c where c.client.clid=?1")
			.setParameter(1, clientid)
			.getSingleResult();   
		}
	
	/* <!------  |    FIN Somme des Colis  d'un Client |   ---------> */
	
	
	
	
	/* -----------------------------------------------------------------------\*
	   					Somme des Codebar Chargé d'un Client 
	\*------------------------------------------------------------------------ */
	
		@GetMapping("/clients/codebars/charge/somme/{clientid}")
		public Long getClientCodebarChargeSommeQuantite(@PathVariable Long clientid) {	
			
			Long sommecharge =  null;
			return sommecharge = (Long) em
			.createQuery("select SUM(ccharge) from Codebar c where c.client.clid=?1")
			.setParameter(1, clientid)
			.getSingleResult();   
		}
	
	/* <!------  |    FIN Somme des Codebar Chargé d'un Client |   ---------> */
	
	
	
	
	/* -----------------------------------------------------------------------\*
						Somme des Codebar Déchargé d'un Client 
	\*------------------------------------------------------------------------ */
	
		@GetMapping("/clients/codebars/decharge/somme/{clientid}")
		public Long getClientCodebarDEChargeSommeQuantite(@PathVariable Long clientid) {	
			
			Long sommedecharge =  null;
			return sommedecharge = (Long) em
			.createQuery("select SUM(cdecharge) from Codebar c where c.client.clid=?1")
			.setParameter(1, clientid)
			.getSingleResult();   
		}
	
	/* <!------  |    FIN Somme des Codebar Déchargé d'un Client |   ---------> */
	
	
	
	
	/* -----------------------------------------------------------------------\*
						Somme des Codebar Récupéré d'un Client 
	\*------------------------------------------------------------------------ */
	
		@GetMapping("/clients/codebars/recupere/somme/{clientid}")
		public Long getClientCodebarRecupereSommeQuantite(@PathVariable Long clientid) {	
			
			Long sommerecupere =  null;
			return sommerecupere = (Long) em
			.createQuery("select SUM(crecupere) from Codebar c where c.client.clid=?1")
			.setParameter(1, clientid)
			.getSingleResult();   
		}
	
	/* <!------  |    FIN Somme des Codebar récupéré d'un Client |   ---------> */
		
	
	
	
		

}
