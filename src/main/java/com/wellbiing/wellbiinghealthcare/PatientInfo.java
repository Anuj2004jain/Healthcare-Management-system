package com.wellbiing.wellbiinghealthcare;

import java.sql.Date;

public class PatientInfo {
    int patientId;
    String patientName;
    String patientContact;
    Date patientLastVisit;

    public Date getPatientLastVisit() {
        return patientLastVisit;
    }

    public void setPatientLastVisit(Date patientLastVisit) {
        this.patientLastVisit = patientLastVisit;
    }

    public String getPatientName() {
        return patientName;
    }

    public PatientInfo(){
    }

    public PatientInfo(int patientId, String patientName, String patientContact, Date patientLastVisit) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientContact = patientContact;
        this.patientLastVisit = patientLastVisit;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(String patientContact) {
        this.patientContact = patientContact;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

}
