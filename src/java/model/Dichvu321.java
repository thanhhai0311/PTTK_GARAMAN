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
public class Dichvu321 implements Serializable{
    private String idDV, ten, moTa;
    private float donGia;

    public Dichvu321() {
    }

    public Dichvu321(String idDV, String ten, String moTa, float donGia) {
        this.idDV = idDV;
        this.ten = ten;
        this.moTa = moTa;
        this.donGia = donGia;
    } 

    public String getIdDV() {
        return idDV;
    }

    public void setIdDV(String idDV) {
        this.idDV = idDV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Dichvu321{" + "idDV=" + idDV + ", ten=" + ten + ", moTa=" + moTa + ", donGia=" + donGia + '}';
    }
    
    
    
}
