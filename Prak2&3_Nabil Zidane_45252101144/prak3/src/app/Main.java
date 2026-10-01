package app;

public class Main {
    public static void main(String[] args) throws Exception {
        Karyawam Ridho = new Karyawam("12345","Ridho");
        Ridho.getinfo();
        Ridho.absenPagi();
        Ridho.absenPulang();

        System.out.println();

        Karyawam Melan = new Karyawam("12346","Melan");
        Melan.getinfo();
        Melan.absenPagi();
        Melan.absenPulang();

        System.out.println();

        Dosen Andiani = new Dosen("23455","Andiani", "332211");
        Andiani.getinfo();
        Andiani.absenPagi();
        Andiani.mengajar();
        Andiani.absenPulang();

        System.out.println();

        Dosen Ionia = new Dosen("23456","Ionia", "332212");
        Ionia.getinfo();
        Ionia.absenPagi();
        Ionia.mengajar();
        Ionia.absenPulang();

        System.out.println();
    }
}
