
package com.pharmacy.model;

public class SalesTable {
    private int id;
    private String medicineCode;
    private String medicineName;
    private double sellingQuantity;
    private double perUnitPrice;
    private double unitTotal;

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

    public double getSellingQuantity() {
        return sellingQuantity;
    }

    public void setSellingQuantity(double sellingQuantity) {
        this.sellingQuantity = sellingQuantity;
    }

    public double getPerUnitPrice() {
        return perUnitPrice;
    }

    public void setPerUnitPrice(double perUnitPrice) {
        this.perUnitPrice = perUnitPrice;
    }

    public double getUnitTotal() {
        return unitTotal;
    }

    public void setUnitTotal(double unitTotal) {
        this.unitTotal = unitTotal;
    }
    
}
