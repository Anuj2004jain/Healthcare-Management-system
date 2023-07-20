package com.wellbiing.wellbiinghealthcare;

import java.util.Date;

public class LabInfo {
    String patientName;
    int labCode;
    String labCost;
    String labDesc;
    String labType;
    Date labDate;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getLabCode() {
        return labCode;
    }

    public void setLabCode(int labCode) {
        this.labCode = labCode;
    }

    public String getLabCost() {
        return labCost;
    }

    public void setLabCost(String labCost) {
        this.labCost = labCost;
    }

    public String getLabDesc() {
        return labDesc;
    }

    public void setLabDesc(String labDesc) {
        this.labDesc = labDesc;
    }

    public String getLabType() {
        return labType;
    }

    public void setLabType(String labType) {
        this.labType = labType;
    }

    public Date getLabDate() {
        return labDate;
    }

    public void setLabDate(Date labDate) {
        this.labDate = labDate;
    }

    public LabInfo(String patientName, int labCode, String labCost, String labDesc, String labType, Date labDate) {
        this.patientName = patientName;
        this.labCode = labCode;
        this.labCost = labCost;
        this.labDesc = labDesc;
        this.labType = labType;
        this.labDate = labDate;
    }

    public LabInfo( int labCode, String labCost, String labDesc, String labType, Date labDate) {

        this.labCode = labCode;
        this.labCost = labCost;
        this.labDesc = labDesc;
        this.labType = labType;
        this.labDate = labDate;
    }
}
