package com.trial.gradle_demo.model;

public class Claim {

    private Long claimId;
    private String claimType;
    private int customerId;

    public Claim() {
    }

    public Claim(Long claimId, String claimType, int customerId ) {
        this.claimId = claimId;
        this.claimType = claimType;
        this.customerId = customerId;
    }

    public Long getClaimId() {
        return claimId;
    }

    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", claimType='" + claimType +
                ", customerId=" + customerId +
                '}';
    }
}
