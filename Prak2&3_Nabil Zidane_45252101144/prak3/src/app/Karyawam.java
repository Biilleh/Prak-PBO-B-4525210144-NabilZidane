package app;

public class Karyawam {
    protected String KodeKaryawan;
    protected String nama;

    public Karyawam(String var1, String var2) {
        this.KodeKaryawan = var1;
        this.nama = var2;
    }

    public void absenPagi() {
        System.out.println(this.nama + " : absen pagi");
    }

    public void kerja() {
        System.out.println(this.nama + " : sedang kerja");
    }

    public void absenPulang() {
        System.out.println(this.nama + " : absen pulang");
    }

    public void getinfo() {
        System.out.println("Kode Karyawan : " + this.KodeKaryawan);
        System.out.println("nama : " + this.nama);
    }

}
