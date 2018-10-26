package com.example.invoice.demo;

import com.example.invoice.demo.controller.DataLoader;
import com.example.invoice.demo.controller.InvoiceController;
import com.example.invoice.demo.controller.InvoiceItemController;
import com.example.invoice.demo.controller.SupplierController;
import com.example.invoice.demo.model.Invoice;
import com.example.invoice.demo.model.InvoiceItem;
import com.example.invoice.demo.model.Supplier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        //Hard-coded Suppliers
        SupplierController.create(1, "Name1");
        SupplierController.create(2, "Name2");
        SupplierController.create(3, "Name3");
        SupplierController.create(4, "Name4");
        SupplierController.create(5, "Name5");

        //Hard-coded Invoice items
        InvoiceItemController.create(1, 1, "art1", "description", 23, 19.9, 11.9, 11.9, 30.9);
        InvoiceItemController.create(2, 2, "art2", "description", 22, 14.8, 15.8, 12.8, 31.8);
        InvoiceItemController.create(3, 3, "art3", "description", 21, 11.5, 14.7, 13.7, 32.7);
        InvoiceItemController.create(4, 4, "art4", "description", 24, 10.0, 12.6, 14.6, 33.6);
        InvoiceItemController.create(5, 5, "art5", "description", 25, 19.3, 16.5, 15.5, 34.5);
        InvoiceItemController.create(6, 6, "art6", "description", 26, 14.1, 19.4, 16.4, 35.4);
        InvoiceItemController.create(7, 1, "art7", "description", 27, 13.4, 17.3, 17.3, 36.3);
        InvoiceItemController.create(8, 2, "art8", "description", 28, 11.9, 10.2, 18.2, 37.2);
        InvoiceItemController.create(9, 3, "art9", "description", 29, 14.7, 12.1, 19.1, 38.1);
        InvoiceItemController.create(10, 4, "art10", "description", 20, 15.3, 19.0, 20.0, 39.0);
        InvoiceItemController.create(11, 5, "art11", "description", 19, 11.5, 11.9, 21.9, 40.9);
        InvoiceItemController.create(12, 6, "art12", "description", 18, 19.1, 10.8, 22.8, 41.8);
        InvoiceItemController.create(13, 1, "art13", "description", 23, 14.0, 14.7, 23.7, 42.7);
        InvoiceItemController.create(14, 2, "art14", "description", 22, 11.9, 15.6, 24.6, 43.6);
        InvoiceItemController.create(15, 3, "art15", "description", 28, 12.7, 18.4, 25.5, 44.5);
        InvoiceItemController.create(16, 4, "art16", "description", 26, 18.7, 19.3, 26.4, 45.4);
        InvoiceItemController.create(17, 5, "art17", "description", 21, 10.1, 17.2, 27.3, 46.3);
        InvoiceItemController.create(18, 6, "art18", "description", 18, 19.5, 14.1, 28.2, 47.2);
        InvoiceItemController.create(19, 1, "art19", "description", 19, 18.5, 12.4, 29.0, 48.1);
        InvoiceItemController.create(20, 2, "art20", "description", 23, 10.5, 13.5, 30.1, 49.0);

        //Hard-coded Invoices
        InvoiceController.create(1, "A51a", new GregorianCalendar(2017, 11, 2), 1, 21.2);
        InvoiceController.create(2, "A51s", new GregorianCalendar(2017, 1, 8), 2, 2.2);
        InvoiceController.create(3, "A51d", new GregorianCalendar(2017, 4, 17), 3, 11.2);
        InvoiceController.create(4, "A51f", new GregorianCalendar(2016, 8, 5), 4, 10.5);
        InvoiceController.create(5, "A51g", new GregorianCalendar(2017, 11, 21), 5, 21.8);
        InvoiceController.create(6, "A51h", new GregorianCalendar(2017, 12, 2), 1, 15.0);

        //Testing getAll() methods for SupplierController, InvoiceController and InvoiceItemController
        List<Supplier> suppliers = SupplierController.getAll();
        List<Invoice> invoices = InvoiceController.getAll();
        List<InvoiceItem> invoiceItems = InvoiceItemController.getAll();

        for (Supplier suppl : suppliers) {
            System.out.println("Supplier ID: " + suppl.getID() + " supplier name: " + suppl.getName());
        }
        for (Invoice inv : invoices) {
            System.out.println("Invoice ID: " + inv.getID() + " invoice year: " + inv.getDate().get(Calendar.YEAR) + " supplier ID: " + inv.getSupplierID() + " invoice total neto amount: " + inv.getTotalNettoAmount() + " invoice total bruto amount: " + inv.getTotalBruttoAmount());
        }
        for (InvoiceItem invIt : invoiceItems) {
            System.out.println("Invoice item id: " + invIt.getID() + " invoice id:" + +invIt.getInvoiceID() + " invoice item bruto amount: " + invIt.getBruttoAmount());
        }

        //Testing getById() method for SupplierController, InvoiceController, InvoiceItemController
        Supplier supplier = SupplierController.getById(4);
        System.out.println("Supplier id: " + supplier.getID() + " supplier name: " + supplier.getName());

        Invoice invoice = InvoiceController.getById(4);
        System.out.println("Invoice id: " + invoice.getID() + " supplier id: " + invoice.getSupplierID() + " invoice total bruto amount: " + invoice.getTotalBruttoAmount());

        InvoiceItem invoiceItem = InvoiceItemController.getById(4);
        System.out.println("Invoice item id: " + invoiceItem.getID() + " invoice id: " + invoiceItem.getInvoiceID() + " invoice item quantity: " + invoiceItem.getQuantity() + " invoice item bruto amount: " + invoiceItem.getBruttoAmount());

        //Testing deleteById() for InvoiceController
        Invoice invoice1 = InvoiceController.getById(4);
        Integer ID = invoice1.getID();
        InvoiceController.deleteById(4);
        int i = 0;
        // Checking if there are Invoice items in collection with InvoiceId for deleted Invoice
        for (InvoiceItem invIt : invoiceItems) {
            if (invIt.getInvoiceID().equals(ID))
                i++;
        }
        if (i == 0)
            System.out.println("Deleted");
        else
            System.out.println("Not deleted");

        //Testing getInvoicesByDate() method from DataLoader
        List<Invoice> invoiceByDate = DataLoader.getInvoicesByDate(new GregorianCalendar(2017, 1, 1), new GregorianCalendar(2017, 4, 30));
        for (Invoice inv : invoiceByDate) {
            System.out.println("Total bruto amount: " + inv.getTotalBruttoAmount());
        }

        //Testing getMostExpensiveInvoice() method from DataLoader
        List<Invoice> mostExpensive = DataLoader.getMostExpensiveInvoice();
        for (Invoice inv : mostExpensive) {
            System.out.println("Total bruto amount for most expensive ones: " + inv.getTotalBruttoAmount());
        }

        //Testing supplierInvoice() method from DataLoader
        List<Invoice> supplierInvoices = DataLoader.supplierInvoice(1);
        System.out.println("Invoices from supplier with id 1:");
        for (Invoice inv : supplierInvoices) {
            System.out.println("Invoice ID:" + inv.getID() + " total bruto amount: " + inv.getTotalBruttoAmount());
        }

        //Testing totalAmountForTime() method from DataLoader
        Double totalAmount = DataLoader.totalAmountForTime(new GregorianCalendar(2017, 1, 1), new GregorianCalendar(2017, 4, 30));
        System.out.println("Total amount for requested time: " + totalAmount);

    }
}
