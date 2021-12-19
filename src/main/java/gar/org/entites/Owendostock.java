package gar.org.entites;

import java.math.BigInteger;

public class Owendostock {
	
	private BigInteger ow;
	private BigInteger ow_last;
	private BigInteger ow_mo;
	private BigInteger ow_fr;
	private BigInteger ow_total;
	
	private BigInteger last;
	private BigInteger last_wo;
	private BigInteger last_mo;
	private BigInteger last_fr;
	private BigInteger last_total;
	private BigInteger mo;
	private BigInteger mo_ow;
	private BigInteger mo_last;
	private BigInteger mo_fr;
	private BigInteger mo_total;
	
	private BigInteger fr;
	private BigInteger fr_ow;
	private BigInteger fr_last;
	private BigInteger fr_mo;
	private BigInteger fr_total;
	private BigInteger stock_total;
	
	
	public Owendostock(BigInteger ow, BigInteger ow_last, BigInteger ow_mo, BigInteger ow_fr, BigInteger ow_total,
			BigInteger last, BigInteger last_wo, BigInteger last_mo, BigInteger last_fr, BigInteger last_total,
			BigInteger mo, BigInteger mo_ow, BigInteger mo_last, BigInteger mo_fr, BigInteger mo_total, BigInteger fr,
			BigInteger fr_ow, BigInteger fr_last, BigInteger fr_mo, BigInteger fr_total, BigInteger stock_total) {
		super();
		this.ow = ow;
		this.ow_last = ow_last;
		this.ow_mo = ow_mo;
		this.ow_fr = ow_fr;
		this.ow_total = ow_total;
		this.last = last;
		this.last_wo = last_wo;
		this.last_mo = last_mo;
		this.last_fr = last_fr;
		this.last_total = last_total;
		this.mo = mo;
		this.mo_ow = mo_ow;
		this.mo_last = mo_last;
		this.mo_fr = mo_fr;
		this.mo_total = mo_total;
		this.fr = fr;
		this.fr_ow = fr_ow;
		this.fr_last = fr_last;
		this.fr_mo = fr_mo;
		this.fr_total = fr_total;
		this.stock_total = stock_total;
	}
	public BigInteger getOw() {
		return ow;
	}
	public void setOw(BigInteger ow) {
		this.ow = ow;
	}
	public BigInteger getOw_last() {
		return ow_last;
	}
	public void setOw_last(BigInteger ow_last) {
		this.ow_last = ow_last;
	}
	public BigInteger getOw_mo() {
		return ow_mo;
	}
	public void setOw_mo(BigInteger ow_mo) {
		this.ow_mo = ow_mo;
	}
	public BigInteger getOw_fr() {
		return ow_fr;
	}
	public void setOw_fr(BigInteger ow_fr) {
		this.ow_fr = ow_fr;
	}
	public BigInteger getOw_total() {
		return ow_total;
	}
	public void setOw_total(BigInteger ow_total) {
		this.ow_total = ow_total;
	}
	public BigInteger getLast() {
		return last;
	}
	public void setLast(BigInteger last) {
		this.last = last;
	}
	public BigInteger getLast_wo() {
		return last_wo;
	}
	public void setLast_wo(BigInteger last_wo) {
		this.last_wo = last_wo;
	}
	public BigInteger getLast_mo() {
		return last_mo;
	}
	public void setLast_mo(BigInteger last_mo) {
		this.last_mo = last_mo;
	}
	public BigInteger getLast_fr() {
		return last_fr;
	}
	public void setLast_fr(BigInteger last_fr) {
		this.last_fr = last_fr;
	}
	public BigInteger getLast_total() {
		return last_total;
	}
	public void setLast_total(BigInteger last_total) {
		this.last_total = last_total;
	}
	public BigInteger getMo() {
		return mo;
	}
	public void setMo(BigInteger mo) {
		this.mo = mo;
	}
	public BigInteger getMo_ow() {
		return mo_ow;
	}
	public void setMo_ow(BigInteger mo_ow) {
		this.mo_ow = mo_ow;
	}
	public BigInteger getMo_last() {
		return mo_last;
	}
	public void setMo_last(BigInteger mo_last) {
		this.mo_last = mo_last;
	}
	public BigInteger getMo_fr() {
		return mo_fr;
	}
	public void setMo_fr(BigInteger mo_fr) {
		this.mo_fr = mo_fr;
	}
	public BigInteger getMo_total() {
		return mo_total;
	}
	public void setMo_total(BigInteger mo_total) {
		this.mo_total = mo_total;
	}
	public BigInteger getFr() {
		return fr;
	}
	public void setFr(BigInteger fr) {
		this.fr = fr;
	}
	public BigInteger getFr_ow() {
		return fr_ow;
	}
	public void setFr_ow(BigInteger fr_ow) {
		this.fr_ow = fr_ow;
	}
	public BigInteger getFr_last() {
		return fr_last;
	}
	public void setFr_last(BigInteger fr_last) {
		this.fr_last = fr_last;
	}
	public BigInteger getFr_mo() {
		return fr_mo;
	}
	public void setFr_mo(BigInteger fr_mo) {
		this.fr_mo = fr_mo;
	}
	public BigInteger getFr_total() {
		return fr_total;
	}
	public void setFr_total(BigInteger fr_total) {
		this.fr_total = fr_total;
	}
	public BigInteger getStock_total() {
		return stock_total;
	}
	public void setStock_total(BigInteger stock_total) {
		this.stock_total = stock_total;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
