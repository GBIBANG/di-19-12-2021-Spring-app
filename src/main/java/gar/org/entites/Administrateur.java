package gar.org.entites;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="administrateurs")
public class Administrateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long aid;
	private String asername;
    private String password;
    private String acode;
    private String anom;
    private String aprenom;
    private String adate;
    private LocalDate adateb;
    private String adatetime;
    private String ausercree;
    
    
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Administrateur(String asername, String password, String acode, String anom, String aprenom, String adate,
			LocalDate adateb, String adatetime, String ausercree) {
		super();
		this.asername = asername;
		this.password = password;
		this.acode = acode;
		this.anom = anom;
		this.aprenom = aprenom;
		this.adate = adate;
		this.adateb = adateb;
		this.adatetime = adatetime;
		this.ausercree = ausercree;
	}


	public Long getAid() {
		return aid;
	}


	public void setAid(Long aid) {
		this.aid = aid;
	}


	public String getAsername() {
		return asername;
	}


	public void setAsername(String asername) {
		this.asername = asername;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAcode() {
		return acode;
	}


	public void setAcode(String acode) {
		this.acode = acode;
	}


	public String getAnom() {
		return anom;
	}


	public void setAnom(String anom) {
		this.anom = anom;
	}


	public String getAprenom() {
		return aprenom;
	}


	public void setAprenom(String aprenom) {
		this.aprenom = aprenom;
	}


	public String getAdate() {
		return adate;
	}


	public void setAdate(String adate) {
		this.adate = adate;
	}


	public LocalDate getAdateb() {
		return adateb;
	}


	public void setAdateb(LocalDate adateb) {
		this.adateb = adateb;
	}


	public String getAdatetime() {
		return adatetime;
	}


	public void setAdatetime(String adatetime) {
		this.adatetime = adatetime;
	}


	public String getAusercree() {
		return ausercree;
	}


	public void setAusercree(String ausercree) {
		this.ausercree = ausercree;
	}
	
	
    
  
    
	
	
    
    

}
