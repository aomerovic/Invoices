package com.example.invoice.demo.controller;

import com.example.invoice.demo.database.DataBase;
import com.example.invoice.demo.model.Invoice;
import com.example.invoice.demo.model.InvoiceItem;

import java.util.*;

public class InvoiceController {

    public static List<Invoice> getAll() {
        return DataBase.getInvoices();
    }

    // Method should find Invoice with given id
    public static Invoice getById(Integer Id) {
        Invoice invoice = null;
        List<Invoice> invoices = DataBase.getInvoices();
        for (Invoice inv : invoices) {
            if (inv.getID().equals(Id))
                invoice = inv;
        }
        return invoice;
    }

    //Method should create Invoice with given parameters, and calculate total neto amount and total bruto amount
    public static void create(Integer ID, String DocumentNumber, Calendar date, Integer supplierId, Double taxPercentage) {
        Double totalNetto = 0.0;
        Double totalBrutto = 0.0;
        List<InvoiceItem> invoiceItems = DataBase.getInvoiceItems();
        for (InvoiceItem invItem : invoiceItems) {
            if (invItem.getInvoiceID().equals(ID)) {
                totalBrutto += invItem.getBruttoAmount();
                totalNetto += invItem.getNettoAmount();
            }
        }
        totalBrutto += taxPercentage;
        Invoice invoice = new Invoice(ID, DocumentNumber, date, supplierId, taxPercentage, totalNetto, totalBrutto);
        DataBase.addInvoice(invoice);
    }

    //Method should delete invoice with given id, and delete all invoice items that are part of invoice with given id
    public static void deleteById(Integer Id) {
        Invoice invoice = getById(Id);
        if (invoice != null) {
            List<InvoiceItem> items = new ArrayList();
            List<InvoiceItem> invoiceItems = DataBase.getInvoiceItems();
            for (InvoiceItem invItem : invoiceItems) {
                if (invItem.getInvoiceID().equals(invoice.getID())) {
                    items.add(invItem);
                }
            }

            for (int j = 0; j < items.size(); j++) {
                DataBase.removeInvoiceItem(items.get(j));
            }
            DataBase.removeInvoice(invoice);
        }
    }
}
