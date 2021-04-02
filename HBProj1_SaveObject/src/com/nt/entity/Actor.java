package com.nt.entity;

public class Actor {

	private int actorId;
	private String actorName;
	private String actorAddrs;
	private String phone;
	private float enumeration;
	
	//getter setter method
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActorAddrs() {
		return actorAddrs;
	}
	public void setActorAddrs(String actorAddrs) {
		this.actorAddrs = actorAddrs;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public float getEnumeration() {
		return enumeration;
	}
	public void setEnumeration(float enumeration) {
		this.enumeration = enumeration;
	}
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorAddrs=" + actorAddrs + ", phone=" + phone
				+ ", enumeration=" + enumeration + "]";
	}
	
}

