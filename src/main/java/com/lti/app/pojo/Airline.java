package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flightselect1")
public class Airline {
	@Id
	@Column(name="flightid")
	private String fid;
	@Column(name="flightname")
	private String fname;
	@Column(name="flightfrom")
	private String ffrom;
	@Column(name="flightto")
	private String fto;
	@Column(name="flightclass")
	private String fclass;
	@Column(name="flightprice")
	private String fprice;
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFfrom() {
		return ffrom;
	}
	public void setFfrom(String ffrom) {
		this.ffrom = ffrom;
	}
	public String getFto() {
		return fto;
	}
	public void setFto(String fto) {
		this.fto = fto;
	}
	public String getFclass() {
		return fclass;
	}
	public void setFclass(String fclass) {
		this.fclass = fclass;
	}
	public String getFprice() {
		return fprice;
	}
	public void setFprice(String fprice) {
		this.fprice = fprice;
	}
	@Override
	public String toString() {
		return "Airline [fid=" + fid + ", fname=" + fname + ", ffrom=" + ffrom + ", fto=" + fto + ", fclass=" + fclass
				+ ", fprice=" + fprice + "]";
	}
	public Airline(String fid, String fname, String ffrom, String fto, String fclass, String fprice) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.ffrom = ffrom;
		this.fto = fto;
		this.fclass = fclass;
		this.fprice = fprice;
	}
	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
