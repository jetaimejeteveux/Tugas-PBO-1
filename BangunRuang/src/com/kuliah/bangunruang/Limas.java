package com.kuliah.bangunruang;

public class Limas {
    double tinggi, hasil,alas,tinggiSegitiga;



    public Limas(double alas, double tinggi, double tinggiSegitiga){
        this.tinggi = tinggi;
        this.alas = alas;
        this.tinggiSegitiga = tinggiSegitiga;


    }
    double countVolume(double panjang, double lebar, double tinggi ){
        hasil = 1/6*panjang*lebar*tinggi;
        return hasil;
    }
    double countLuas(double alas, double tinggi){
        hasil = 4*(1/2*alas*tinggi);
        return hasil;
    }
}
