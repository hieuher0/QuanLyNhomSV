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
public class HomeWork implements Serializable{
    private int id;
    private String name;
    private String type;
    private float totalTime;
    private static int sId = 100;

    public HomeWork() {
        this.id = sId++;
    }

    public HomeWork(String name, String type, float totalTime) {
        this.id = sId++;
        this.name = name;
        this.type = type;
        this.totalTime = totalTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float getTotalTime() {
        return totalTime;
    }

    public int getsId() {
        return sId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public static void setsId(int sId) {
        HomeWork.sId = sId;
    }
    
    
}
