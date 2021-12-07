/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.dao;

import com.pharmacy.common.ICommonInterface;
import com.pharmacy.model.Medicine;
import com.pharmacy.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author user
 */
public class MedicineReportDao implements ICommonInterface<Medicine>{
 Connection con;
    PreparedStatement ps;
    @Override
    public int save(Medicine t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Medicine t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Medicine t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medicine getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medicine> getAll() {
String sql = "select * from medicine";
        List<Medicine> m = new ArrayList<Medicine>();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                System.out.println(rs.getString("medicine_code"));
                Medicine medicine = new Medicine();
                medicine.setId(rs.getInt("id"));
                medicine.setMedicineCode(rs.getString("medicine_code"));
                medicine.setMedicineName(rs.getString("medicine_name"));
                medicine.setMedicineManufacturingDate(rs.getString("medicine_manufacturing_date"));
                medicine.setMedicineExpirationDate(rs.getString("medicine_expiration_date"));
                medicine.setMedicineBatchNo(rs.getString("medicine_batch_no"));
                medicine.setMedicineBuyingPrice(Double.valueOf(rs.getString("medicine_buying_price")));
                medicine.setMedicineQuantity(Double.valueOf(rs.getString("medicine_quantity")));
                medicine.setMedicineDiscount(Double.valueOf(rs.getString("medicine_discount")));
                medicine.setMedicineVat(Double.valueOf(rs.getString("medicine_vat")));
                medicine.setMedicineTotalAmounnt(Double.valueOf(rs.getString("medicine_total_amounnt")));
                medicine.setMedicinePaidAmount(Double.valueOf(rs.getString("medicine_paid_amount")));
                medicine.setMedicineDueAmount(Double.valueOf(rs.getString("medicine_due_amount")));
                medicine.setSalesSellingPrice(Double.valueOf(rs.getString("sales_selling_price")));
                medicine.setMedicineName(rs.getString("branch_location"));
                medicine.setMedicineName(rs.getString("company_name"));
                medicine.setMedicineName(rs.getString("medicine_item_name"));

                m.add(medicine);
                i++;
            }
        } catch (Exception e) {

        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }
        System.out.println(m);
        return m;
    }
    }

   
    

