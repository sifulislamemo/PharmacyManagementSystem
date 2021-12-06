/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.dao;

import com.pharmacy.common.ICommonInterface;
import com.pharmacy.model.Company;
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
public class CompanyDao implements ICommonInterface<Company>{
Connection con;
    PreparedStatement ps;
    @Override
    public int save(Company t) {
 String sql = "insert into company (company_code, company_name, company_contract_no, company_address) values (?, ?, ?, ?)";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getCompanyCode());
            ps.setString(2, t.getCompanyName());
            ps.setString(3, t.getCompanyContractNo());
            ps.setString(4, t.getCompanyAddress());
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
    public int update(Company t) {
        String sql = "update company set company_code = ?, company_name = ?, company_contract_no = ?, company_address = ? where company_code = ?";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
             ps.setString(1, t.getCompanyCode());
            ps.setString(2, t.getCompanyName());
            ps.setString(3, t.getCompanyContractNo());
            ps.setString(4, t.getCompanyAddress());
            ps.setString(5, t.getCompanyCode());
            
           
            
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
    public int delete(Company t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Company getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Company> getAll() {
        String sql = "select * from company";
        List<Company> c = new ArrayList<Company>();
        try  {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while(rs.next()){
                System.out.println(rs.getString("company_code"));
                Company company = new Company();
                company.setId(rs.getInt("id"));
                company.setCompanyCode(rs.getString("company_code"));
                company.setCompanyName(rs.getString("company_name"));
                company.setCompanyContractNo(rs.getString("company_contract_no"));
                company.setCompanyAddress(rs.getString("company_address"));
                c.add(company);
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
        System.out.println(c);
        return c;
        }
    }
    

