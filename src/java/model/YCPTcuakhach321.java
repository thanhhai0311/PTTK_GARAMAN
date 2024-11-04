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
public class YCPTcuakhach321 implements Serializable{
    private String idYCPT;
    private YCcuakhach321 yc;
    private Phutung321 pt;
    private int soLuong;

    public YCPTcuakhach321() {
    }

    public YCPTcuakhach321(String idYCPT, YCcuakhach321 yc, Phutung321 pt, int soLuong) {
        this.idYCPT = idYCPT;
        this.yc = yc;
        this.pt = pt;
        this.soLuong = soLuong;
    }
    
    
}
