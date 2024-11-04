/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DAO.con;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Dichvu321;

/**
 *
 * @author Admin
 */
public class Dichvu321DAO extends DAO{

    public Dichvu321DAO() {
        super();
    }
    
    public List<Dichvu321> getDVtheoten(String ten) {
        List<Dichvu321> dichvu321s = new ArrayList<>();

        try {
 
            String sql = "{call getDVtheoten(?)}";

            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, ten);

            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                Dichvu321 dv = new Dichvu321();
                dv.setIdDV(rs.getString("idDV"));
                dv.setTen(rs.getString("ten"));
                dv.setMoTa(rs.getString("moTa"));
                dv.setDonGia(rs.getFloat("donGia"));
                dichvu321s.add(dv);
            }
        } catch (Exception e) {
            e.printStackTrace();
            dichvu321s = null;
        }

        return dichvu321s;
    }
    
    public static void main(String[] args) {
        Dichvu321DAO dvDAO = new Dichvu321DAO();

        List<Dichvu321> list = dvDAO.getDVtheoten("ffff");
        //System.out.println(list);
        if (!list.isEmpty()) {
            for (Dichvu321 dichvu321 : list) {
                System.out.println(dichvu321);
            }
        }
        
    }
}
