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
public class HDTTPTChitiet321 implements Serializable{
    private String idPTCT;
    private HoadonTT321 hdtt;
    private Phutung321 pt;
    private int soLuong;

    public HDTTPTChitiet321() {
    }

    public HDTTPTChitiet321(String idPTCT, HoadonTT321 hdtt, Phutung321 pt, int soLuong) {
        this.idPTCT = idPTCT;
        this.hdtt = hdtt;
        this.pt = pt;
        this.soLuong = soLuong;
    }
    
    
}
