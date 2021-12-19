package gar.org.controller;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import gar.org.entites.Administrateur;
import gar.org.entites.Codebar;
import gar.org.entites.Colis;
import gar.org.entites.Mouvement;
import gar.org.entites.Ticket;
import gar.org.repository.ClientRepository;
import gar.org.repository.CodebarRepository;
import gar.org.repository.ColisRepository;
import gar.org.repository.MouvementRepository;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class CodebarController {
	
	@Autowired
	private CodebarRepository coder;
	
	@Autowired
	private ColisRepository cor;
	
	@Autowired
	private MouvementRepository mouvr;
	
	@Autowired
	private ClientRepository cr;
	
	@Autowired
	private EntityManager em;
	
	private String status ="Stocke";
	private String var_status = "Charge";
	
	private String var_statusb = "Decharge";
	private int nbre_decharge;
	private int final_decharge;
	
	private String var_statusc = "Recupere";
	private int nbre_recupere;
	private int final_recupere;
	
	
	@GetMapping("/mycodebars")
	public List <Codebar> getCodebarsALL() {	
		
		List <Codebar> codebars = null;
		return codebars = coder.findByOrderByCidDesc(); 
	}
	
	
	@GetMapping("/codebars/charge")
	public List <Codebar> getEquipementSortieListb() {	
		
		List <Codebar> codebars = null;
		return codebars = em
	              .createNativeQuery("select * from codebars where cstatus ='charge'", Codebar.class)
	              .getResultList();
	}
	
	@GetMapping("/codebars/decharge")
	public List <Codebar> getEquipementSortieListc() {	
		
		List <Codebar> codebars = null;
		return codebars = em
	              .createNativeQuery("select * from codebars where cstatus ='decharge'", Codebar.class)
	              .getResultList();
	}
	
	@DeleteMapping("/codebars/{codeid}")
	public Map<String, Boolean> deleteCodebar(@PathVariable Long codeid){
		
		Codebar mycodebar = coder.findById(codeid).orElse(null);
		Colis mycolis = mycodebar.getColis();
		int quant = mycolis.getConombre();
		int quantb = quant-1;
		if(quantb==0) {
			
			cor.delete(mycolis);
		}
		else {
			
			mycolis.setConombre(quantb);
			cor.save(mycolis);
		}
		
		coder.delete(mycodebar);
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
		
	}
	
	
	
	
	
	@GetMapping("/codebars/decharge/{cid}")
	public Codebar getCodebarDechargement(@PathVariable Long cid) {	
		
		Codebar mycodebar = coder.findById(cid).orElse(null);
		
		nbre_decharge = mycodebar.getCdecharge();
		final_decharge = nbre_decharge + 1;
		mycodebar.setCdecharge(final_decharge);
		mycodebar.setCstatus(var_statusb);
		coder.save(mycodebar);
		
		
		return mycodebar;
	}
	
	
	
	
	@GetMapping("/codebars/recupere/{cid}")
	public Codebar getCodebarRecupere(@PathVariable Long cid) {	
		
		Codebar mycodebar = coder.findById(cid).orElse(null);
		
		nbre_recupere = mycodebar.getCrecupere();
		final_recupere = nbre_recupere + 1;
		mycodebar.setCrecupere(final_recupere);
		mycodebar.setCstatus(var_statusc);
		coder.save(mycodebar);
		return mycodebar;
	}

}
