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
public class PTtrongKho321 implements Serializable{
    private Kho321 kho;
    private Phutung321 pt;
    private int soLuong;

    public PTtrongKho321() {
    }

    public PTtrongKho321(Kho321 kho, Phutung321 pt, int soLuong) {
        this.kho = kho;
        this.pt = pt;
        this.soLuong = soLuong;
    }
    
    
}
