package com.wellbiing.wellbiinghealthcare;

import java.sql.Date;

public class AllergyInfo {
    String patientName;
    int allergyCode;
    String allergyName;
    String allergyDesc;
    Date allergyDate;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAllergyCode() {
        return allergyCode;
    }

    public void setAllergyCode(int allergyCode) {
        this.allergyCode = allergyCode;
    }

    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public String getAllergyDesc() {
        return allergyDesc;
    }

    public void setAllergyDesc(String allergyDesc) {
        this.allergyDesc = allergyDesc;
    }

    public Date getAllergyDate() {
        return allergyDate;
    }

    public void setAllergyDate(Date allergyDate) {
        this.allergyDate = allergyDate;
    }

    public AllergyInfo(String patientName, int allergyCode, String allergyName, String allergyDesc, Date allergyDate) {
        this.patientName = patientName;
        this.allergyCode = allergyCode;
        this.allergyName = allergyName;
        this.allergyDesc = allergyDesc;
        this.allergyDate = allergyDate;
    }
}
