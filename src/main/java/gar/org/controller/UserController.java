
package gar.org.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gar.org.entites.Client;
import gar.org.entites.Ticket;
import gar.org.entites.Utilisateur;
import gar.org.repository.ClientRepository;
import gar.org.repository.TicketRepository;
import gar.org.repository.UserRepository;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private UserRepository userr;
	
	@Autowired
	private EntityManager em;
	
	@PostMapping("/auth")
    public Utilisateur UserAuth(@RequestBody Utilisateur user) {
		
		String rb_username = user.getUsername();
		String rb_password = user.getPassword();
		String rb_ugare = user.getUgare();
		
		Utilisateur myuser = userr.findByUsername(rb_username);
		
		if(myuser ==null) {
			
			throw new RuntimeException("Identification Incorrecte");
		}
		
		else {
			
			return myuser;
		}
	
	}
	
	
	
	
	
	@PostMapping("/users/add")
    public Utilisateur UserAuthAjouter(@RequestBody Utilisateur user) {
		
		LocalDate myObj = LocalDate.now();
		LocalDateTime myDateObj = LocalDateTime.now();
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter myFormatObjb = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String dateformate = myObj.format(myFormatObj);
		String datetimeformate = myDateObj.format(myFormatObjb);
		
		String rb_username = user.getUsername();
		String rb_password = user.getPassword();
		String rb_gare = "OWENDO-LIBREVILLE";
		String rb_unom = "EKOMI TEED";
		String rb_uprenom = "Armande";
		String rb_usercree = "ADMIN";
		
		Utilisateur myuser = new Utilisateur();
		
		myuser.setPassword(rb_password);
		myuser.setUdate(dateformate);
		myuser.setUdateb(myObj);
		myuser.setUdatetime(datetimeformate);
		myuser.setUgare(rb_gare);
		myuser.setUnom(rb_unom);
		myuser.setUprenom(rb_uprenom);
		myuser.setUsername(rb_username);
		myuser.setUusercree(rb_usercree);
		userr.save(myuser);
		
		return myuser;
		
	
	}

}
