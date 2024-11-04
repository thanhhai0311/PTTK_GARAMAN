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
public class Phutung321 implements Serializable{
    private String idPT, ten, moTa;
    private float donGia;

    public Phutung321() {
    }

    public Phutung321(String idPT, String ten, String moTa, float donGia) {
        this.idPT = idPT;
        this.ten = ten;
        this.moTa = moTa;
        this.donGia = donGia;
    }
    
    
}
