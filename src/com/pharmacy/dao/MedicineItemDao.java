/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.dao;

import com.pharmacy.common.ICommonInterface;
import com.pharmacy.model.MedicineItem;
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
public class MedicineItemDao implements ICommonInterface<MedicineItem>{
Connection con;
    PreparedStatement ps;
    @Override
    public int save(MedicineItem t) {
String sql = "insert into medicine_item (medicine_code, medicine_item_name) values (?, ?)";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getMedicineCode());
            ps.setString(2, t.getMedicineItemName());
            status = ps.executeUpdate();
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
        return status;       }

    @Override
    public int update(MedicineItem t) {
 String sql = "update medicine_item set medicine_code = ?, medicine_item_name = ? where medicine_code = ?";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
              ps.setString(1, t.getMedicineCode());
            ps.setString(2, t.getMedicineItemName());
            ps.setString(3, t.getMedicineCode());
           
            
            status = ps.executeUpdate();
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
    public int delete(MedicineItem t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MedicineItem getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MedicineItem> getAll() {
         String sql = "select * from medicine_item";
        List<MedicineItem> m = new ArrayList<MedicineItem>();
        try  {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while(rs.next()){
                System.out.println(rs.getString("medicine_code"));
                MedicineItem medicineItem = new MedicineItem();
                medicineItem.setId(rs.getInt("id"));
                medicineItem.setMedicineCode(rs.getString("medicine_code"));
                medicineItem.setMedicineItemName(rs.getString("medicine_item_name"));
                m.add(medicineItem);
                i++;
            }
        } catch (Exception e) {
            
        }finally{
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
    

