package com.caresoft.clinicapp;

import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser{
    private ArrayList<String> patientNotes;
    
    public Physician(Integer id) {
    	super(id);
    }
    
    public boolean assignPin(int pin) {
    	String pinToString = String.valueOf(pin);
    	if (pinToString.length() == 4) {
    		this.setPin(pin);
    		return true;
    	}
    	return false;
    }
	
	public boolean accessAuthorized(Integer confirmedAuthID) {
		return this.id.equals(confirmedAuthID);
	}
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters
    public ArrayList<String> getPatientNotes() {
    	return this.patientNotes;
    }
    
    public void setPatientNotes(ArrayList<String> patientNotes) {
    	this.patientNotes = patientNotes;
    }

}
