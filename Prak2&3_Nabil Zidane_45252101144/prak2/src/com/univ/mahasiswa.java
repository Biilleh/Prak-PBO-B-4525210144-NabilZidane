package com.univ;

public class mahasiswa {
    private String npm;
    private String namaDepan;
    private String namaBelakang;
    private String tanggallahir;
    private String alamat;
    private String prodi;
    private int umur;

public mahasiswa(String npm, String namaDepan, String namaBelakang, String tanggallahir, String alamat, String prodi, int umur) {
    this.npm = npm;
    this.namaDepan = namaDepan;
    this.namaBelakang = namaBelakang;
    this.tanggallahir = tanggallahir;
    this.alamat = alamat;
    this.prodi = prodi;
    this.umur = umur;
}

public String getNpm() {
    return npm;
}

public void setNpm(String npm){
    this.npm = npm;
}

public String getNamaDepan() {
    return namaDepan;
}

public void setNamaDepan(String namaDepan){
    this.namaDepan = namaDepan;
}

public String getNamaBelakang() {
    return namaBelakang;
}

public void setNamaBelakang(String namaBelakang){
    this.namaBelakang = namaBelakang;
}

public String getTanggalLahir() {
    return tanggallahir;
}

public void setTanggalLahir(String tanggalLahir){
    this.tanggallahir = tanggalLahir;
}

public String getAlamat() {
    return alamat;
}

public void setAlamat(String alamat){
    this.alamat = alamat;
}

public String getprodi() {
    return prodi;
}

public void setprodi(String prodi){
    this.prodi = prodi;
}

public int getUmur() {
    return umur;
}

public void setUmur(int umur){
    this.umur = umur;
}

public void belajar(){
    System.out.println(namaDepan + " sedang belajar ");
}

public void ujian(){
    System.out.println(namaDepan + " sedang ujian ");
}

public void displayinfo() {
    System.out.println("=== Data Mahasiswa ===");
    System.out.println("NPM            : " +npm);
    System.out.println("Nama Depan     : " + namaDepan);
    System.out.println("Nama Belakang  : " + namaBelakang);
    System.out.println("Tanggal Lahir  : " + tanggallahir);
    System.out.println("Alamat         : " + alamat);
    System.out.println("Prodi          : " + prodi);
    System.out.println("Umur           : " + umur);
    System.out.println();
}
}