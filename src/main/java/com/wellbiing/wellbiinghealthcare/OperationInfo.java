package com.wellbiing.wellbiinghealthcare;

//import java.sql.Date;
import java.util.Date;
public class OperationInfo {
    String patientName;
    int opCode;
    String opCost;
    String opDesc;
    String opType;
    Date opDate;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getOpCode() {
        return opCode;
    }

    public void setOpCode(int opCode) {
        this.opCode = opCode;
    }

    public String getOpCost() {
        return opCost;
    }

    public void setOpCost(String opCost) {
        this.opCost = opCost;
    }

    public String getOpDesc() {
        return opDesc;
    }

    public void setOpDesc(String opDesc) {
        this.opDesc = opDesc;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    public OperationInfo(String patientName, int opCode, String opCost, String opDesc, String opType, Date opDate) {
        this.patientName = patientName;
        this.opCode = opCode;
        this.opCost = opCost;
        this.opDesc = opDesc;
        this.opType = opType;
        this.opDate = opDate;
    }

    public OperationInfo( int opCode, String opCost, String opDesc, String opType, Date opDate) {
        this.opCode = opCode;
        this.opCost = opCost;
        this.opDesc = opDesc;
        this.opType = opType;
        this.opDate = opDate;
    }
}
