/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Assignment;
import model.HomeWork;
import model.Student;

/**
 *
 * @author Hieu
 */
public class ControllerImp implements Controller {

    @Override
    public <T> List<T> readDataFromFile(String fileName) {
        List<T> list = new ArrayList<>();
        File file = new File(fileName);
        if (file.exists()) {
            try {
                file.createNewFile();
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Object o = ois.readObject();
                list = (List<T>) o;
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(ControllerImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControllerImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    @Override
    public <T> void writeToFile(List<T> list, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(ControllerImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public <T> void sortByName(List<T> list) {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(T t1, T t2) {
                if (t1 instanceof Student) {
                    Student s1 = (Student) t1;
                    Student s2 = (Student) t2;
                    String fullname1 = s1.getTen().toLowerCase().trim();
                    String fullname2 = s2.getTen().toLowerCase().trim();
                    String name1 = fullname1.substring(fullname1.lastIndexOf(" "));
                    String name2 = fullname2.substring(fullname2.lastIndexOf(" "));
                    return name1.compareTo(name2);
                }
                if (t1 instanceof Assignment) {
                    Assignment a1 = (Assignment) t1;
                    Assignment a2 = (Assignment) t2;
                    String fullname1 = a1.getStudent().getTen().toLowerCase().trim();
                    String fullname2 = a2.getStudent().getTen().toLowerCase().trim();
                    String name1 = fullname1.substring(fullname1.lastIndexOf(" "));
                    String name2 = fullname2.substring(fullname2.lastIndexOf(" "));
                    return name1.compareTo(name2);
                }
                if(t1 instanceof HomeWork) {
                    HomeWork h1 = (HomeWork) t1;
                    HomeWork h2 = (HomeWork) t2;
                    String type1 = h1.getType().trim();
                    String type2 = h2.getType().trim();
                    return type1.compareTo(type2);
                }
                return 0;
            }
        });
    }

    @Override
    public <T> void sortByTotalTime(List<T> list) {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(T t1, T t2) {
                if (t1 instanceof Assignment) {
                    Assignment a1 = (Assignment) t1;
                    Assignment a2 = (Assignment) t2;
                    if (a2.getTotalTime() > a1.getTotalTime()){
                        return 1;
                    } else return -1;
                }
                else if(t1 instanceof HomeWork) {
                    HomeWork h1 = (HomeWork) t1;
                    HomeWork h2 = (HomeWork) t2;
                    if(h1.getTotalTime() > h2.getTotalTime()) return 1;
                    else return -1;
                }
                return 0;
            }
        });
    }

    @Override
    public <T> void sortByAddress(List<T> list) {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(T t1, T t2) {
                if(t1 instanceof Student) {
                    Student s1 = (Student) t1;
                    Student s2 = (Student) t2;
                    String add1 = s1.getAddress().trim();
                    String add2 = s2.getAddress().trim();
                    return add1.compareTo(add2);
                }
                return 0;
            }
        });
    }

    @Override
    public <T> void sortByClass(List<T> list) {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(T t1, T t2) {
                if(t1 instanceof Student) {
                    Student s1 = (Student) t1;
                    Student s2 = (Student) t2;
                    String c1 = s1.getLop().trim();
                    String c2 = s2.getLop().trim();
                    return c1.compareTo(c2);
                }
                return 0;
            }
        });
    }

    @Override
    public void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }

    @Override
    public String toString(char[] a) {
        StringBuilder b = new StringBuilder();
        int iMax = a.length - 1;
        for(int i = 0; ;i++){
            b.append(a[i]);
            if(i == iMax) return b.toString();
        }
    }

}
