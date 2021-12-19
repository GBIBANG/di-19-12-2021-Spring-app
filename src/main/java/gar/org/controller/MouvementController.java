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
import gar.org.repository.CodebarRepository;
import gar.org.repository.ColisRepository;
import gar.org.repository.MouvementRepository;
import gar.org.repository.MouvementbRepository;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class MouvementController {
	
	@Autowired
	private CodebarRepository coder;
	
	@Autowired
	private MouvementRepository mouvr;
	
	@Autowired
	private MouvementbRepository mbr;

	String status;
	String mouvement_colis;
	
	
	@PostMapping("/mouvements/{cid}")
    public Mouvement ModifierMouvement(@PathVariable Long cid, @RequestBody Mouvement mouvement) {
		
		Codebar mycodebar = coder.findById(cid).orElse(null);
		LocalDate myObj = LocalDate.now();
		LocalDateTime myDateObj = LocalDateTime.now();
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter myFormatObjb = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String dateformate = myObj.format(myFormatObj);
		String datetimeformate = myDateObj.format(myFormatObjb);
		
		int mvar = 0;
		
		String codebar_designation = mycodebar.getCodebar();
		String rb_mmouvement = mouvement.getMmouvement();
		
		Mouvementb mymouv = mbr.findByMbmouv(rb_mmouvement);
		
		int myref_mouv =mymouv.getMref(); 
		int var_mouv = 3;
		
		
		Mouvement mynewmouv = mouvr.findByMcodebarAndMvar(codebar_designation, var_mouv);
		
			
			String rb_gare = mouvement.getMgare();
			int varstatus = 1;
			String mouvement_user = "BIBANG BI ENGOZOGHE";
			
			
			
			switch (myref_mouv) {
			  case 1:
			  	status ="Charge";
				mouvement_colis = "Chargement";
				mycodebar.setCcharge(varstatus);
				mvar = 1;
			    break;
			  case 2:
				status ="Decharge";
				mouvement_colis = "Stockage à L'arrivee";
				mycodebar.setCdecharge(varstatus);
				mvar = 2;
			    break;
			  case 3:
				 status ="Recupere";
				 mouvement_colis = "Remise au Client";
				mycodebar.setCrecupere(varstatus);
				mvar = 3;
			    break;
			}
			
			
			mycodebar.setCstatus(status);
			coder.save(mycodebar);
			
			Mouvement mymouvement = new Mouvement();
			mymouvement.setCodebar(mycodebar);
			mymouvement.setMvar(mvar);
			mymouvement.setMcodebar(codebar_designation);
			mymouvement.setMdate(datetimeformate);
			mymouvement.setMdateb(myObj);
			mymouvement.setMdatetime(datetimeformate);
			mymouvement.setMgare(rb_gare);
			mymouvement.setMmouvement(mouvement_colis);
			mymouvement.setMusercree(mouvement_user);
			mouvr.save(mymouvement);
			
			return mymouvement;
		
		
		
	}


}
