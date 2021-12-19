package gar.org.entites;

import java.util.Collection;

public class ColisReference {
	
	private Long rid;
    private String rgaredepart;
    private String rgarearrivee;
    private String rtrainnum;
    private String rexp;
    
    private String rdestnom;
    private String rdestprenom;
    private String rdesttel;
    
    private String rclnom;
    private String rclprenom;
    private String rcltel;
    private String rclcode;
    
    private Collection<Colis> colis;

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public String getRgaredepart() {
		return rgaredepart;
	}

	public void setRgaredepart(String rgaredepart) {
		this.rgaredepart = rgaredepart;
	}

	public String getRgarearrivee() {
		return rgarearrivee;
	}

	public void setRgarearrivee(String rgarearrivee) {
		this.rgarearrivee = rgarearrivee;
	}

	public String getRtrainnum() {
		return rtrainnum;
	}

	public void setRtrainnum(String rtrainnum) {
		this.rtrainnum = rtrainnum;
	}

	public String getRexp() {
		return rexp;
	}

	public void setRexp(String rexp) {
		this.rexp = rexp;
	}

	public String getRdestnom() {
		return rdestnom;
	}

	public void setRdestnom(String rdestnom) {
		this.rdestnom = rdestnom;
	}

	public String getRdestprenom() {
		return rdestprenom;
	}

	public void setRdestprenom(String rdestprenom) {
		this.rdestprenom = rdestprenom;
	}

	public String getRdesttel() {
		return rdesttel;
	}

	public void setRdesttel(String rdesttel) {
		this.rdesttel = rdesttel;
	}

	public String getRclnom() {
		return rclnom;
	}

	public void setRclnom(String rclnom) {
		this.rclnom = rclnom;
	}

	public String getRclprenom() {
		return rclprenom;
	}

	public void setRclprenom(String rclprenom) {
		this.rclprenom = rclprenom;
	}

	public String getRcltel() {
		return rcltel;
	}

	public void setRcltel(String rcltel) {
		this.rcltel = rcltel;
	}

	public String getRclcode() {
		return rclcode;
	}

	public void setRclcode(String rclcode) {
		this.rclcode = rclcode;
	}

	public Collection<Colis> getColis() {
		return colis;
	}

	public void setColis(Collection<Colis> colis) {
		this.colis = colis;
	}
    
    
   

}
