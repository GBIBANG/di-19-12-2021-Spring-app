package gar.org.entites;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="gares")
public class Gare implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long gid;
    private String gnom;
    private String gautre;
    private String gdtcreation;
    private String gdate;
    private LocalDate gdateb;
    private String gusercree;
    private String gref;
    private int gnbre;
    
	public Gare() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gare(String gnom, String gautre, String gdtcreation, String gdate, LocalDate gdateb, String gusercree,
			String gref, int gnbre) {
		super();
		this.gnom = gnom;
		this.gautre = gautre;
		this.gdtcreation = gdtcreation;
		this.gdate = gdate;
		this.gdateb = gdateb;
		this.gusercree = gusercree;
		this.gref = gref;
		this.gnbre = gnbre;
	}

	public Long getGid() {
		return gid;
	}

	public void setGid(Long gid) {
		this.gid = gid;
	}

	public String getGnom() {
		return gnom;
	}

	public void setGnom(String gnom) {
		this.gnom = gnom;
	}

	public String getGautre() {
		return gautre;
	}

	public void setGautre(String gautre) {
		this.gautre = gautre;
	}

	public String getGdtcreation() {
		return gdtcreation;
	}

	public void setGdtcreation(String gdtcreation) {
		this.gdtcreation = gdtcreation;
	}

	public String getGdate() {
		return gdate;
	}

	public void setGdate(String gdate) {
		this.gdate = gdate;
	}

	public LocalDate getGdateb() {
		return gdateb;
	}

	public void setGdateb(LocalDate gdateb) {
		this.gdateb = gdateb;
	}

	public String getGusercree() {
		return gusercree;
	}

	public void setGusercree(String gusercree) {
		this.gusercree = gusercree;
	}

	public String getGref() {
		return gref;
	}

	public void setGref(String gref) {
		this.gref = gref;
	}

	public int getGnbre() {
		return gnbre;
	}

	public void setGnbre(int gnbre) {
		this.gnbre = gnbre;
	}
    
	
	
	


}
