package com.univ;

public class main {
    public static void main(String[] args) {  
    mahasiswa nabil = new mahasiswa(
        "4525210144", 
        "nabil", 
        "zidane", 
        "07 juli 2006", 
        "jakarta timur", 
        20
    );
     mahasiswa zidane = new mahasiswa(
        "4525210144", 
        "zidane", 
        "nabil", 
        "07 juli 2006", 
        "jakarta timur", 
        19
    );
        zidane.displayinfo();
        nabil.displayinfo();

        //pangil method belajar dan ujian
        zidane.belajar();
        nabil.ujian();
    }
}
