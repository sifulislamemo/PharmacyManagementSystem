/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.model;

/**
 *
 * @author user
 */
public class MedicineItem {
    private int id;
    private String medicineCode;
    private String medicineItemName;

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

    public String getMedicineItemName() {
        return medicineItemName;
    }

    public void setMedicineItemName(String medicineItemName) {
        this.medicineItemName = medicineItemName;
    }
    
    
    
}
