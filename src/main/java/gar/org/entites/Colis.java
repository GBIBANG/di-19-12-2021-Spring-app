
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
@Table(name="colises")
public class Colis implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long coid;
    private String codesignation; 
    private int conombre; 
    private String cofamille;  
    private String codesttel;
    
    private String codate;
    private LocalDate codateb;
    private String codatetime;
    private String cogaredepart; 
    private String cogarearrivee; 
    private String cotrainnum; 
    private String coexpeditionnum; 
    private String codestnom;
    private String codestprenom;
    private String cousercree;
    
    @OneToMany(mappedBy="colis")
	private Collection<Codebar> codebars;
   
    
	@ManyToOne
	@JsonIgnore
	private Ticket ticket;


	public Colis() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Colis(String codesignation, int conombre, String cofamille, String codesttel, String codate,
			LocalDate codateb, String codatetime, String cogaredepart, String cogarearrivee, String cotrainnum,
			String coexpeditionnum, String codestnom, String codestprenom, String cousercree) {
		super();
		this.codesignation = codesignation;
		this.conombre = conombre;
		this.cofamille = cofamille;
		this.codesttel = codesttel;
		this.codate = codate;
		this.codateb = codateb;
		this.codatetime = codatetime;
		this.cogaredepart = cogaredepart;
		this.cogarearrivee = cogarearrivee;
		this.cotrainnum = cotrainnum;
		this.coexpeditionnum = coexpeditionnum;
		this.codestnom = codestnom;
		this.codestprenom = codestprenom;
		this.cousercree = cousercree;
	}


	public Long getCoid() {
		return coid;
	}


	public void setCoid(Long coid) {
		this.coid = coid;
	}


	public String getCodesignation() {
		return codesignation;
	}


	public void setCodesignation(String codesignation) {
		this.codesignation = codesignation;
	}


	public int getConombre() {
		return conombre;
	}


	public void setConombre(int conombre) {
		this.conombre = conombre;
	}


	public String getCofamille() {
		return cofamille;
	}


	public void setCofamille(String cofamille) {
		this.cofamille = cofamille;
	}


	public String getCodesttel() {
		return codesttel;
	}


	public void setCodesttel(String codesttel) {
		this.codesttel = codesttel;
	}


	public String getCodate() {
		return codate;
	}


	public void setCodate(String codate) {
		this.codate = codate;
	}


	public LocalDate getCodateb() {
		return codateb;
	}


	public void setCodateb(LocalDate codateb) {
		this.codateb = codateb;
	}


	public String getCodatetime() {
		return codatetime;
	}


	public void setCodatetime(String codatetime) {
		this.codatetime = codatetime;
	}


	public String getCogaredepart() {
		return cogaredepart;
	}


	public void setCogaredepart(String cogaredepart) {
		this.cogaredepart = cogaredepart;
	}


	public String getCogarearrivee() {
		return cogarearrivee;
	}


	public void setCogarearrivee(String cogarearrivee) {
		this.cogarearrivee = cogarearrivee;
	}


	public String getCotrainnum() {
		return cotrainnum;
	}


	public void setCotrainnum(String cotrainnum) {
		this.cotrainnum = cotrainnum;
	}


	public String getCoexpeditionnum() {
		return coexpeditionnum;
	}


	public void setCoexpeditionnum(String coexpeditionnum) {
		this.coexpeditionnum = coexpeditionnum;
	}


	public String getCodestnom() {
		return codestnom;
	}


	public void setCodestnom(String codestnom) {
		this.codestnom = codestnom;
	}


	public String getCodestprenom() {
		return codestprenom;
	}


	public void setCodestprenom(String codestprenom) {
		this.codestprenom = codestprenom;
	}


	public String getCousercree() {
		return cousercree;
	}


	public void setCousercree(String cousercree) {
		this.cousercree = cousercree;
	}


	public Collection<Codebar> getCodebars() {
		return codebars;
	}


	public void setCodebars(Collection<Codebar> codebars) {
		this.codebars = codebars;
	}


	public Ticket getTicket() {
		return ticket;
	}


	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	
	
	

}
