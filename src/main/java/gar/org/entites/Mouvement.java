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
@Table(name="mouvements")
public class Mouvement implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long mid;
	private String mmouvement; 
	private String mgare;
	private String mdate;
	private LocalDate mdateb;
	private String mdatetime;
	private String musercree;
	private String mcodebar; 
	private int mvar;
	
	
	
	@ManyToOne
	@JsonIgnore
	private Codebar codebar;



	public Mouvement() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Mouvement(String mmouvement, String mgare, String mdate, LocalDate mdateb, String mdatetime,
			String musercree, String mcodebar, int mvar) {
		super();
		this.mmouvement = mmouvement;
		this.mgare = mgare;
		this.mdate = mdate;
		this.mdateb = mdateb;
		this.mdatetime = mdatetime;
		this.musercree = musercree;
		this.mcodebar = mcodebar;
		this.mvar = mvar;
	}



	public Long getMid() {
		return mid;
	}



	public void setMid(Long mid) {
		this.mid = mid;
	}



	public String getMmouvement() {
		return mmouvement;
	}



	public void setMmouvement(String mmouvement) {
		this.mmouvement = mmouvement;
	}



	public String getMgare() {
		return mgare;
	}



	public void setMgare(String mgare) {
		this.mgare = mgare;
	}



	public String getMdate() {
		return mdate;
	}



	public void setMdate(String mdate) {
		this.mdate = mdate;
	}



	public LocalDate getMdateb() {
		return mdateb;
	}



	public void setMdateb(LocalDate mdateb) {
		this.mdateb = mdateb;
	}



	public String getMdatetime() {
		return mdatetime;
	}



	public void setMdatetime(String mdatetime) {
		this.mdatetime = mdatetime;
	}



	public String getMusercree() {
		return musercree;
	}



	public void setMusercree(String musercree) {
		this.musercree = musercree;
	}



	public String getMcodebar() {
		return mcodebar;
	}



	public void setMcodebar(String mcodebar) {
		this.mcodebar = mcodebar;
	}



	public int getMvar() {
		return mvar;
	}



	public void setMvar(int mvar) {
		this.mvar = mvar;
	}



	public Codebar getCodebar() {
		return codebar;
	}



	public void setCodebar(Codebar codebar) {
		this.codebar = codebar;
	}
	
	


	
	
	

}
