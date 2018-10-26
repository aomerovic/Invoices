package com.example.invoice.demo.controller;

import com.example.invoice.demo.database.DataBase;
import com.example.invoice.demo.model.Supplier;

import java.util.List;

public class SupplierController {

    //Method should return all suppliers from DataBase
    public static List<Supplier> getAll() {
        return DataBase.getSuppliers();
    }

    public static Supplier getById(Integer Id) {
        Supplier supplier = null;
        List<Supplier> suppliers = DataBase.getSuppliers();
        for (Supplier suppl : suppliers) {
            if (suppl.getID().equals(Id))
                supplier = suppl;
        }
        return supplier;
    }
    //Method should create a supplier with given parameters
    public static void create(Integer ID, String Name) {
        Supplier supplier = new Supplier(ID, Name);
        DataBase.addSupplier(supplier);
    }

}
