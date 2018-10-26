package com.example.invoice.demo.controller;

import com.example.invoice.demo.database.DataBase;
import com.example.invoice.demo.model.Invoice;

import java.util.*;
import java.util.stream.Collectors;

public class DataLoader {

    /*Method returns a list of invoices that are registered for particular time period */
    public static List<Invoice> getInvoicesByDate(Calendar date1, Calendar date2) {
        List<Invoice> invoicesDate = new ArrayList();
        List<Invoice> invoices = DataBase.getInvoices();
        for (Invoice inv : invoices) {
            if (inv.getDate().compareTo(date1) >= 0 && inv.getDate().compareTo(date2) <= 0)
                invoicesDate.add(inv);
        }
        return invoicesDate;
    }

    /*Method returns a list of 5 most expensive invoices*/
    public static List<Invoice> getMostExpensiveInvoice() {

        List<Invoice> invoicesExpensive = new ArrayList();
        List<Invoice> invoices = DataBase.getInvoices();

        // sorting a list by descending order
        List<Invoice> sortedInvoices = invoices.stream()
                .sorted(Comparator.comparing(Invoice::getTotalBruttoAmount).reversed())
                .collect(Collectors.toList());

        for (int i = 0; i < 5; i++)
            invoicesExpensive.add(sortedInvoices.get(i));

        return invoicesExpensive;

    }

    /*Method returns a list of invoices for particular supplier*/
    public static List<Invoice> supplierInvoice(Integer id) {
        List<Invoice> supplierInvoices = new ArrayList();
        List<Invoice> invoices = DataBase.getInvoices();
        for (Invoice invoice : invoices) {
            if (invoice.getSupplierID().equals(id)) {
                supplierInvoices.add(invoice);

            }
        }
        return supplierInvoices;
    }

    /*Method returns total bruto amount of invoices for particular time period*/
    public static Double totalAmountForTime(Calendar date1, Calendar date2) {
        // Taking all invoices for given time period
        List<Invoice> inv = getInvoicesByDate(date1, date2);
        Double totalAmount = 0.0;
        for (Invoice invoice : inv) {
            totalAmount += invoice.getTotalBruttoAmount();
        }
        return totalAmount;
    }

}
