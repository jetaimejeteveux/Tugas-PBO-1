package com.kuliah.bangunruang;

public class Kerucut {
    double r,tinggi, hasil, s;
    public final double PI = 3.14;


    public Kerucut(double r, double tinggi, double s){
        this.r = r;
        this.tinggi = tinggi;
        this.s = s;

    }
    double countVolume(double panjang, double lebar, double tinggi ){
        hasil = 1/3*PI*r*r*tinggi;
        return hasil;
    }
    double countLuas(double panjang, double lebar){
        hasil = (PI*r*r)+(PI+r+s);
        return hasil;
    }
}
