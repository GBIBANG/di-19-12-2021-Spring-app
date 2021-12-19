package gar.org.entites;

public class RechercheRef {
	
	private Long reid;
    private String dtdebut;
    private String dtfin;
    
    
	public RechercheRef() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RechercheRef(Long reid, String dtdebut, String dtfin) {
		super();
		this.reid = reid;
		this.dtdebut = dtdebut;
		this.dtfin = dtfin;
	}


	public Long getReid() {
		return reid;
	}


	public void setReid(Long reid) {
		this.reid = reid;
	}


	public String getDtdebut() {
		return dtdebut;
	}


	public void setDtdebut(String dtdebut) {
		this.dtdebut = dtdebut;
	}


	public String getDtfin() {
		return dtfin;
	}


	public void setDtfin(String dtfin) {
		this.dtfin = dtfin;
	}
	
	
    
    

}
