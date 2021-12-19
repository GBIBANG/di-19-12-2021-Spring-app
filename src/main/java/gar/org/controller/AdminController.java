package gar.org.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gar.org.entites.Administrateur;
import gar.org.entites.Utilisateur;
import gar.org.repository.AdministrateurRepository;
import gar.org.repository.UserRepository;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class AdminController {
	
	@Autowired
	private AdministrateurRepository ar;
	
	@Autowired
	private EntityManager em;
	
	
	
	@PostMapping("/admin")
    public Administrateur AdminAuth(@RequestBody Administrateur admin) {
		
		String rb_admin_code = admin.getAcode();
		String rb_admin_username = admin.getAsername();
		String rb_admin_pass = admin.getPassword();
		
		Administrateur myadmin = ar.findByAsernameAndPasswordAndAcode(rb_admin_username, rb_admin_pass, rb_admin_code);
		
		if(myadmin ==null) {
			
			throw new RuntimeException("Identification Incorrecte");
		}
		
		else {
			
			return myadmin;
		}
	
	}
	
	@PostMapping("/admins/add")
    public Administrateur AdminAjout(@RequestBody Administrateur admin) {
		
		LocalDate myObj = LocalDate.now();
		LocalDateTime myDateObj = LocalDateTime.now();
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter myFormatObjb = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String dateformate = myObj.format(myFormatObj);
		String datetimeformate = myDateObj.format(myFormatObjb);
		
		
		String rb_admin_code = "G99";
		String rb_admin_pass = admin.getPassword();
		String rb_anon = "BIBANG BI ENGOZOGHE";
		String rb_aprenom = "Garcin";
		String rb_username = "gadmin";
		String rb_usercree = "ADMIN";
		
		Administrateur myadmin = new Administrateur();
		
		myadmin.setAcode(rb_admin_code);
		myadmin.setAdate(dateformate);
		myadmin.setAdateb(myObj);
		myadmin.setAdatetime(datetimeformate);
		myadmin.setAnom(rb_anon);
		myadmin.setAprenom(rb_aprenom);
		myadmin.setAsername(rb_username);
		myadmin.setAusercree(rb_usercree);
		myadmin.setPassword(rb_admin_pass);
		ar.save(myadmin);
		return myadmin;
	
	}

}
