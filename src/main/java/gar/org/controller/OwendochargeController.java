package gar.org.controller;

import java.math.BigInteger;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gar.org.entites.Owendocharge;
import gar.org.entites.Owendostock;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class OwendochargeController {
	
	@Autowired
	private EntityManager em;
	
	@GetMapping("/codebars/nbre/colis/charge")
	public Owendocharge getOwendoCharge() {
		  
		String var_a ="OWENDO-LIBREVILLE";
		String var_b ="LASTOURVILLE";
		String var_c ="MOANDA";
		String var_d ="FRANCEVILLE";
		int var_charge = 1;
		
		BigInteger owc = null;
		owc = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_a)
        .setParameter(2, var_a)
        .setParameter(3, var_charge)
		.getSingleResult(); 
	
		BigInteger owc_last = null;
		owc_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_a)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger owc_mo = null;
		owc_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_a)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger owc_fr = null;
		owc_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_a)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger owc_total = null;
		owc_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.ccharge=?2")
		.setParameter(1, var_a)
		.setParameter(2, var_charge)
		.getSingleResult();
		
		BigInteger lastc = null;
		lastc = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger lastc_wo = null;
		lastc_wo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_a)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger lastc_mo = null;
		lastc_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger lastc_fr = null;
		lastc_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_b)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)		
		.getSingleResult(); 
		
		BigInteger lastc_total = null;
		lastc_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.ccharge=?2")
		.setParameter(1, var_b)
		.setParameter(2, var_charge)
		.getSingleResult();
		
	
		BigInteger moc = null;
		moc = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger moc_ow = null;
		moc_ow = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_a)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger moc_last = null;
		moc_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger moc_fr = null;
		moc_fr = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_c)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		
		BigInteger moc_total = null;
		moc_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.ccharge=?2")
		.setParameter(1, var_c)
		.setParameter(2, var_charge)		
		.getSingleResult();
		
		BigInteger frc = null;
		frc = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_d)
		.setParameter(3, var_charge)
		.getSingleResult();
		
		BigInteger frc_ow = null;
		frc_ow = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_a)
		.setParameter(3, var_charge)
		.getSingleResult(); 
		
		BigInteger frc_last = null;
		frc_last = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_b)
		.setParameter(3, var_charge)
		.getSingleResult();
		
		BigInteger frc_mo = null;
		frc_mo = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.cgarearrivee=?2 AND codebars.ccharge=?3")
		.setParameter(1, var_d)
		.setParameter(2, var_c)
		.setParameter(3, var_charge)
		.getSingleResult();
		
		BigInteger frc_total = null;
		frc_total = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.cgaredepart=?1 AND codebars.ccharge=?2")
		.setParameter(1, var_d)
		.setParameter(2, var_charge)
		.getSingleResult();
		
		BigInteger stock_totalc = null;
		stock_totalc = (BigInteger) em
		.createNativeQuery("select count(*) from codebars WHERE codebars.ccharge=?1")
		.setParameter(1, var_charge)		
		.getSingleResult();
		
		 return new Owendocharge(owc, owc_last, owc_mo, owc_fr, owc_total, lastc, lastc_wo, lastc_mo, lastc_fr, lastc_total, moc, moc_ow, moc_last, moc_fr, 
		 moc_total, frc, frc_ow, frc_last, frc_mo, frc_total, stock_totalc);
	}

}
