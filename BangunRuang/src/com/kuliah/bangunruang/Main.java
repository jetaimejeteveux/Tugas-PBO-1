package com.kuliah.bangunruang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Character ulang;
        do {
        System.out.println("1.Balok");
        System.out.println("2.Kerucut");
        System.out.println("3.Limas");
        System.out.println("Pilih menu: ");
        int a = input.nextInt();


            switch (a) {
                case 1:
                    System.out.println("masukkan panjang : ");
                    int panjang = input.nextInt();
                    System.out.println("masukkan lebar : ");
                    int lebar = input.nextInt();
                    System.out.println("masukkan tinggi : ");
                    int tinggi = input.nextInt();

                    Balok balok = new Balok(panjang, lebar, tinggi);
                    System.out.print("Luas = " + balok.countLuas(panjang, lebar));
                    System.out.print("\nVolume = " + balok.countVolume(panjang, lebar, tinggi));
                    break;
                case 2:
                    System.out.println("masukkan jari2 : ");
                    int r = input.nextInt();
                    System.out.println("masukkan s : ");
                    int s = input.nextInt();
                    System.out.println("masukkan tinggi : ");
                    int tinggiKerucut = input.nextInt();


                    Kerucut kerucut = new Kerucut(r, tinggiKerucut, s);
                    System.out.print("Luas = " + kerucut.countLuas(r, s));
                    System.out.print("\nVolume = " + kerucut.countVolume(r, s, tinggiKerucut));
                    break;
                case 3:
                    System.out.println("masukkan tinggi Limas : ");
                    int tinggiLimas = input.nextInt();
                    System.out.println("masukkan s : ");
                    int alasSegitiga = input.nextInt();
                    System.out.println("masukkan tinggi Segitiga : ");
                    int tinggiSegitiga = input.nextInt();


                    Limas limas = new Limas(tinggiLimas, alasSegitiga, tinggiSegitiga);
                    System.out.print("Luas = " + limas.countLuas(alasSegitiga, tinggiSegitiga));
                    System.out.print("\nVolume = " + limas.countVolume(alasSegitiga, tinggiSegitiga, tinggiLimas));
                    break;

            }
            System.out.println("\n Mau ngulang ngga ? ");
            ulang = input.next().charAt(0);
        }while (ulang=='Y'||ulang=='y');


    }
}
