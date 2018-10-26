package com.example.invoice.demo.model;

import java.util.Calendar;

public class Invoice {

    private Integer ID;
    private String DocumentNumber;
    private Calendar InvoiceDate;
    private Integer SupplierID;
    private Double TaxPercentage;
    private Double TotalNettoAmount;
    private Double TotalBruttoAmount;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDocumentNumber() {
        return DocumentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        DocumentNumber = documentNumber;
    }

    public Calendar getDate() {
        return InvoiceDate;
    }

    public void setDate(Calendar date) {
        InvoiceDate = date;
    }

    public Integer getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(Integer supplierID) {
        SupplierID = supplierID;
    }

    public Double getTaxPercentage() {
        return TaxPercentage;
    }

    public void setTaxPercentage(Double taxPercentage) {
        TaxPercentage = taxPercentage;
    }

    public Double getTotalNettoAmount() {
        return TotalNettoAmount;
    }

    public void setTotalNettoAmount(Double totalNettoAmount) {
        TotalNettoAmount = totalNettoAmount;
    }

    public Double getTotalBruttoAmount() {
        return TotalBruttoAmount;
    }

    public void setTotalBruttoAmount(Double totalBruttoAmount) {
        TotalBruttoAmount = totalBruttoAmount;
    }

    public Invoice(Integer ID, String documentNumber, Calendar date, Integer supplierID, Double taxPercentage, Double totalNettoAmount, Double totalBruttoAmount) {
        this.ID = ID;
        DocumentNumber = documentNumber;
        InvoiceDate = date;
        SupplierID = supplierID;
        TaxPercentage = taxPercentage;
        TotalNettoAmount = totalNettoAmount;
        TotalBruttoAmount = totalBruttoAmount;
    }

    //Empty constructor
    public Invoice() {
    }
}
