package com.pojo;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
@ManagedBean
public class UserProfile {
private String firstname;
private String lastname;
private String hp_email;
private String designation;
private String managers_name;
private String managers_hp_email;


public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getHp_email() {
	return hp_email;
}
public void setHp_email(String hp_email) {
	this.hp_email = hp_email;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getManagers_name() {
	return managers_name;
}
public void setManagers_name(String managers_name) {
	this.managers_name = managers_name;
}
public String getManagers_hp_email() {
	return managers_hp_email;
}
public void setManagers_hp_email(String managers_hp_email) {
	this.managers_hp_email = managers_hp_email;
}

public void save() {
    FacesContext.getCurrentInstance().addMessage(null,
            new FacesMessage("Welcome " + firstname + " " + lastname + " " +hp_email + " " + 
    managers_hp_email + " " + managers_name + " " + managers_hp_email));
}
}
