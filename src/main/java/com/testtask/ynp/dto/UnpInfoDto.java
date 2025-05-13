package com.testtask.ynp.dto;

public class UnpInfoDto {
    private String unp;
    private String fullName;
    private String address;
    private String registrationDate;
    private String status; // человекочитаемый текст

    public UnpInfoDto(String unp, String fullName, String address, String registrationDate, String status) {
        this.unp = unp;
        this.fullName = fullName;
        this.address = address;
        this.registrationDate = registrationDate;
        this.status = status;
    }

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

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
