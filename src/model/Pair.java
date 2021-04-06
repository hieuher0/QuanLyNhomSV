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
public class Pair<K, V> implements Serializable {
    private K homeWork;
    private V totalSV;

    public Pair() {
    }

    public Pair(K homeWork, V totalSV) {
        this.homeWork = homeWork;
        this.totalSV = totalSV;
    }

    public K getHomeWork() {
        return homeWork;
    }

    public V getTotalSV() {
        return totalSV;
    }

    public void setHomeWork(K homeWork) {
        this.homeWork = homeWork;
    }

    public void setTotalSV(V totalSV) {
        this.totalSV = totalSV;
    }
    
}
