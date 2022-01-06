
package com.pharmacy.model;

import java.util.Date;


public class HomeDelivery {
   private int id;
   private String salesCode;
   private String salesName;
   private String salesContact;
   private String salesAddress;
   private String salesGender;
   private String salesDate;
   private String medicineName;
   private String paymentType;
   private String status;
   private double sellingPrice;
   private double sellingQuantity;
   private double sellingDiscountPercentage;
   private double sellingVat;
   private double sellingTotalAmount;
   private double sellingPaidAmount;
   private double sellingDueAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalesCode() {
        return salesCode;
    }

    public void setSalesCode(String salesCode) {
        this.salesCode = salesCode;
    }

    public String getSalesName() {
        return salesName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public String getSalesContact() {
        return salesContact;
    }

    public void setSalesContact(String salesContact) {
        this.salesContact = salesContact;
    }

    public String getSalesAddress() {
        return salesAddress;
    }

    public void setSalesAddress(String salesAddress) {
        this.salesAddress = salesAddress;
    }

    public String getSalesGender() {
        return salesGender;
    }

    public void setSalesGender(String salesGender) {
        this.salesGender = salesGender;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

  

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getSellingQuantity() {
        return sellingQuantity;
    }

    public void setSellingQuantity(double sellingQuantity) {
        this.sellingQuantity = sellingQuantity;
    }

    public double getSellingDiscountPercentage() {
        return sellingDiscountPercentage;
    }

    public void setSellingDiscountPercentage(double sellingDiscountPercentage) {
        this.sellingDiscountPercentage = sellingDiscountPercentage;
    }

    public double getSellingVat() {
        return sellingVat;
    }

    public void setSellingVat(double sellingVat) {
        this.sellingVat = sellingVat;
    }

    public double getSellingTotalAmount() {
        return sellingTotalAmount;
    }

    public void setSellingTotalAmount(double sellingTotalAmount) {
        this.sellingTotalAmount = sellingTotalAmount;
    }

    public double getSellingPaidAmount() {
        return sellingPaidAmount;
    }

    public void setSellingPaidAmount(double sellingPaidAmount) {
        this.sellingPaidAmount = sellingPaidAmount;
    }

    public double getSellingDueAmount() {
        return sellingDueAmount;
    }

    public void setSellingDueAmount(double sellingDueAmount) {
        this.sellingDueAmount = sellingDueAmount;
    }
   
   
   
}
