/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.dao;

import com.pharmacy.common.ICommonInterface;
import com.pharmacy.model.HomeDelivery;
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
 * @author user
 */
public class HomeDeliveryDao implements ICommonInterface<HomeDelivery>{
Connection con;
    PreparedStatement ps;
    @Override
    public int save(HomeDelivery t) {
        String sql = "insert into home_delivery (sales_code, sales_name, sales_contact, sales_address, sales_gender, sales_date, medicine_name, sales_payment_type, sales_price, sales_quantity, sales_discount_percentage, sales_vat, sales_total_amount, sales_paid_amount, sales__due_amount, status) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
    public int update(HomeDelivery t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(HomeDelivery t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HomeDelivery getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HomeDelivery> getAll() {
        String sql = "select * from home_delivery";
        List<HomeDelivery> s = new ArrayList<HomeDelivery>();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
//                System.out.println(rs.getString("sales_code"));
                HomeDelivery homeDelivery = new HomeDelivery();
                homeDelivery.setId(rs.getInt("id"));
                homeDelivery.setSalesCode(rs.getString("sales_code"));
                homeDelivery.setSalesName(rs.getString("sales_name"));
                homeDelivery.setSalesContact(rs.getString("sales_contact"));
                homeDelivery.setSalesAddress(rs.getString("sales_address"));
                homeDelivery.setSalesGender(rs.getString("sales_gender"));
                homeDelivery.setSalesDate(rs.getString("sales_date"));
                homeDelivery.setMedicineName(rs.getString("medicine_name"));
                homeDelivery.setPaymentType(rs.getString("sales_payment_type"));
                
                homeDelivery.setSellingPrice(Double.valueOf(rs.getString("sales_price")));
                homeDelivery.setSellingQuantity(Double.valueOf(rs.getString("sales_quantity")));
                homeDelivery.setSellingDiscountPercentage(Double.valueOf(rs.getString("sales_discount_percentage")));
                homeDelivery.setSellingVat(Double.valueOf(rs.getString("sales_vat")));
                homeDelivery.setSellingTotalAmount(Double.valueOf(rs.getString("sales_total_amount")));
                homeDelivery.setSellingPaidAmount(Double.valueOf(rs.getString("sales_paid_amount")));
                homeDelivery.setSellingDueAmount(Double.valueOf(rs.getString("sales__due_amount")));
                homeDelivery.setStatus(rs.getString("status"));
                
                s.add(homeDelivery);
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
