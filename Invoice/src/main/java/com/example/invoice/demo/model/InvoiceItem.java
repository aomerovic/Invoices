package com.example.invoice.demo.model;

public class InvoiceItem {

    private Integer ID;
    private Integer InvoiceID;
    private String ArticleNumber;
    private String ArticleDescription;
    private Integer Quantity;
    private Double PricePerUnit;
    private Double TaxPercentage;
    private Double NettoAmount;
    private Double BruttoAmount;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(Integer invoiceID) {
        InvoiceID = invoiceID;
    }

    public String getArticleNumber() {
        return ArticleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        ArticleNumber = articleNumber;
    }

    public String getArticleDescription() {
        return ArticleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        ArticleDescription = articleDescription;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Double getPricePerUnit() {
        return PricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        PricePerUnit = pricePerUnit;
    }

    public Double getTaxPercentage() {
        return TaxPercentage;
    }

    public void setTaxPercentage(Double taxPercentage) {
        TaxPercentage = taxPercentage;
    }

    public Double getNettoAmount() {
        return NettoAmount;
    }

    public void setNettoAmount(Double nettoAmount) {
        NettoAmount = nettoAmount;
    }

    public Double getBruttoAmount() {
        return BruttoAmount;
    }

    public void setBruttoAmount(Double bruttoAmount) {
        BruttoAmount = bruttoAmount;
    }

    public InvoiceItem(Integer ID, Integer invoiceID, String articleNumber, String articleDescription, Integer quantity, Double pricePerUnit, Double taxPercentage, Double nettoAmount, Double bruttoAmount) {
        this.ID = ID;
        InvoiceID = invoiceID;
        ArticleNumber = articleNumber;
        ArticleDescription = articleDescription;
        Quantity = quantity;
        PricePerUnit = pricePerUnit;
        TaxPercentage = taxPercentage;
        NettoAmount = nettoAmount;
        BruttoAmount = bruttoAmount;
    }
    //Empty constructor
    public InvoiceItem() {
    }
}
