package com.testtask.ynp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnpInfo {
    @JsonProperty("vunp")
    private String unp;

    @JsonProperty("vnaimp")
    private String fullName;

    @JsonProperty("vpadres")
    private String address;

    @JsonProperty("dreg")
    private String registrationDate;

    @JsonProperty("ckodsost")
    private String statusCode;

    public String getUnp() {
        return unp;
    }

    public void setUnp(String unp) {
        this.unp = unp;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
