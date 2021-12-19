package gar.org.controller;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;

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
import gar.org.entites.RechercheRef;
import gar.org.repository.ClientRepository;
import gar.org.repository.CodebarRepository;
import gar.org.repository.ColisRepository;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class CodebarControllerB {
	
	@Autowired
	private CodebarRepository coder;
	
	@Autowired
	private ColisRepository cor;
	
	@Autowired
	private ClientRepository cr;
	
	@Autowired
	private EntityManager em;
	
	
	
	
	@PostMapping("/codebars/recherche")
	public List <Codebar> getCodeRecherche(@RequestBody RechercheRef reref) {	
		
		String date1 = reref.getDtdebut();
		String date2 = reref.getDtfin();
		
		List <Codebar> codebars = null;
		
		
		return codebars = em
	              .createNativeQuery("SELECT * FROM codebars WHERE codebars.cdateb BETWEEN ?1 AND ?2", Codebar.class)
	              .setParameter(1, date1)
	  	          .setParameter(2, date2)
	              .getResultList();
	}
	
	
	@PostMapping("/codebars/recherche/nbre")
	public BigInteger getNbreCodebarRecherche(@RequestBody RechercheRef reref) {	
		
		String date1 = reref.getDtdebut();
		String date2 = reref.getDtfin();
		BigInteger result = null;
		return result = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cdateb BETWEEN ?1 AND ?2")
		.setParameter(1, date1)
        .setParameter(2, date2)
		.getSingleResult();  
	}
	
	
	
	/* --------------------------------------------------------------------\*
					Liste des 30 Derniers Colis
	\*--------------------------------------------------------------------- */
	
		@GetMapping("/codebars/dernier/limit")
		public List <Codebar> getCodebarLimit() {	
			
			List <Codebar> codebars = null;
			return codebars = em
		              .createNativeQuery("SELECT * FROM codebars ORDER BY cdateb DESC LIMIT 0 , 30", Codebar.class)
		              .getResultList();
		}
	
	/* <!------  |    FIN Liste des 30 Derniers Colis  |   ---------> */
	
	
	
	
	/* -----------------------------------------------------------------------\*
						Nombre de Codebars en Septembre
	\*------------------------------------------------------------------------ */
	
		@GetMapping("/codebars/nbre/septembre")
		public BigInteger getNbreCodebarSeptembre() {	
			
			String date="2021-10-01";
			String dateb ="2021-10-31";
			BigInteger result = null;
			return result = (BigInteger) em
			.createNativeQuery("select count(*) from codebars WHERE codebars.cdateb BETWEEN ?1 AND ?2")
	        .setParameter(1, date)
	        .setParameter(2, dateb)
			.getSingleResult();  
		}
	
	/* <!------  |    FIN Nombre de Codebars en Septembre  |   ---------> */
	
	
	
	
	/* -----------------------------------------------------------------------\*
							Nombre de Codebars en Octobre 
	\*------------------------------------------------------------------------ */
	
		@GetMapping("/codebars/nbre/octobre")
		public BigInteger getCodebarReq() {	
			
			String date="2021-10-01";
			String dateb ="2021-10-31";
			
			BigInteger result = null;
			return result = (BigInteger) em
			.createNativeQuery("select count(*) from codebars WHERE codebars.c_dateb BETWEEN ?1 AND ?2")
			.setParameter(1, date)
	        .setParameter(2, dateb)
			.getSingleResult();  
		}
	
	/* <!------  |    FIN Nombre de Codebars en Octobre  |   ---------> */

	
		
		
	/* -----------------------------------------------------------------\*
							Nombre de Codebars 
	\*----------------------------------------------------------------- */
		
		@GetMapping("/codebars/nbre")
		public BigInteger getClientsNbre() {	
			
			BigInteger result = null;
			return result = (BigInteger) em
			.createNativeQuery("select count(*) from codebars")
			.getSingleResult();   
		}
	
	/* <!------  |    FIN Nombre de Codebars  |   ---------> */
	
		
	/* -----------------------------------------------------------------------------\*
						Nombre de Codebars stocké en OWENDO-LASTOURVILLE
	\*------------------------------------------------------------------------------ */
		
	
		@GetMapping("/codebars/nbre/ow-last")
		public BigInteger getCodebarsNbreOWLAST() {
			
			String var_a ="OWENDO-LIBREVILLE";
			String var_b ="LASTOURVILLE";
			
			BigInteger result = null;
			return result = (BigInteger) em
			.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
			.setParameter(1, var_a)
	        .setParameter(2, var_b)
			.getSingleResult();   
		}
		
    /* <!------  |    FIN Nombre de Codebars stocké en OWENDO-LASTOURVILLE |   ---------> */
		
		
	/* -----------------------------------------------------------------------------\*
							Nombre de Codebars stocké en OWENDO-MOANDA
	\*------------------------------------------------------------------------------ */	
		
		@GetMapping("/codebars/nbre/ow-mo")
		public BigInteger getCodebarsNbreOWMO() {
			
			String var_a ="OWENDO-LIBREVILLE";
			String var_b ="MOANDA";
			
			BigInteger result = null;
			return result = (BigInteger) em
			.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
			.setParameter(1, var_a)
	        .setParameter(2, var_b)
			.getSingleResult();   
		}
		
		/* <!------  |    FIN Nombre de Codebars stocké en OWENDO-MOANDA |   ---------> */	
		
	
		
		
		
		
		
		

	/* -----------------------------------------------------------------------\*
						Somme des Codebar Recupere 
	\*------------------------------------------------------------------------ */
		
		
		@GetMapping("/codebars/recupere/somme")
		public Long getCodebarRecupereSomme() {	
			
			Long sommestock =  null;
			return sommestock = (Long) em
			.createQuery("select SUM(crecupere) from Codebar c")
			.getSingleResult();   
		}
		
		
	/* <!------  |    FIN Somme des Codebar Recupere |   ---------> */
	
		
		
		
		
		
		
		


}
