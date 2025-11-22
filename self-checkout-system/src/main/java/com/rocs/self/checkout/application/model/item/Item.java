package com.rocs.self.checkout.application.model.item;

public class Item {
        private String id;
        private String itemDesc;
        private String unitPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Item(String id, String itemDesc, String unitPrice) {
        this.id = id;
        this.itemDesc = itemDesc;
        this.unitPrice = unitPrice;

    }
}