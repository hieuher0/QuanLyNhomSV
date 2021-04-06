/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Hieu
 */
public class Student implements Serializable{
    private int id;
    private String ten;
    private String address;
    private String lop;
    private static int sId = 10000;

    public Student() {
        this.id = sId++;
    }

    public Student(String ten, String address, String lop) {
        this.id = sId++;
        this.ten = ten;
        this.address = address;
        this.lop = lop;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getAddress() {
        return address;
    }

    public String getLop() {
        return lop;
    }

    public int getsId() {
        return sId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public static void setsId(int sId) {
        Student.sId = sId;
    }
}
