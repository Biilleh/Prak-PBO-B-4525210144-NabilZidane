package com.Interface;

public class pengguna {
    private Handphone phone;

    public pengguna(Handphone phone){
        this.phone = phone;
    }
    void nyalakanHP(){
        this.phone.nyalakan();
    }
    void matikanHP(){
        this.phone.matikan();
    }
    void besarkanSuaraHP(){
        this.phone.matikan();
    }
    void kecilkanSuaraHP(){
        this.phone.kecilkansuara();
    }
}
