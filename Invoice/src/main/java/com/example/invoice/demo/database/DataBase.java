package com.example.invoice.demo.database;

import com.example.invoice.demo.model.Invoice;
import com.example.invoice.demo.model.InvoiceItem;
import com.example.invoice.demo.model.Supplier;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static List<Supplier> suppliers = new ArrayList();
    private static List<Invoice> invoices = new ArrayList();
    private static List<InvoiceItem> invoiceItems = new ArrayList();

    public static List<Supplier> getSuppliers() {
        return suppliers;
    }

    public static List<Invoice> getInvoices() {
        return invoices;
    }

    public static List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public static void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public static void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public static void addInvoiceItem(InvoiceItem invoiceItem) {
        invoiceItems.add(invoiceItem);
    }

    public static void removeInvoice(Invoice invoice) {
        invoices.remove(invoice);
    }

    public static void removeInvoiceItem(InvoiceItem invoiceItem) {
        invoiceItems.remove(invoiceItem);
    }

}
