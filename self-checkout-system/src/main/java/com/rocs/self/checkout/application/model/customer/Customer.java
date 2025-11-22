package com.rocs.self.checkout.application.model.customer;

public class Customer {
    private String customerId;
    private String customer;
    private String address;
    private String contactNumber;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Customer(String customerId, String customer, String address, String contactNumber) {
        this.customerId = customerId;
        this.customer = customer;
        this.address = address;
        this.contactNumber = contactNumber;
    }
}