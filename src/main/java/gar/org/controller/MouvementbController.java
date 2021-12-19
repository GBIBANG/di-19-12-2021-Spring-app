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

import gar.org.entites.Codebar;
import gar.org.entites.Mouvement;
import gar.org.entites.Mouvementb;
import gar.org.repository.MouvementbRepository;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class MouvementbController {
	
	@Autowired
	private MouvementbRepository mbr;
	
	
	@PostMapping("/mouvementbs/add")
    public Mouvementb AjouterMouvementb(@RequestBody Mouvementb mouv) {
		
		String rb_mbmouv = 	mouv.getMbmouv();
		int rb_mref = mouv.getMref();
		
		Mouvementb mymouv = new Mouvementb();
		mymouv.setMbmouv(rb_mbmouv);
		mymouv.setMref(rb_mref);
		mbr.save(mymouv);
		
		return mymouv;	
		
	}

}
