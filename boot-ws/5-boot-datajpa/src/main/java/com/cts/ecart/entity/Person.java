package com.cts.ecart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	private String personName;
	private String personAddrInfo;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAddrInfo() {
		return personAddrInfo;
	}
	public void setPersonAddrInfo(String personAddrInfo) {
		this.personAddrInfo = personAddrInfo;
	}
	
	
	

}
