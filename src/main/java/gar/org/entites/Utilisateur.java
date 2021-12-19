package gar.org.entites;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long uid;
	private String username;
    private String password;
    private String ugare;
    private String unom;
    private String uprenom;
    private String udate;
    private LocalDate udateb;
    private String udatetime;
    private String uusercree;
    
    
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Utilisateur(String username, String password, String ugare, String unom, String uprenom, String udate,
			LocalDate udateb, String udatetime, String uusercree) {
		super();
		this.username = username;
		this.password = password;
		this.ugare = ugare;
		this.unom = unom;
		this.uprenom = uprenom;
		this.udate = udate;
		this.udateb = udateb;
		this.udatetime = udatetime;
		this.uusercree = uusercree;
	}


	public Long getUid() {
		return uid;
	}


	public void setUid(Long uid) {
		this.uid = uid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUgare() {
		return ugare;
	}


	public void setUgare(String ugare) {
		this.ugare = ugare;
	}


	public String getUnom() {
		return unom;
	}


	public void setUnom(String unom) {
		this.unom = unom;
	}


	public String getUprenom() {
		return uprenom;
	}


	public void setUprenom(String uprenom) {
		this.uprenom = uprenom;
	}


	public String getUdate() {
		return udate;
	}


	public void setUdate(String udate) {
		this.udate = udate;
	}


	public LocalDate getUdateb() {
		return udateb;
	}


	public void setUdateb(LocalDate udateb) {
		this.udateb = udateb;
	}


	public String getUdatetime() {
		return udatetime;
	}


	public void setUdatetime(String udatetime) {
		this.udatetime = udatetime;
	}


	public String getUusercree() {
		return uusercree;
	}


	public void setUusercree(String uusercree) {
		this.uusercree = uusercree;
	}
	
	
	
    
    
	
    
	
    
    
    

}
