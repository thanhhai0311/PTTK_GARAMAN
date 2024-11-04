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
public class Hoadonnhap321 implements Serializable{
    private String idHDN;
    private Kho321 kho;
    private Nhacungcap321 ncc;
    private NVKho321 nvk;

    public Hoadonnhap321() {
    }

    public Hoadonnhap321(String idHDN, Kho321 kho, Nhacungcap321 ncc, NVKho321 nvk) {
        this.idHDN = idHDN;
        this.kho = kho;
        this.ncc = ncc;
        this.nvk = nvk;
    }

    
    
    
}
