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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class MedicineDao implements ICommonInterface<Medicine> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(Medicine t) {
        String sql = "insert into medicine (medicine_code, medicine_name, medicine_manufacturing_date, medicine_expiration_date, medicine_batch_no, medicine_buying_price, medicine_quantity, medicine_discount, medicine_vat, medicine_total_amounnt, medicine_paid_amount, medicine_due_amount, sales_selling_price, branch_location, company_name, medicine_item_name) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getMedicineCode());
            ps.setString(2, t.getMedicineName());
            ps.setString(3, t.getMedicineManufacturingDate().toString());
            ps.setString(4, t.getMedicineExpirationDate().toString());
            ps.setString(5, t.getMedicineBatchNo());
            ps.setString(6, Double.valueOf(t.getMedicineBuyingPrice()).toString());
            ps.setString(7, Double.valueOf(t.getMedicineQuantity()).toString());
            ps.setString(8, Double.valueOf(t.getMedicineDiscount()).toString());
            ps.setString(9, Double.valueOf(t.getMedicineVat()).toString());
            ps.setString(10, Double.valueOf(t.getMedicineTotalAmounnt()).toString());
            ps.setString(11, Double.valueOf(t.getMedicinePaidAmount()).toString());
            ps.setString(12, Double.valueOf(t.getMedicineDueAmount()).toString());
            ps.setString(13, Double.valueOf(t.getSalesSellingPrice()).toString());
            ps.setString(14, t.getBranchLocation());
            ps.setString(15, t.getMedicineItemName());
            ps.setString(16, t.getCompanyName());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(MedicineDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return status;
    }

    @Override
    public int update(Medicine t) {
        String sql = "update medicine set medicine_code = ?, medicine_name = ?, medicine_manufacturing_date = ?, medicine_expiration_date = ?, medicine_batch_no = ?, medicine_buying_price = ?, medicine_quantity = ?, medicine_discount = ?, medicine_vat = ?, medicine_total_amounnt = ?, medicine_paid_amount = ?, medicine_due_amount = ?, sales_selling_price = ?, branch_location = ?, company_name = ?, medicine_item_name = ? where medicine_code = ?";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getMedicineCode());
            ps.setString(2, t.getMedicineName());
            ps.setString(3, t.getMedicineManufacturingDate());
            ps.setString(4, t.getMedicineExpirationDate());
            ps.setString(5, t.getMedicineBatchNo());
            ps.setString(6, Double.valueOf(t.getMedicineBuyingPrice()).toString());
            ps.setString(7, Double.valueOf(t.getMedicineQuantity()).toString());
            ps.setString(8, Double.valueOf(t.getMedicineDiscount()).toString());
            ps.setString(9, Double.valueOf(t.getMedicineVat()).toString());
            ps.setString(10, Double.valueOf(t.getMedicineTotalAmounnt()).toString());
            ps.setString(11, Double.valueOf(t.getMedicinePaidAmount()).toString());
            ps.setString(12, Double.valueOf(t.getMedicineDueAmount()).toString());
            ps.setString(13, Double.valueOf(t.getSalesSellingPrice()).toString());
            ps.setString(14, t.getBranchLocation());
            ps.setString(15, t.getMedicineItemName());
            ps.setString(16, t.getCompanyName());
            ps.setString(17, t.getMedicineCode());
            
            //status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(BranchDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return status;
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
//        System.out.println(m);
        return m;
    }

}


