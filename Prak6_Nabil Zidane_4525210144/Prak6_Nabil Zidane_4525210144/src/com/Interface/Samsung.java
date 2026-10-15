package com.Interface;

public class Samsung implements  Handphone{
    private int volume;
    private boolean menyala;

    public Samsung() {
        this.volume=50;
    }
    @Override 
    public void nyalakan(){
        menyala = true;
        System.out.println("handphone menyala....");
        System.out.println("selamat datang di samsung");
        System.out.println("android version 30");
    }
    @Override 
    public void matikan(){
    menyala = false;
    System.out.println("hp dimatikan");
    }
    @Override 
    public void besarkansuara() {
        if (menyala){
            if(this.volume == MAX_VOLUME) {
                System.out.println("volume full");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume +=10;
                System.out.println("volume sekarang : " + this.getVolume());
            }
        }else{
                System.out.println("nyalain dului hpnya kocak!!!");
            }
    }
    @Override 
    public void kecilkansuara(){
        if(menyala){
            if(this.volume ==MIN_VOLUME){
                System.out.println("volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Orangmah nyalain hpnya dulu");
            }
        }
    }
    public int getVolume(){
        return this.volume;
    }
}
