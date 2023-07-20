package com.wellbiing.wellbiinghealthcare;

import java.util.Date;

public class VitalsInfo {
    String patientName;
    float temperature;
    float bloodPressure;
    float heartRate;
    float breathingRate;
    Date testDate;
    float spO2;

    public VitalsInfo(String patientName, float temperature, float bloodPressure, float heartRate, float breathingRate, Date testDate, float spO2) {
        this.patientName = patientName;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.breathingRate = breathingRate;
        this.testDate = testDate;
        this.spO2 = spO2;
    }

    public float getTemperature() {
        return temperature;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getBreathingRate() {
        return breathingRate;
    }

    public void setBreathingRate(float breathingRate) {
        this.breathingRate = breathingRate;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public float getSpO2() {
        return spO2;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setSpO2(float spO2) {
        this.spO2 = spO2;
    }

    public VitalsInfo(float temperature, float bloodPressure, float heartRate, float breathingRate, Date testDate, float spO2) {
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.breathingRate = breathingRate;
        this.testDate = testDate;
        this.spO2 = spO2;
    }


}
