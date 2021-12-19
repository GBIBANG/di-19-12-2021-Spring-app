package gar.org.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gar.org.entites.Gare;
import gar.org.entites.Mouvement;
import gar.org.repository.ClientRepository;
import gar.org.repository.GareRepository;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class GareController {
	
	@Autowired
	private GareRepository gr;
	
	@PostMapping("/gares/add")
	public Gare AjouterGare(@RequestBody Gare gare) {
		
		LocalDate myObj = LocalDate.now();
		LocalDateTime myDateObj = LocalDateTime.now();
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter myFormatObjb = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String dateformate = myObj.format(myFormatObj);
		String datetimeformate = myDateObj.format(myFormatObjb);
		
		String rb_gnom = gare.getGnom();
		String rb_gautre = "NULL";
		String rb_gusercree = "ADMIN";
		String rb_gref = gare.getGref();
		int rb_gnbre = gare.getGnbre();
		
		Gare mygare = new Gare();
		
		mygare.setGautre(rb_gautre);
		mygare.setGdate(dateformate);
		mygare.setGdateb(myObj);
		mygare.setGdtcreation(datetimeformate);
		mygare.setGnbre(rb_gnbre);
		mygare.setGnom(rb_gnom);
		mygare.setGref(rb_gref);
		mygare.setGusercree(rb_gusercree);
		gr.save(mygare);
		
		
		return mygare;
	}

}
