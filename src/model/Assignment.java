/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hieu
 */
public class Assignment implements Serializable{
    private List<Pair<HomeWork, Integer>> pairs;
    private Student student;
    private float totalTime;
    private int stt;

    public float getTotalTime() {
        this.totalTime = 0;
        for (Pair<HomeWork, Integer> pair : pairs) {
            totalTime += pair.getHomeWork().getTotalTime();
        }
        return totalTime;
    }
    
    public Assignment() {
        pairs = new ArrayList<>();
    }

    public Assignment(Pair<HomeWork, Integer> pair, Student student) {
        this();
        this.pairs.add(pair);
        this.student = student;
    }

    public List<Pair<HomeWork, Integer>> getPairs() {
        return pairs;
    }

    public Student getStudent() {
        return student;
    }

    public void setPairs(List<Pair<HomeWork, Integer>> pairs) {
        this.pairs = pairs;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void addPairs(Pair<HomeWork, Integer> pair) {
        this.pairs.add(pair);
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getStt() {
        return stt;
    }
    
}
