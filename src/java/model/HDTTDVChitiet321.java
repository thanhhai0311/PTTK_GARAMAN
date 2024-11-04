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
public class HDTTDVChitiet321 implements Serializable{
    private String idDVCT;
    private HoadonTT321 hdtt;
    private Dichvu321 dv;
    private int soLuong;

    public HDTTDVChitiet321() {
    }

    public HDTTDVChitiet321(String idDVCT, HoadonTT321 hdtt, Dichvu321 dv, int soLuong) {
        this.idDVCT = idDVCT;
        this.hdtt = hdtt;
        this.dv = dv;
        this.soLuong = soLuong;
    }
    
    
}
