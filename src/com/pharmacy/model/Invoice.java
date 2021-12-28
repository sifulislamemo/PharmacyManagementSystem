/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.model;

/**
 *
 * @author Facult-1
 */
public class Invoice {
    private int id;
    private String medicineCode;
    private String medicineName;
    private double medicineQuantity;
    private double perUnitPrice;
    private double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicineCode() {
        return medicineCode;
    }

    public void setMedicineCode(String medicineCode) {
        this.medicineCode = medicineCode;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public double getMedicineQuantity() {
        return medicineQuantity;
    }

    public void setMedicineQuantity(double medicineQuantity) {
        this.medicineQuantity = medicineQuantity;
    }

    public double getPerUnitPrice() {
        return perUnitPrice;
    }

    public void setPerUnitPrice(double perUnitPrice) {
        this.perUnitPrice = perUnitPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
