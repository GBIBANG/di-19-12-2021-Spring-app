

package gar.org.controller;

import java.math.BigInteger;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gar.org.entites.Owendostock;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class OwendostockController {
	
	
	@Autowired
	private EntityManager em;
	
	@GetMapping("/codebars/nbre/colis/stock")
	public Owendostock getOwendostock() {
		  
		String var_a ="OWENDO-LIBREVILLE";
		String var_b ="LASTOURVILLE";
		String var_c ="MOANDA";
		String var_d ="FRANCEVILLE";
		
		BigInteger ow = null;
		ow = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_a)
        .setParameter(2, var_a)
		.getSingleResult(); 
		
		BigInteger ow_last = null;
		ow_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_a)
        .setParameter(2, var_b)
		.getSingleResult(); 
		
		
		BigInteger ow_mo = null;
		ow_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_a)
        .setParameter(2, var_c)
		.getSingleResult(); 
		
		
		BigInteger ow_fr = null;
		ow_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_a)
        .setParameter(2, var_d)
		.getSingleResult(); 
		
		BigInteger ow_total = null;
		ow_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1")
		.setParameter(1, var_a)
		.getSingleResult();
		
		BigInteger last = null;
		last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_b)
        .setParameter(2, var_b)
		.getSingleResult(); 
		
		BigInteger last_wo = null;
		last_wo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_b)
        .setParameter(2, var_a)
		.getSingleResult(); 
		
		BigInteger last_mo = null;
		last_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_b)
        .setParameter(2, var_c)
		.getSingleResult(); 
		
		BigInteger last_fr = null;
		last_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_b)
        .setParameter(2, var_d)
		.getSingleResult(); 
		
		BigInteger last_total = null;
		last_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1")
		.setParameter(1, var_b)
		.getSingleResult();
		
	
		BigInteger mo = null;
		mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_c)
        .setParameter(2, var_c)
		.getSingleResult(); 
		
		BigInteger mo_ow = null;
		mo_ow = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_c)
        .setParameter(2, var_a)
		.getSingleResult(); 
		
		BigInteger mo_last = null;
		mo_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_c)
        .setParameter(2, var_b)
		.getSingleResult(); 
		
		
		BigInteger mo_fr = null;
		mo_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_c)
        .setParameter(2, var_d)
		.getSingleResult(); 
		
		
		BigInteger mo_total = null;
		mo_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1")
		.setParameter(1, var_c)
		.getSingleResult();
		
		BigInteger fr = null;
		fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_d)
        .setParameter(2, var_d)
		.getSingleResult();
		
		BigInteger fr_ow = null;
		fr_ow = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_d)
        .setParameter(2, var_a)
		.getSingleResult(); 
		
		BigInteger fr_last = null;
		fr_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_d)
        .setParameter(2, var_b)
		.getSingleResult();
		
		BigInteger fr_mo = null;
		fr_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2")
		.setParameter(1, var_d)
        .setParameter(2, var_c)
		.getSingleResult();
		
		BigInteger fr_total = null;
		fr_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1")
		.setParameter(1, var_d)
		.getSingleResult();
		
		BigInteger stock_total = null;
		stock_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars")
		.getSingleResult();
		
	
	    return new Owendostock(ow, ow_last, ow_mo, ow_fr, ow_total, last, last_wo, last_mo, last_fr, last_total, mo, mo_ow, mo_last, mo_fr, 
	    mo_total, fr, fr_ow, fr_last, fr_mo, fr_total, stock_total);
	}

}
