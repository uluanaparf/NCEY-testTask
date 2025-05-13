package com.testtask.ynp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnpInfoResponse {
    @JsonProperty("row")
    private UnpInfo row;

    public UnpInfo getRow() {
        return row;
    }

    public void setRow(UnpInfo row) {
        this.row = row;
    }
}
