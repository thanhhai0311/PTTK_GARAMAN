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
public class Khachhang321 extends Thanhvien321 implements Serializable{

    public Khachhang321() {
    }

    public Khachhang321(String idTH, String ten, String diaChi, String sdt, String email, String username, String password, Date ngaySinh) {
        super(idTH, ten, diaChi, sdt, email, username, password, ngaySinh);
    }
    
}
