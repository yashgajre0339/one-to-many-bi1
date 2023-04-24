package com.jsp.TestBankBranch;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Branch {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private int id;
private String location;
private String IFSCcode;
@ManyToOne
private Bank bank;

public Bank getBank() {
	return bank;
}
public void setBank(Bank bank) {
	this.bank = bank;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getIFSCcode() {
	return IFSCcode;
}
public void setIFSCcode(String iFSCcode) {
	IFSCcode = iFSCcode;
}
}


