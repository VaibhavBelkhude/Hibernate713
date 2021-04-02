package com.nt.entity;

public class Customer {

	private int cno;
	private String cname;
	private String caddrs;
	private long phone;
	
	private String email;
	private String cproduct;
	public int getCno() {
		return cno;
	}
	public void setCno(int sno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddrs() {
		return caddrs;
	}
	public void setCaddrs(String caddrs) {
		this.caddrs = caddrs;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCproduct() {
		return cproduct;
	}
	public void setCproduct(String cproduct) {
		this.cproduct = cproduct;
	}
	@Override
	public String toString() {
		return "Actor [cno=" + cno + ", cname=" + cname + ", caddrs=" + caddrs + ", phone=" + phone + ", email=" + email
				+ ", cproduct=" + cproduct + "]";
	}
	
	
	
}

