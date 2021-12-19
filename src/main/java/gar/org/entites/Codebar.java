package gar.org.entites;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="codebars")
public class Codebar implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cid;
	private String codebar; 
	private String cdate;  
	private LocalDate cdateb;
	private String cdatetime;
    private String cgaredepart; 
    private String cgarearrivee;
    private String ctrainnum; 
    private String cexpeditionnum; 
    private String cdestnom; 
    private String cdestprenom;
    private String cdestel;
    private String cdesignation; 
    
    private String cstatus;
    
    private int cstock;
	private int ccharge;
	private int cdecharge;
	private int crecupere;
	private String gps;

	@ManyToOne
	@JsonIgnore
	private Colis colis;
	
	@ManyToOne
	@JsonIgnore
	private Ticket ticket;
	
	@OneToMany(mappedBy="codebar")
	@JsonIgnore
	private Collection<Mouvement> mouvements;

	public Codebar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Codebar(String codebar, String cdate, LocalDate cdateb, String cdatetime, String cgaredepart,
			String cgarearrivee, String ctrainnum, String cexpeditionnum, String cdestnom, String cdestprenom,
			String cdestel, String cdesignation, String cstatus, int cstock, int ccharge, int cdecharge, int crecupere,
			String gps) {
		super();
		this.codebar = codebar;
		this.cdate = cdate;
		this.cdateb = cdateb;
		this.cdatetime = cdatetime;
		this.cgaredepart = cgaredepart;
		this.cgarearrivee = cgarearrivee;
		this.ctrainnum = ctrainnum;
		this.cexpeditionnum = cexpeditionnum;
		this.cdestnom = cdestnom;
		this.cdestprenom = cdestprenom;
		this.cdestel = cdestel;
		this.cdesignation = cdesignation;
		this.cstatus = cstatus;
		this.cstock = cstock;
		this.ccharge = ccharge;
		this.cdecharge = cdecharge;
		this.crecupere = crecupere;
		this.gps = gps;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCodebar() {
		return codebar;
	}

	public void setCodebar(String codebar) {
		this.codebar = codebar;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	public LocalDate getCdateb() {
		return cdateb;
	}

	public void setCdateb(LocalDate cdateb) {
		this.cdateb = cdateb;
	}

	public String getCdatetime() {
		return cdatetime;
	}

	public void setCdatetime(String cdatetime) {
		this.cdatetime = cdatetime;
	}

	public String getCgaredepart() {
		return cgaredepart;
	}

	public void setCgaredepart(String cgaredepart) {
		this.cgaredepart = cgaredepart;
	}

	public String getCgarearrivee() {
		return cgarearrivee;
	}

	public void setCgarearrivee(String cgarearrivee) {
		this.cgarearrivee = cgarearrivee;
	}

	public String getCtrainnum() {
		return ctrainnum;
	}

	public void setCtrainnum(String ctrainnum) {
		this.ctrainnum = ctrainnum;
	}

	public String getCexpeditionnum() {
		return cexpeditionnum;
	}

	public void setCexpeditionnum(String cexpeditionnum) {
		this.cexpeditionnum = cexpeditionnum;
	}

	public String getCdestnom() {
		return cdestnom;
	}

	public void setCdestnom(String cdestnom) {
		this.cdestnom = cdestnom;
	}

	public String getCdestprenom() {
		return cdestprenom;
	}

	public void setCdestprenom(String cdestprenom) {
		this.cdestprenom = cdestprenom;
	}

	public String getCdestel() {
		return cdestel;
	}

	public void setCdestel(String cdestel) {
		this.cdestel = cdestel;
	}

	public String getCdesignation() {
		return cdesignation;
	}

	public void setCdesignation(String cdesignation) {
		this.cdesignation = cdesignation;
	}

	public String getCstatus() {
		return cstatus;
	}

	public void setCstatus(String cstatus) {
		this.cstatus = cstatus;
	}

	public int getCstock() {
		return cstock;
	}

	public void setCstock(int cstock) {
		this.cstock = cstock;
	}

	public int getCcharge() {
		return ccharge;
	}

	public void setCcharge(int ccharge) {
		this.ccharge = ccharge;
	}

	public int getCdecharge() {
		return cdecharge;
	}

	public void setCdecharge(int cdecharge) {
		this.cdecharge = cdecharge;
	}

	public int getCrecupere() {
		return crecupere;
	}

	public void setCrecupere(int crecupere) {
		this.crecupere = crecupere;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public Colis getColis() {
		return colis;
	}

	public void setColis(Colis colis) {
		this.colis = colis;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Collection<Mouvement> getMouvements() {
		return mouvements;
	}

	public void setMouvements(Collection<Mouvement> mouvements) {
		this.mouvements = mouvements;
	}

	

	


}
