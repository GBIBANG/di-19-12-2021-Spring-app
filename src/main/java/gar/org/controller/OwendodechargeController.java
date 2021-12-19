package gar.org.controller;

import java.math.BigInteger;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gar.org.entites.Owendocharge;
import gar.org.entites.Owendodecharge;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class OwendodechargeController {
	
	@Autowired
	private EntityManager em;
	
	@GetMapping("/codebars/nbre/colis/decharge")
	public Owendodecharge getOwendoDecharge() {
		  
		String var_a ="OWENDO-LIBREVILLE";
		String var_b ="LASTOURVILLE";
		String var_c ="MOANDA";
		String var_d ="FRANCEVILLE";
		int var_charge = 1;
		
		BigInteger owd = null;
		owd = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_a)
        .setParameter(2, var_a)
        .setParameter(3, var_charge)
		.getSingleResult(); 
	
		BigInteger owd_last = null;
		owd_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_a)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger owd_mo = null;
		owd_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_a)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger owd_fr = null;
		owd_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_a)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger owd_total = null;
		owd_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cdecharge=?2")
		.setParameter(1, var_a)
		.setParameter(2, var_charge)
		.getSingleResult();
		
		BigInteger lastd = null;
		lastd = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger lastd_wo = null;
		lastd_wo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_a)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger lastd_mo = null;
		lastd_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger lastd_fr = null;
		lastd_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)		
		.getSingleResult(); 
		
		BigInteger lastd_total = null;
		lastd_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cdecharge=?2")
		.setParameter(1, var_b)
		.setParameter(2, var_charge)
		.getSingleResult();
		
	
		BigInteger mod = null;
		mod = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger mod_ow = null;
		mod_ow = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_a)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger mod_last = null;
		mod_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger mod_fr = null;
		mod_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger mod_total = null;
		mod_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cdecharge=?2")
		.setParameter(1, var_c)
		.setParameter(2, var_charge)		
		.getSingleResult();
		
		BigInteger frd = null;
		frd = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)
		.getSingleResult();
		
		BigInteger frd_ow = null;
		frd_ow = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_a)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger frd_last = null;
		frd_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult();
		
		BigInteger frd_mo = null;
		frd_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.cdecharge=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult();
		
		BigInteger frd_total = null;
		frd_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cdecharge=?2")
		.setParameter(1, var_d)
		.setParameter(2, var_charge)
		.getSingleResult();
		
		BigInteger stock_totald = null;
		stock_totald = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cdecharge=?1")
		.setParameter(1, var_charge)		
		.getSingleResult();
		
		 return new Owendodecharge(owd, owd_last, owd_mo, owd_fr, owd_total, lastd, lastd_wo, lastd_mo, lastd_fr, lastd_total, mod, mod_ow, mod_last, mod_fr, 
		 mod_total, frd, frd_ow, frd_last, frd_mo, frd_total, stock_totald);
	}

}
