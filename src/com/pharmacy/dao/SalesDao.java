package com.pharmacy.dao;

import com.pharmacy.common.ICommonInterface;
import com.pharmacy.model.Sales;
import com.pharmacy.model.SellingPerUnit;
import com.pharmacy.util.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalesDao implements ICommonInterface<Sales> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(Sales t) {
        String sql = "insert into sales (sales_code, sales_name, sales_contact, sales_address, sales_gender, sales_date, medicine_name, sales_payment_type, sales_price, sales_quantity, sales_discount_percentage, sales_vat, sales_total_amount, sales_paid_amount, sales__due_amount, status) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getSalesCode());
            ps.setString(2, t.getSalesName());
            ps.setString(3, t.getSalesContact());
            ps.setString(4, t.getSalesAddress());
            ps.setString(5, t.getSalesGender());
            ps.setString(6, t.getSalesDate());
            ps.setString(7, t.getMedicineName());
            ps.setString(8, t.getPaymentType());
            ps.setString(9, Double.valueOf(t.getSellingPrice()).toString());
            ps.setString(10, Double.valueOf(t.getSellingQuantity()).toString());
            ps.setString(11, Double.valueOf(t.getSellingDiscountPercentage()).toString());
            ps.setString(12, Double.valueOf(t.getSellingVat()).toString());
            ps.setString(13, Double.valueOf(t.getSellingTotalAmount()).toString());
            ps.setString(14, Double.valueOf(t.getSellingPaidAmount()).toString());
            ps.setString(15, Double.valueOf(t.getSellingDueAmount()).toString());
            ps.setString(16, "SOLD");
            
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
    public int update(Sales t) {
//         String sql = "update sales set sales_code = ?, sales_name = ?, sales_contact = ?, sales_address = ?, sales_gender = ?, sales_date = ?, medicine_name = ?, sales_payment_type = ?, sales_price = ?, sales_quantity = ?, sales_discount_percentage = ?, sales_vat = ?, sales_total_amount = ?, sales_paid_amount = ?, sales__due_amount = ? where sales_code = ?";
//        int status = 0;
//        try {
//            con = DBConnection.getConnection();
//            ps = con.prepareStatement(sql);
//            ps.setString(1, t.getSalesCode());
//            ps.setString(2, t.getSalesName());
//            ps.setString(3, t.getSalesContact());
//            ps.setString(4, t.getSalesAddress());
//            ps.setString(5, t.getSalesGender());
//            ps.setString(6, t.getSalesDate());
//            ps.setString(7, t.getMedicineName());
//            ps.setString(8, t.getPaymentType());
//            ps.setString(9, Double.valueOf(t.getSellingPrice()).toString());
//            ps.setString(10, Double.valueOf(t.getSellingQuantity()).toString());
//            ps.setString(11, Double.valueOf(t.getSellingDiscountPercentage()).toString());
//            ps.setString(12, Double.valueOf(t.getSellingVat()).toString());
//            ps.setString(13, Double.valueOf(t.getSellingTotalAmount()).toString());
//            ps.setString(14, Double.valueOf(t.getSellingPaidAmount()).toString());
//            ps.setString(15, Double.valueOf(t.getSellingDueAmount()).toString());
//            ps.setString(16, t.getSalesCode());
//            
//            status = ps.executeUpdate();
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            try {
//                ps.close();
//                con.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(MedicineDao.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        return status;
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int delete(Sales t) {
         String sql = "delete from sales where sales_code = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getSalesCode());

            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SalesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Sales getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public List<SellingPerUnit> getByInvoice(String invoice){
             String sql = "select * from selling where invoice_no = ?";
List<SellingPerUnit> selling = new ArrayList<SellingPerUnit>();
     try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
//                System.out.println(rs.getString("sales_code"));
                Sales sales = new Sales();
                sales.setId(rs.getInt("id"));
                sales.setSalesCode(rs.getString("medicine_code"));
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
        return selling;
     }
    @Override
    public List<Sales> getAll() {
        String sql = "select * from sales";
        List<Sales> s = new ArrayList<Sales>();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
//                System.out.println(rs.getString("sales_code"));
                Sales sales = new Sales();
                sales.setId(rs.getInt("id"));
                sales.setSalesCode(rs.getString("sales_code"));
                sales.setSalesName(rs.getString("sales_name"));
                sales.setSalesContact(rs.getString("sales_contact"));
                sales.setSalesAddress(rs.getString("sales_address"));
                sales.setSalesGender(rs.getString("sales_gender"));
                sales.setSalesDate(rs.getString("sales_date"));
                sales.setMedicineName(rs.getString("medicine_name"));
                sales.setPaymentType(rs.getString("sales_payment_type"));
                
                sales.setSellingPrice(Double.valueOf(rs.getString("sales_price")));
                sales.setSellingQuantity(Double.valueOf(rs.getString("sales_quantity")));
                sales.setSellingDiscountPercentage(Double.valueOf(rs.getString("sales_discount_percentage")));
                sales.setSellingVat(Double.valueOf(rs.getString("sales_vat")));
                sales.setSellingTotalAmount(Double.valueOf(rs.getString("sales_total_amount")));
                sales.setSellingPaidAmount(Double.valueOf(rs.getString("sales_paid_amount")));
                sales.setSellingDueAmount(Double.valueOf(rs.getString("sales__due_amount")));
                sales.setStatus(rs.getString("status"));
                
                s.add(sales);
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
        return s;
    }
}
