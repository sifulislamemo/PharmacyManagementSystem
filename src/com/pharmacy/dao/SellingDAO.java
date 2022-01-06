/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.dao;

import com.pharmacy.common.ICommonInterface;
import com.pharmacy.model.SellingPerUnit;
import com.pharmacy.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class SellingDAO implements ICommonInterface<SellingPerUnit>{
Connection con;
    PreparedStatement ps;
    @Override
    public int save(SellingPerUnit t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(SellingPerUnit t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(SellingPerUnit t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SellingPerUnit getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SellingPerUnit> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<SellingPerUnit> getByInvoice(String invoice){
             String sql = "select * from selling where invoice_no = ?";
List<SellingPerUnit> selling = new ArrayList<SellingPerUnit>();
     try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, invoice);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
//                System.out.println(rs.getString("sales_code"));
                SellingPerUnit sales = new SellingPerUnit();
               
                sales.setMedicineCode(rs.getString("medicine_code"));
                sales.setMedicineName(rs.getString("medicine_name"));
                sales.setMedicineQuantity(Integer.valueOf(rs.getString("medicine_quantity")));
                sales.setSalesSellingPrice(Double.valueOf(rs.getString("sales_selling_price")));
                sales.setMedicineTotalAmounnt(Double.valueOf(rs.getString("medicine_total_amounnt")));
                selling.add(sales);
                System.out.println(rs.getString("medicine_code"));
            }
            } catch (Exception e) {
            
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        } 
     return selling;
   }
    
}
