

package gar.org.controller;

import java.math.BigInteger;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gar.org.entites.Owendodecharge;
import gar.org.entites.Owendorecupere;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class OwendorecupereController {
	
	@Autowired
	private EntityManager em;
	
	@GetMapping("/codebars/nbre/colis/recupere")
	public Owendorecupere getOwendoRecupere() {
		  
		String var_a ="OWENDO-LIBREVILLE";
		String var_b ="LASTOURVILLE";
		String var_c ="MOANDA";
		String var_d ="FRANCEVILLE";
		int var_charge = 1;
		
		BigInteger owr = null;
		owr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_a)
        .setParameter(2, var_a)
        .setParameter(3, var_charge)
		.getSingleResult(); 
	
		BigInteger owr_last = null;
		owr_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_a)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger owr_mo = null;
		owr_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_a)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger owr_fr = null;
		owr_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_a)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger owr_total = null;
		owr_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.crecupere=?2")
		.setParameter(1, var_a)
		.setParameter(2, var_charge)
		.getSingleResult();
		
		BigInteger lastr = null;
		lastr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger lastr_wo = null;
		lastr_wo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_a)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger lastr_mo = null;
		lastr_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger lastr_fr = null;
		lastr_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)		
		.getSingleResult(); 
		
		BigInteger lastr_total = null;
		lastr_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.crecupere=?2")
		.setParameter(1, var_b)
		.setParameter(2, var_charge)
		.getSingleResult();
		
	
		BigInteger mor = null;
		mor = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger mor_ow = null;
		mor_ow = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_a)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger mor_last = null;
		mor_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger mor_fr = null;
		mor_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger mor_total = null;
		mor_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.crecupere=?2")
		.setParameter(1, var_c)
		.setParameter(2, var_charge)		
		.getSingleResult();
		
		BigInteger frr = null;
		frr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)
		.getSingleResult();
		
		BigInteger frr_ow = null;
		frr_ow = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_a)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger frr_last = null;
		frr_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult();
		
		BigInteger frr_mo = null;
		frr_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.crecupere=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult();
		
		BigInteger frr_total = null;
		frr_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.crecupere=?2")
		.setParameter(1, var_d)
		.setParameter(2, var_charge)
		.getSingleResult();
		
		BigInteger stock_totalr = null;
		stock_totalr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.crecupere=?1")
		.setParameter(1, var_charge)		
		.getSingleResult();
		
		 return new Owendorecupere(owr, owr_last, owr_mo, owr_fr, owr_total, lastr, lastr_wo, lastr_mo, lastr_fr, lastr_total, mor, mor_ow, mor_last, mor_fr, 
		 mor_total, frr, frr_ow, frr_last, frr_mo, frr_total, stock_totalr);
	}


}
