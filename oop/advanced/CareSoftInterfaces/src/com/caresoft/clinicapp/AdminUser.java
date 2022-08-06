package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin{  
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id, String role) {
    	super(id);
    	this.role = role;
    	this.securityIncidents = new ArrayList<String>();
    }
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {
    	String pinToString = String.valueOf(pin);
    	if (pinToString.length() == 6) {
    		this.setPin(pin);
    		return true;
    	}
    	return false;
    }
    
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.id.equals(confirmedAuthID)) {
			return true;
		} else {
			
			this.authIncident();
			return false;
		}
	}
    
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    public ArrayList<String> reportSecurityIncidents() {
    	return this.securityIncidents;
    }
    
    // TO DO: Setters & Getters
    // Getters
    public Integer getEmployeeID() {
    	return this.employeeID;
    }
    
    public String getRole() {
    	return this.role;
    }
    
    public ArrayList<String> getSecurityIncidents() {
    	return this.securityIncidents;
    }

    // Setters
    public void setEmployeeID(Integer employeeID) {
    	this.employeeID = employeeID;
    }
    
    public void setRole(String role) {
    	this.role = role;
    }
    
    public void setSecurityIncidents(ArrayList<String> securityIncidents) {
    	this.securityIncidents = securityIncidents;
    }
}
