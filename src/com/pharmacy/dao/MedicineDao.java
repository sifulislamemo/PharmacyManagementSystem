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
import java.sql.Date;
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
        String sql = "insert into medicine (medicine_code, medicine_name, medicine_manufacturing_date, medicine_expiration_date, medicine_batch_no, medicine_buying_price, medicine_quantity, medicine_discount, medicine_vat, medicine_total_amounnt, medicine_selling_percent, sales_selling_price, branch_location, company_name, medicine_item_name) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getMedicineCode());
            ps.setString(2, t.getMedicineName());
            ps.setDate(3, new Date(t.getMedicineManufacturingDate().getTime()));
            ps.setDate(4, new Date(t.getMedicineExpirationDate().getTime()));
            ps.setString(5, t.getMedicineBatchNo());
            ps.setString(6, Double.valueOf(t.getMedicineBuyingPrice()).toString());
            ps.setString(7, Double.valueOf(t.getMedicineQuantity()).toString());
            ps.setString(8, Double.valueOf(t.getMedicineDiscount()).toString());
            ps.setString(9, Double.valueOf(t.getMedicineVat()).toString());
            ps.setString(10, Double.valueOf(t.getMedicineTotalAmounnt()).toString());
            ps.setString(11, Double.valueOf(t.getMedicineSellingPercent()).toString());
            ps.setString(12, Double.valueOf(t.getSalesSellingPrice()).toString());
            ps.setString(13, t.getBranchLocation());
            ps.setString(14, t.getCompanyName());
            ps.setString(15, t.getMedicineItemName());

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
        String sql = "update medicine set medicine_code = ?, medicine_name = ?, medicine_manufacturing_date = ?, medicine_expiration_date = ?, medicine_batch_no = ?, medicine_buying_price = ?, medicine_quantity = ?, medicine_discount = ?, medicine_vat = ?, medicine_total_amounnt = ?, medicine_selling_percent = ?, sales_selling_price = ?, branch_location = ?, company_name = ?, medicine_item_name = ? where medicine_code = ?";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getMedicineCode());
            ps.setString(2, t.getMedicineName());
            ps.setDate(3, new Date(t.getMedicineManufacturingDate().getTime()));
            ps.setDate(4, new Date(t.getMedicineExpirationDate().getTime()));
            ps.setString(5, t.getMedicineBatchNo());
            ps.setString(6, Double.valueOf(t.getMedicineBuyingPrice()).toString());
            ps.setString(7, Double.valueOf(t.getMedicineQuantity()).toString());
            ps.setString(8, Double.valueOf(t.getMedicineDiscount()).toString());
            ps.setString(9, Double.valueOf(t.getMedicineVat()).toString());
            ps.setString(10, Double.valueOf(t.getMedicineTotalAmounnt()).toString());
            ps.setString(11, Double.valueOf(t.getMedicineSellingPercent()).toString());
            ps.setString(12, Double.valueOf(t.getSalesSellingPrice()).toString());
            ps.setString(13, t.getBranchLocation());
            ps.setString(14, t.getCompanyName());
            ps.setString(15, t.getMedicineItemName());
            ps.setString(16, t.getMedicineCode());

            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
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
        String sql = "delete from medicine where medicine_code = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getMedicineCode());

            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MedicineDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                medicine.setMedicineManufacturingDate(rs.getDate("medicine_manufacturing_date"));
                medicine.setMedicineExpirationDate(rs.getDate("medicine_expiration_date"));
                medicine.setMedicineBatchNo(rs.getString("medicine_batch_no"));
                medicine.setMedicineBuyingPrice(Double.valueOf(rs.getString("medicine_buying_price")));
                medicine.setMedicineQuantity(Integer.valueOf(rs.getString("medicine_quantity")));
                medicine.setMedicineDiscount(Double.valueOf(rs.getString("medicine_discount")));
                medicine.setMedicineVat(Double.valueOf(rs.getString("medicine_vat")));
                medicine.setMedicineTotalAmounnt(Double.valueOf(rs.getString("medicine_total_amounnt")));
                medicine.setMedicineSellingPercent(Double.valueOf(rs.getString("medicine_selling_percent")));
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

    public Medicine getByName(String name) {

        String sql = "select * from medicine where medicine_name = ?";
        Medicine medicine = new Medicine();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                medicine.setMedicineCode(rs.getString("id"));
                medicine.setMedicineCode(rs.getString("medicine_code"));
                medicine.setMedicineName(rs.getString("medicine_name"));
                medicine.setMedicineBuyingPrice(rs.getDouble("medicine_buying_price"));
                medicine.setMedicineQuantity(Integer.valueOf(rs.getString("medicine_quantity")));
                medicine.setMedicineDiscount(Double.valueOf(rs.getString("medicine_discount")));
                medicine.setMedicineVat(Double.valueOf(rs.getString("medicine_vat")));
                medicine.setMedicineTotalAmounnt(Double.valueOf(rs.getString("medicine_total_amounnt")));
                medicine.setMedicineSellingPercent(Double.valueOf(rs.getString("medicine_selling_percent")));
                medicine.setSalesSellingPrice(Double.valueOf(rs.getString("sales_selling_price")));
            }
        } catch (Exception e) {
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return medicine;

    }

    public int updateStock(Medicine medicine, String invoiceNo) {

        String sql = "select * from medicine where medicine_code = ?";
         int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, medicine.getMedicineCode());

            ResultSet rs = ps.executeQuery();
            int existQty = 0;
            while (rs.next()) {
                  existQty = Integer.valueOf(rs.getString("medicine_quantity"));
        String sql1 = "insert into selling (medicine_code, medicine_name, medicine_manufacturing_date, medicine_expiration_date, medicine_batch_no, medicine_buying_price, medicine_quantity, medicine_discount, medicine_vat, medicine_total_amounnt, medicine_selling_percent, sales_selling_price, branch_location, company_name, medicine_item_name, status, invoice_no) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql1);
            ps.setString(1, rs.getString("medicine_code"));
            ps.setString(2, rs.getString("medicine_name"));
            ps.setDate(3, rs.getDate("medicine_manufacturing_date"));
            ps.setDate(4, rs.getDate("medicine_expiration_date"));
            ps.setString(5, rs.getString("medicine_batch_no"));
            ps.setDouble(6, rs.getDouble("medicine_buying_price"));
            ps.setInt(7, medicine.getMedicineQuantity());
            
            ps.setDouble(8, rs.getDouble("medicine_discount"));
            ps.setDouble(9, rs.getDouble("medicine_vat"));
            ps.setDouble(10, rs.getDouble("medicine_total_amounnt"));
            ps.setDouble(11, rs.getDouble("medicine_selling_percent"));
            ps.setDouble(12, rs.getDouble("sales_selling_price"));
            ps.setString(13, rs.getString("branch_location"));
            ps.setString(14, rs.getString("company_name"));
            ps.setString(15, rs.getString("medicine_item_name"));
            ps.setString(16, "SOLD");
            ps.setString(17, invoiceNo);

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
                String update_sql = "update medicine set medicine_quantity = ? where  medicine_code = ?";
               
                try {
                    con = DBConnection.getConnection();
                    ps = con.prepareStatement(update_sql);
                    ps.setInt(1, (existQty - medicine.getMedicineQuantity()));
                    ps.setString(2, medicine.getMedicineCode());
                    status = ps.executeUpdate();
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    try {
                        ps.close();
                        con.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(BranchDao.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        } catch (Exception e) {
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }

        return status;
    }

}
