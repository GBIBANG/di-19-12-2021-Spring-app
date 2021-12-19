package gar.org.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mouvementbs")
public class Mouvementb {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long mbid;
	private String mbmouv;
	private int mref;
	
	
	public Mouvementb() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Mouvementb(String mbmouv, int mref) {
		super();
		this.mbmouv = mbmouv;
		this.mref = mref;
	}




	public Long getMbid() {
		return mbid;
	}


	public void setMbid(Long mbid) {
		this.mbid = mbid;
	}


	public String getMbmouv() {
		return mbmouv;
	}


	public void setMbmouv(String mbmouv) {
		this.mbmouv = mbmouv;
	}


	public int getMref() {
		return mref;
	}


	public void setMref(int mref) {
		this.mref = mref;
	}
	
	


	
	
	

}
