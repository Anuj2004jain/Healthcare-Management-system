package com.wellbiing.wellbiinghealthcare;

import java.util.Date;

public class TreatmentInfo {
    String patientName;
    int treatmentCode;
    String treatmentCost;
    String treatmentDesc;
    String treatmentType;
    Date treatmentSDate;
    Date treatmentEDate;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getTreatmentCode() {
        return treatmentCode;
    }

    public void setTreatmentCode(int treatmentCode) {
        this.treatmentCode = treatmentCode;
    }

    public String getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(String treatmentCost) {
        this.treatmentCost = treatmentCost;
    }

    public String getTreatmentDesc() {
        return treatmentDesc;
    }

    public void setTreatmentDesc(String treatmentDesc) {
        this.treatmentDesc = treatmentDesc;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public Date getTreatmentSDate() {
        return treatmentSDate;
    }

    public void setTreatmentSDate(Date treatmentSDate) {
        this.treatmentSDate = treatmentSDate;
    }

    public Date getTreatmentEDate() {
        return treatmentEDate;
    }

    public void setTreatmentEDate(Date treatmentEDate) {
        this.treatmentEDate = treatmentEDate;
    }

    public TreatmentInfo(String patientName, int medicationCode, String medicationCost, String medicationDesc, String medicationType, Date medicationSDate, Date medicationEDate) {
        this.patientName = patientName;
        this.treatmentCode = medicationCode;
        this.treatmentCost = medicationCost;
        this.treatmentDesc = medicationDesc;
        this.treatmentType = medicationType;
        this.treatmentSDate = medicationSDate;
        this.treatmentEDate = medicationEDate;
    }

    public TreatmentInfo( int medicationCode, String medicationCost, String medicationDesc, String medicationType, Date medicationSDate, Date medicationEDate) {
        this.treatmentCode = medicationCode;
        this.treatmentCost = medicationCost;
        this.treatmentDesc = medicationDesc;
        this.treatmentType = medicationType;
        this.treatmentSDate = medicationSDate;
        this.treatmentEDate = medicationEDate;
    }
}

