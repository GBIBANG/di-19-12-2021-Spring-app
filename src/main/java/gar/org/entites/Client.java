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
@Table(name="clients")
public class Client implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long clid;
	private String clcode;
    private String clnom;
    private String clprenom;
    private String cltel;
    private String clautre;
    private String cldtcreation;
    private String cldate;
    private LocalDate cldateb;
    private String clusercree;
   
    
    @OneToMany(mappedBy="client")
	private Collection<Ticket> tickets;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String clcode, String clnom, String clprenom, String cltel, String clautre, String cldtcreation,
			String cldate, LocalDate cldateb, String clusercree) {
		super();
		this.clcode = clcode;
		this.clnom = clnom;
		this.clprenom = clprenom;
		this.cltel = cltel;
		this.clautre = clautre;
		this.cldtcreation = cldtcreation;
		this.cldate = cldate;
		this.cldateb = cldateb;
		this.clusercree = clusercree;
	}

	public Long getClid() {
		return clid;
	}

	public void setClid(Long clid) {
		this.clid = clid;
	}

	public String getClcode() {
		return clcode;
	}

	public void setClcode(String clcode) {
		this.clcode = clcode;
	}

	public String getClnom() {
		return clnom;
	}

	public void setClnom(String clnom) {
		this.clnom = clnom;
	}

	public String getClprenom() {
		return clprenom;
	}

	public void setClprenom(String clprenom) {
		this.clprenom = clprenom;
	}

	public String getCltel() {
		return cltel;
	}

	public void setCltel(String cltel) {
		this.cltel = cltel;
	}

	public String getClautre() {
		return clautre;
	}

	public void setClautre(String clautre) {
		this.clautre = clautre;
	}

	public String getCldtcreation() {
		return cldtcreation;
	}

	public void setCldtcreation(String cldtcreation) {
		this.cldtcreation = cldtcreation;
	}

	public String getCldate() {
		return cldate;
	}

	public void setCldate(String cldate) {
		this.cldate = cldate;
	}

	public LocalDate getCldateb() {
		return cldateb;
	}

	public void setCldateb(LocalDate cldateb) {
		this.cldateb = cldateb;
	}

	public String getClusercree() {
		return clusercree;
	}

	public void setClusercree(String clusercree) {
		this.clusercree = clusercree;
	}

	public Collection<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(Collection<Ticket> tickets) {
		this.tickets = tickets;
	}

	
    
    
	

}
