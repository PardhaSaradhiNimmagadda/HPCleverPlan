package com.pojo;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
@ManagedBean
public class UserView {
     
    private String firstname;
    private String hp_email;
   private String organization;
    private String managers_hp_email;
    private String lastname;
    private String managers_name;
    private String business_justification_for_access_request;
    private String designation;
 
    public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getHp_email() {
		return hp_email;
	}

	public void setHp_email(String hp_email) {
		this.hp_email = hp_email;
	}

	

	public String getManagers_hp_email() {
		return managers_hp_email;
	}

	public void setManagers_hp_email(String managers_hp_email) {
		this.managers_hp_email = managers_hp_email;
	}

	public String getManagers_name() {
		return managers_name;
	}

	public void setManagers_name(String managers_name) {
		this.managers_name = managers_name;
	}

	public String getBusiness_justification_for_access_request() {
		return business_justification_for_access_request;
	}

	public void setBusiness_justification_for_access_request(
			String business_justification_for_access_request) {
		this.business_justification_for_access_request = business_justification_for_access_request;
	}

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
 
    public void save() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Welcome " + firstname + " " + lastname + " " +hp_email + " " + 
        managers_hp_email + " " + managers_name + " " +organization + " " + business_justification_for_access_request + " " 
                		+ designation));
    }

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
}