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
public class Kho321 implements Serializable{
    private String idKho, ten, diaChi;

    public Kho321() {
    }

    public Kho321(String idKho, String ten, String diaChi) {
        this.idKho = idKho;
        this.ten = ten;
        this.diaChi = diaChi;
    }
    
    
}
