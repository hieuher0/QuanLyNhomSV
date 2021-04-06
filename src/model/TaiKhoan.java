/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class TaiKhoan implements Serializable {
    private String id,matkhau;

    public TaiKhoan(String id, String matkhau) {
        this.id = id;
        this.matkhau = matkhau;
    }

    public TaiKhoan() {
    }

    public String getId() {
        return id;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    
}
