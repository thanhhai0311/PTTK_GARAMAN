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
public class HoadonTT321 implements Serializable{
    private String idHDTT;
    private NVBanhang321 nvbh;
    private Khachhang321 kh;

    public HoadonTT321() {
    }

    public HoadonTT321(String idHDTT, NVBanhang321 nvbh, Khachhang321 kh) {
        this.idHDTT = idHDTT;
        this.nvbh = nvbh;
        this.kh = kh;
    }
    
    
}
