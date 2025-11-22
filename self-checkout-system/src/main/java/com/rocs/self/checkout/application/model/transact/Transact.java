package com.rocs.self.checkout.application.model.transact;

public class Transact {
    private String customerId;
    private String transactDate;
    private String transactNumber;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTransactDate() {
        return transactDate;
    }

    public void setTransactDate(String transactDate) {
        this.transactDate = transactDate;
    }

    public String getTransactNumber() {
        return transactNumber;
    }

    public void setTransactNumber(String transactNumber) {
        this.transactNumber = transactNumber;
    }

    public Transact(String customerId, String transactDate, String transactNumber) {
        this.customerId = customerId;
        this.transactDate = transactDate;
        this.transactNumber = transactNumber;

    }
}
