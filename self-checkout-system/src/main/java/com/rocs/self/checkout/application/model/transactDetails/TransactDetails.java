package com.rocs.self.checkout.application.model.transactDetails;

public class TransactDetails {
    private String itemId;
    private String transactDetailsId;
    private String transactNumber;
    private String qty;
    private String unitPrice;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTransactDetailsId() {
        return transactDetailsId;
    }

    public void setTransactDetailsId(String transactDetailsId) {
        this.transactDetailsId = transactDetailsId;
    }

    public String getTransactNumber() {
        return transactNumber;
    }

    public void setTransactNumber(String transactNumber) {
        this.transactNumber = transactNumber;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public TransactDetails(String itemId, String transactDetailsId, String transactNumber, String qty, String unitPrice) {
        this.itemId = itemId;
        this.transactDetailsId = transactDetailsId;
        this.transactNumber = transactNumber;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
}
