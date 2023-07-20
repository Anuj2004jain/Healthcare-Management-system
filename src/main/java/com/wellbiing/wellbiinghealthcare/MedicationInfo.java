package com.wellbiing.wellbiinghealthcare;

import java.util.Date;

public class MedicationInfo {
    String patientName;
    int medicationCode;
    String medicationCost;
    String medicationDesc;
    String medicationType;
    Date medicationSDate;
    Date medicationEDate;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getMedicationCode() {
        return medicationCode;
    }

    public void setMedicationCode(int medicationCode) {
        this.medicationCode = medicationCode;
    }

    public String getMedicationCost() {
        return medicationCost;
    }

    public void setMedicationCost(String medicationCost) {
        this.medicationCost = medicationCost;
    }

    public String getMedicationDesc() {
        return medicationDesc;
    }

    public void setMedicationDesc(String medicationDesc) {
        this.medicationDesc = medicationDesc;
    }

    public String getMedicationType() {
        return medicationType;
    }

    public void setMedicationType(String medicationType) {
        this.medicationType = medicationType;
    }

    public Date getMedicationSDate() {
        return medicationSDate;
    }

    public void setMedicationSDate(Date medicationSDate) {
        this.medicationSDate = medicationSDate;
    }

    public Date getMedicationEDate() {
        return medicationEDate;
    }

    public void setMedicationEDate(Date medicationEDate) {
        this.medicationEDate = medicationEDate;
    }

    public MedicationInfo(String patientName, int medicationCode, String medicationCost, String medicationDesc, String medicationType, Date medicationSDate, Date medicationEDate) {
        this.patientName = patientName;
        this.medicationCode = medicationCode;
        this.medicationCost = medicationCost;
        this.medicationDesc = medicationDesc;
        this.medicationType = medicationType;
        this.medicationSDate = medicationSDate;
        this.medicationEDate = medicationEDate;
    }

    public MedicationInfo( int medicationCode, String medicationCost, String medicationDesc, String medicationType, Date medicationSDate, Date medicationEDate) {
        this.medicationCode = medicationCode;
        this.medicationCost = medicationCost;
        this.medicationDesc = medicationDesc;
        this.medicationType = medicationType;
        this.medicationSDate = medicationSDate;
        this.medicationEDate = medicationEDate;
    }
}
