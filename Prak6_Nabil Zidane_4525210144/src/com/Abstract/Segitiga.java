package com.Abstract;

 class Segitiga extends BangunDatar{
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi, String warna){
        this.alas = alas;
        this.tinggi = tinggi;
        this.Warna = warna;
    }
    
    public void luas(){
        float luas;
        luas = 
        (float) ((this.alas * this.tinggi)/2);
        System.out.println("luas lingkaran : " + luas);
    }
}
