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
public class YCcuakhach321 implements Serializable{
    private String idYC;
    private Khachhang321 kh;
    private NVBanhang321 nvbh;

    public YCcuakhach321() {
    }

    
    public YCcuakhach321(String idYC, Khachhang321 kh, NVBanhang321 nvbh) {
        this.idYC = idYC;
        this.kh = kh;
        this.nvbh = nvbh;
    }
     
}
