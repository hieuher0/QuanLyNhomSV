/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;

/**
 *
 * @author Hieu
 */
public interface Controller {
    <T> List<T> readDataFromFile(String fileName);
    <T> void writeToFile(List<T> list, String fileName);
    <T> void sortByName(List<T> list);
    <T> void sortByTotalTime(List<T> list);
    <T> void sortByAddress(List<T> list);
    <T> void sortByClass(List<T> list);
    void deleteFile(String fileName);
    String toString(char[] arrayChar);
}
