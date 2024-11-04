/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class HDNChitiet321 implements Serializable{
    private String idHDNCT;
    private Hoadonnhap321 hdn;
    private Phutung321 pt;
    private int soLuong;

    public HDNChitiet321() {
    }

    public HDNChitiet321(String idHDNCT, Hoadonnhap321 hdn, Phutung321 pt, int soLuong) {
        this.idHDNCT = idHDNCT;
        this.hdn = hdn;
        this.pt = pt;
        this.soLuong = soLuong;
    }

    
    
    
}
