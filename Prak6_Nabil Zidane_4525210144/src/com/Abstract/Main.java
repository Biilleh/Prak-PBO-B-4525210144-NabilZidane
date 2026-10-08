package com.Abstract;

public class Main {
    public static  void main(String[] args) throws Exception{
        Segitiga s1 = new Segitiga(200, 50, "merah");
        Lingkaran l1 = new Lingkaran(10, "biru");
        s1.luas();
        l1.luas();
    }
}
