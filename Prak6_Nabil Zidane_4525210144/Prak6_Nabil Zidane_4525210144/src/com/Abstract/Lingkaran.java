package com.Abstract;

    public class Lingkaran extends BangunDatar{
        private int jari2;

        public Lingkaran(int jari2,String warna){
            this.jari2 = jari2;
            this.Warna = warna;
        }

        public void luas(){
            float luas;
            luas =(float) ((22.0/7)) * this.jari2 * this.jari2;
            System.out.println("luas lingkaran : " + luas);
        }
    }
