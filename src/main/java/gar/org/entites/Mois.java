package gar.org.entites;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mois")
public class Mois {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long mid;
	private String mnom; 
	private int mnum;
	private LocalDate mdebut;
	private LocalDate mfin;
	public Mois() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mois(String mnom, int mnum, LocalDate mdebut, LocalDate mfin) {
		super();
		this.mnom = mnom;
		this.mnum = mnum;
		this.mdebut = mdebut;
		this.mfin = mfin;
	}
	public Long getMid() {
		return mid;
	}
	public void setMid(Long mid) {
		this.mid = mid;
	}
	public String getMnom() {
		return mnom;
	}
	public void setMnom(String mnom) {
		this.mnom = mnom;
	}
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	public LocalDate getMdebut() {
		return mdebut;
	}
	public void setMdebut(LocalDate mdebut) {
		this.mdebut = mdebut;
	}
	public LocalDate getMfin() {
		return mfin;
	}
	public void setMfin(LocalDate mfin) {
		this.mfin = mfin;
	}
	
	
	

}
