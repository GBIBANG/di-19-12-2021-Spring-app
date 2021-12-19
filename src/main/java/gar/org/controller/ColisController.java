package gar.org.controller;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.math.BigInteger;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gar.org.entites.Client;
import gar.org.entites.Codebar;
import gar.org.entites.Colis;
import gar.org.entites.ColisReference;
import gar.org.entites.Gare;
import gar.org.entites.Mouvement;
import gar.org.entites.Ticket;
import gar.org.repository.ClientRepository;
import gar.org.repository.CodebarRepository;
import gar.org.repository.ColisRepository;
import gar.org.repository.GareRepository;
import gar.org.repository.MouvementRepository;
import gar.org.repository.TicketRepository;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class ColisController {
	
	@Autowired
	private ClientRepository clr;
	
	@Autowired
	private CodebarRepository codebarr;

	@Autowired
	private ColisRepository cr;
	
	@Autowired
	private TicketRepository tr;
	
	@Autowired
	private GareRepository gref;
	
	@Autowired
	private MouvementRepository mr;
	
	@Autowired
	private EntityManager em;
	
	private String datetimeformate;
	private String dateformate;
	
	private int varstock = 1;
	private int varsuivis = 0;
	
	private String status = "Stockage Départ";
	private String co_user_name = "EKOMI TEED Armande";
	private String tiret = "-";
	
	
	/* ------------------------------------------------------------\*
					Ajouter des Colis au Client
	\*------------------------------------------------------------ */
	
	@PostMapping("/colis")
	public Ticket AjouterColisTicket(@RequestBody ColisReference colisref) {
		
		List <Colis> colis = null;
		colis = (List<Colis>) colisref.getColis();
		
		LocalDate myObj = LocalDate.now();
		LocalDateTime myDateObj = LocalDateTime.now();
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter myFormatObjb = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		dateformate = myObj.format(myFormatObj);
		datetimeformate = myDateObj.format(myFormatObjb);
		
		int somme_a = 0;
		
		for(int k=0; k<colis.size(); k++) {
			
			somme_a = somme_a + colis.get(k).getConombre();
		}
		
		String rb_clnom = colisref.getRclnom();
		String rb_clprenom = colisref.getRclprenom();
		String rb_cltel = colisref.getRcltel();
		String rb_clcode = colisref.getRclcode();
		
		String rb_destnom = colisref.getRdestnom();
		String rb_destprenom = colisref.getRdestprenom();
		String rb_desttel = colisref.getRdesttel();
		
		String rb_gare_depart = colisref.getRgaredepart();
		String rb_gare_arrivve = colisref.getRgarearrivee();
		String rb_train_num = colisref.getRtrainnum();
		String rb_exp = colisref.getRexp();
		
		Client client = clr.findByClcode(rb_clcode);
		
		Ticket ticket = new Ticket();
		ticket.setClient(client);
		ticket.setTclnom(rb_clnom);
		ticket.setTclprenom(rb_clprenom);
		ticket.setTcltel(rb_cltel);
		ticket.setTdate(dateformate);
		ticket.setTdateb(myObj);
		ticket.setTdatetime(datetimeformate);
		ticket.setTexp(rb_exp);
		ticket.setTsomme(somme_a);
		ticket.setTgdepart(rb_gare_depart);
		ticket.setTgarrivee(rb_gare_arrivve);
		tr.save(ticket);
				
		for(int i=0; i<colis.size(); i++) {
			
			Colis colisb = new Colis();
						
			String co_status = status;
			String co_designation = colis.get(i).getCodesignation();
			String co_famille = colis.get(i).getCofamille();
			int colinombre = colis.get(i).getConombre();
			Gare gdepart = gref.findByGnom(rb_gare_depart);
			Gare garrive = gref.findByGnom(rb_gare_arrivve);
						
			String gdepart_ref = gdepart.getGref();
			String garrive_ref = garrive.getGref();
						
			colisb.setCodesignation(co_designation);
			colisb.setCofamille(co_famille);
			colisb.setConombre(colinombre);
			colisb.setCodesttel(rb_desttel);
			colisb.setCogaredepart(rb_gare_depart);
			colisb.setCogarearrivee(rb_gare_arrivve);
			colisb.setCotrainnum(rb_train_num);
			colisb.setCoexpeditionnum(rb_exp);
			colisb.setCodestnom(rb_destnom);
			colisb.setCodestprenom(rb_destprenom);
			colisb.setCousercree(co_user_name);
			colisb.setCodate(dateformate);
			colisb.setCodateb(myObj);
			colisb.setCodatetime(datetimeformate);
			colisb.setTicket(ticket);
						
			cr.save(colisb);
			Long colisbtid = colisb.getCoid();
			for(int j=0; j<colinombre; j++) {
							
				Codebar mycodebar = new Codebar();
				String code2 = dateformate;
				String code1 = gdepart_ref;
				int code6 = j+1;
				String code3 = garrive_ref;
				String code4 = code1+code2+code3+tiret+colisbtid+code6;
					
				mycodebar.setColis(colisb);
				mycodebar.setCdesignation(co_designation);
				mycodebar.setCdestnom(rb_destnom);
				mycodebar.setCdestprenom(rb_destprenom);
				mycodebar.setCdestel(rb_desttel);
				mycodebar.setCexpeditionnum(rb_exp);
				mycodebar.setCgaredepart(rb_gare_depart);
				mycodebar.setCgarearrivee(rb_gare_arrivve);
				mycodebar.setCstatus(co_status);
				mycodebar.setCtrainnum(rb_train_num);
				mycodebar.setCdate(dateformate);
				mycodebar.setCdateb(myObj);
				mycodebar.setCdatetime(datetimeformate);
				mycodebar.setCstock(varstock);
				mycodebar.setCcharge(varsuivis);
				mycodebar.setCdecharge(varsuivis);
				mycodebar.setCrecupere(varsuivis);
				mycodebar.setCodebar(code4);
				mycodebar.setTicket(ticket);
							
				codebarr.save(mycodebar);
				
				Mouvement mymouv = new Mouvement();
				mymouv.setCodebar(mycodebar);
				mymouv.setMcodebar(code4);
				mymouv.setMdateb(myObj);
				mymouv.setMdatetime(datetimeformate);
				mymouv.setMdate(dateformate);
				mymouv.setMgare(rb_gare_depart);
				mymouv.setMmouvement(status);
				mymouv.setMusercree(co_user_name);
				mr.save(mymouv);
							
			}			
					
		}
				
		return ticket;
	
	
	}
	
	
	
	
}
