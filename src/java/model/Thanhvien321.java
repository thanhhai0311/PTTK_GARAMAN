/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Thanhvien321 implements Serializable{
    private String idTV, ten, diaChi, sdt, email, username, password;
    private Date ngaySinh;

    public Thanhvien321() {
    }

    public Thanhvien321(String idTV, String ten, String diaChi, String sdt, String email, String username, String password, Date ngaySinh) {
        this.idTV = idTV;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.username = username;
        this.password = password;
        this.ngaySinh = ngaySinh;
    }
    
    
    
}
