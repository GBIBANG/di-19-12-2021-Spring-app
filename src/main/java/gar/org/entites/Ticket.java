package gar.org.entites;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tickets")
public class Ticket implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long tid;
	private String texp;
	private String tclnom;
	private String tclprenom;
	private String tcltel;
	private int tsomme;
	private String tdate;  
	private LocalDate tdateb;
	private String tdatetime;
	private String tgdepart;
	private String tgarrivee;
	
	
	@OneToMany(mappedBy="ticket")
	@JsonIgnore
	private Collection<Codebar> codebars;
	
	
	@OneToMany(mappedBy="ticket")
	@JsonIgnore
	private Collection<Colis> colises;
	
	@ManyToOne
	@JsonIgnore
	private Client client;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(String texp, String tclnom, String tclprenom, String tcltel, int tsomme, String tdate,
			LocalDate tdateb, String tdatetime, String tgdepart, String tgarrivee) {
		super();
		this.texp = texp;
		this.tclnom = tclnom;
		this.tclprenom = tclprenom;
		this.tcltel = tcltel;
		this.tsomme = tsomme;
		this.tdate = tdate;
		this.tdateb = tdateb;
		this.tdatetime = tdatetime;
		this.tgdepart = tgdepart;
		this.tgarrivee = tgarrivee;
	}

	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getTexp() {
		return texp;
	}

	public void setTexp(String texp) {
		this.texp = texp;
	}

	public String getTclnom() {
		return tclnom;
	}

	public void setTclnom(String tclnom) {
		this.tclnom = tclnom;
	}

	public String getTclprenom() {
		return tclprenom;
	}

	public void setTclprenom(String tclprenom) {
		this.tclprenom = tclprenom;
	}

	public String getTcltel() {
		return tcltel;
	}

	public void setTcltel(String tcltel) {
		this.tcltel = tcltel;
	}

	public int getTsomme() {
		return tsomme;
	}

	public void setTsomme(int tsomme) {
		this.tsomme = tsomme;
	}

	public String getTdate() {
		return tdate;
	}

	public void setTdate(String tdate) {
		this.tdate = tdate;
	}

	public LocalDate getTdateb() {
		return tdateb;
	}

	public void setTdateb(LocalDate tdateb) {
		this.tdateb = tdateb;
	}

	public String getTdatetime() {
		return tdatetime;
	}

	public void setTdatetime(String tdatetime) {
		this.tdatetime = tdatetime;
	}

	public String getTgdepart() {
		return tgdepart;
	}

	public void setTgdepart(String tgdepart) {
		this.tgdepart = tgdepart;
	}

	public String getTgarrivee() {
		return tgarrivee;
	}

	public void setTgarrivee(String tgarrivee) {
		this.tgarrivee = tgarrivee;
	}

	public Collection<Codebar> getCodebars() {
		return codebars;
	}

	public void setCodebars(Collection<Codebar> codebars) {
		this.codebars = codebars;
	}

	public Collection<Colis> getColises() {
		return colises;
	}

	public void setColises(Collection<Colis> colises) {
		this.colises = colises;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	

	

}
