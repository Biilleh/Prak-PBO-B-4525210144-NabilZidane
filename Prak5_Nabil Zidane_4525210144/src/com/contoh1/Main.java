package com.contoh1;

public class Main {
     public static void main(String[] args){
        Dokter Nabil = new Dokter("Nabil");
        Dokter Andi = new Dokter("Andi");
        Pasien Agus = new Pasien("Agus");
        Pasien Zidane = new Pasien("Zidane");

        Nabil.tambahPasien(Agus);
        Andi.tambahPasien(Zidane);
        Andi.tambahPasien(Agus);

        Andi.tampikanPasien();
        Agus.tampilkanDokter();
        Nabil.periksa(Zidane);
     }    

}
