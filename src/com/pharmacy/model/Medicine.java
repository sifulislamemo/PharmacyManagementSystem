/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.model;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Medicine {
    private int id;
    private String medicineCode;
    private String medicineName;
    private Date medicineManufacturingDate;
    private Date medicineExpirationDate;
    private String medicineBatchNo;
    private double medicineBuyingPrice;
    private int medicineQuantity;
    private double medicineDiscount;
    private double medicineVat;
    private double medicineTotalAmounnt;
    private double medicineSellingPercent;
    private double salesSellingPrice;
    private String branchLocation;
    private String medicineItemName;
    private String companyName;
   

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

    public Date getMedicineManufacturingDate() {
        return medicineManufacturingDate;
    }

    public void setMedicineManufacturingDate(Date medicineManufacturingDate) {
        this.medicineManufacturingDate = medicineManufacturingDate;
    }

    public Date getMedicineExpirationDate() {
        return medicineExpirationDate;
    }

    public void setMedicineExpirationDate(Date medicineExpirationDate) {
        this.medicineExpirationDate = medicineExpirationDate;
    }

   

    public String getMedicineBatchNo() {
        return medicineBatchNo;
    }

    public void setMedicineBatchNo(String medicineBatchNo) {
        this.medicineBatchNo = medicineBatchNo;
    }

    public double getMedicineBuyingPrice() {
        return medicineBuyingPrice;
    }

    public void setMedicineBuyingPrice(double medicineBuyingPrice) {
        this.medicineBuyingPrice = medicineBuyingPrice;
    }

  

    public double getMedicineDiscount() {
        return medicineDiscount;
    }

    public void setMedicineDiscount(double medicineDiscount) {
        this.medicineDiscount = medicineDiscount;
    }

    public double getMedicineVat() {
        return medicineVat;
    }

    public void setMedicineVat(double medicineVat) {
        this.medicineVat = medicineVat;
    }

    public double getMedicineTotalAmounnt() {
        return medicineTotalAmounnt;
    }

    public void setMedicineTotalAmounnt(double medicineTotalAmounnt) {
        this.medicineTotalAmounnt = medicineTotalAmounnt;
    }

    public double getMedicineSellingPercent() {
        return medicineSellingPercent;
    }

    public void setMedicineSellingPercent(double medicineSellingPercent) {
        this.medicineSellingPercent = medicineSellingPercent;
    }


    public double getSalesSellingPrice() {
        return salesSellingPrice;
    }

    public void setSalesSellingPrice(double salesSellingPrice) {
        this.salesSellingPrice = salesSellingPrice;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public String getMedicineItemName() {
        return medicineItemName;
    }

    public void setMedicineItemName(String medicineItemName) {
        this.medicineItemName = medicineItemName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getMedicineQuantity() {
        return medicineQuantity;
    }

    public void setMedicineQuantity(int medicineQuantity) {
        this.medicineQuantity = medicineQuantity;
    }

    

    
    
}
