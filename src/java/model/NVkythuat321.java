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
public class NVkythuat321 extends Nhanvien321 implements Serializable{

    public NVkythuat321() {
    }

    public NVkythuat321(String viTri, String idTH, String ten, String diaChi, String sdt, String email, String username, String password, Date ngaySinh) {
        super(viTri, idTH, ten, diaChi, sdt, email, username, password, ngaySinh);
    }
    
}