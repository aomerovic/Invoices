package com.example.invoice.demo.controller;

import com.example.invoice.demo.database.DataBase;
import com.example.invoice.demo.model.InvoiceItem;

import java.util.List;

public class InvoiceItemController {

    //Method should return all invoice items from database
    public static List<InvoiceItem> getAll() {
        return DataBase.getInvoiceItems();
    }

    //Method should return invoice item with given id
    public static InvoiceItem getById(int Id) {
        InvoiceItem invoiceItem = null;
        List<InvoiceItem> invoiceItems = DataBase.getInvoiceItems();
        for (InvoiceItem inv : invoiceItems) {
            if (inv.getID() == Id)
                invoiceItem = inv;
        }
        return invoiceItem;
    }

    //Method should create invoice item with given parameters
    public static void create(int ID, int invoiceId, String articleNumber, String articleDescription, int quantity, Double pricePerUnit, Double taxPercentage, Double nettoAmount, Double bruttoAmount) {
        InvoiceItem invoiceItem = new InvoiceItem(ID, invoiceId, articleNumber, articleDescription, quantity, pricePerUnit, taxPercentage, nettoAmount, bruttoAmount);
        DataBase.addInvoiceItem(invoiceItem);

    }
}
