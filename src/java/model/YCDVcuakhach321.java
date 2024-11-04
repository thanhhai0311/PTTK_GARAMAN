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
public class YCDVcuakhach321 implements Serializable{
    private String idYCDV;
    private Dichvu321 dv;
    private YCcuakhach321 yc;
    private NVkythuat321 nvkt;

    public YCDVcuakhach321() {
    }

    
    
    public YCDVcuakhach321(String idYCDV, Dichvu321 dv, YCcuakhach321 yc, NVkythuat321 nvkt) {
        this.idYCDV = idYCDV;
        this.dv = dv;
        this.yc = yc;
        this.nvkt = nvkt;
    }
}
