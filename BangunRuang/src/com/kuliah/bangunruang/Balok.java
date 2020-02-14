package com.kuliah.bangunruang;

public class Balok {
    double panjang, lebar, tinggi, hasil;


    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    double countVolume(double panjang, double lebar, double tinggi ){
        hasil = panjang*lebar*tinggi;
        return hasil;
    }
    double countLuas(double panjang, double lebar){
        hasil = panjang*lebar;
        return hasil;
    }
}
