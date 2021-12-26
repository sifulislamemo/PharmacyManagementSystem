/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.dao;

import com.pharmacy.common.ICommonInterface;
import com.pharmacy.model.SalesTable;
import com.pharmacy.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class SalesTableDao implements ICommonInterface<SalesTable>{
Connection con;
PreparedStatement ps;
    @Override
    public int save(SalesTable t) {
        String sql = "insert into sales_table (medicine_code, medicine_name, selling_quantity, per_unit_price, unit_total) values (?, ?, ?, ?, ?)";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getMedicineCode());
            ps.setString(2, t.getMedicineName());
            ps.setString(3, Double.valueOf(t.getSellingQuantity()).toString());
            ps.setString(4, Double.valueOf(t.getPerUnitPrice()).toString());
            ps.setString(5, Double.valueOf(t.getUnitTotal()).toString());
            status = ps.executeUpdate();
        } catch (Exception e) {
//            System.out.println(e);
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
    public int update(SalesTable t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(SalesTable t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SalesTable getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SalesTable> getAll() {
         String sql = "select * from sales_table";
        List<SalesTable> s = new ArrayList<SalesTable>();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
//                System.out.println(rs.getString("sales_code"));
                SalesTable salesTable = new SalesTable();
                salesTable.setId(rs.getInt("id"));
                salesTable.setMedicineCode(rs.getString("medicine_code"));
                salesTable.setMedicineName(rs.getString("medicine_name"));
                salesTable.setSellingQuantity(Double.valueOf(rs.getString("selling_quantity")));
                salesTable.setPerUnitPrice(Double.valueOf(rs.getString("per_unit_price")));
                salesTable.setUnitTotal(Double.valueOf(rs.getString("unit_total")));
                s.add(salesTable);
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
