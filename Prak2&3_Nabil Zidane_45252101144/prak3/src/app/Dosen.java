package app;

public class Dosen extends Karyawam{
    private String NIDN;

    public Dosen(String var1, String var2, String var3){
        super(var1, var2);
        this.NIDN = var3;
    }

    public void setNIDN(String var1) {
        this.NIDN = var1;
    }

    public void getNIDN() {
        System.out.println("NIDN: " + this.NIDN);
    }

    @Override 
    public void absenPagi() {
        System.out.println(this.nama + ": absen pagi");
    }

    public void mengajar() {
        System.out.println(this.nama + ": sedang mengajar");
    }

    @Override 
    public void absenPulang() {
        System.out.println(this.nama + ": absen pulang");
    }

    @Override 
    public void getinfo() {
        System.out.println("kode karyawan : " + this.KodeKaryawan);
        System.out.println("Nama : " + this.nama);
        System.out.println("NIDN : " + this.NIDN);
    }
}
