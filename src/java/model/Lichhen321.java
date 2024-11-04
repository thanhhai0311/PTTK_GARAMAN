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
public class Lichhen321 implements Serializable{
    private String idLich;
    private Khachhang321 kh;
    private Date thoiGian;
    private String moTa;

    public Lichhen321() {
    }

    public Lichhen321(String idLich, Khachhang321 kh, Date thoiGian, String moTa) {
        this.idLich = idLich;
        this.kh = kh;
        this.thoiGian = thoiGian;
        this.moTa = moTa;
    }
    
    
}
